#include <stdlib.h>
#include <stdint.h>
#include <stdio.h>
#include <assert.h>

#include "util.h"
#include "adios_transforms_hooks_read.h"
#include "adios_transforms_reqgroup.h"

#ifdef ALACRITY

#include "alacrity.h"

int adios_transform_alacrity_generate_read_subrequests(adios_transform_read_request *reqgroup,
                                                    adios_transform_pg_read_request *pg_reqgroup)
{
    assert(reqgroup && pg_reqgroup);

    adios_transform_raw_read_request *subreq = adios_transform_raw_read_request_new_whole_pg(pg_reqgroup, malloc(pg_reqgroup->raw_var_length));
    adios_transform_raw_read_request_append(pg_reqgroup, subreq);

    return 0;
}

// Do nothing for individual subrequest
adios_datablock * adios_transform_alacrity_subrequest_completed(adios_transform_read_request *reqgroup,
                                                                adios_transform_pg_read_request *pg_reqgroup,
                                                                adios_transform_raw_read_request *completed_subreq)
{
    return NULL;
}



adios_datablock * adios_transform_alacrity_pg_reqgroup_completed(adios_transform_read_request *reqgroup,
                                                                 adios_transform_pg_read_request *completed_pg_reqgroup)
{
    uint64_t compressed_len = completed_pg_reqgroup->raw_var_length;
    void* compressed_buff = completed_pg_reqgroup->subreqs->data; // Buffer from first subreq

    uint64_t decompressed_len = adios_get_type_size (reqgroup->transinfo->orig_type, "");
    int d = 0;
    for(d = 0; d < reqgroup->transinfo->orig_ndim; d++) {
        decompressed_len *= completed_pg_reqgroup->orig_varblock->count[d];
    }

    void *decompressed_buff = malloc(decompressed_len);
    ALPartitionData output_partition;
    uint64_t numElements = 0;

    // Decompress into output_partition from compressed_buf
    memstream_t ms = memstreamInitReturn (compressed_buff);

    // Deserialize the ALPartitionData from memstream
    ALDeserializePartitionData (&output_partition, &ms);

    // Decode ALPartitionData into decompresed buffer
    int rtn = ALDecode (&output_partition, decompressed_buff, &numElements);
    if (ALErrorNone != rtn) {
        if (decompressed_buff) {
            free(decompressed_buff);
            decompressed_buff = NULL;
        }
        return NULL;
    }

    ALPartitionDataDestroy(&output_partition);

    return adios_datablock_new(reqgroup->transinfo->orig_type,
                               completed_pg_reqgroup->timestep,
                               completed_pg_reqgroup->pg_bounds_sel,
                               decompressed_buff);
}

adios_datablock * adios_transform_alacrity_reqgroup_completed(adios_transform_read_request *completed_reqgroup)
{
    return NULL;
}


#else

DECLARE_TRANSFORM_READ_METHOD_UNIMPL(alacrity);

#endif

