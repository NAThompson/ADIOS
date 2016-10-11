/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ornl.adios.adioslib;

public class adioslibJNI {
  public final static native int MPI_SUCCESS_get();
  public final static native int MPI_ERR_BUFFER_get();
  public final static native int MPI_ERR_COUNT_get();
  public final static native int MPI_ERR_TYPE_get();
  public final static native int MPI_ERR_TAG_get();
  public final static native int MPI_ERR_COMM_get();
  public final static native int MPI_MAX_ERROR_STRING_get();
  public final static native int MPI_BYTE_get();
  public final static native int MPI_INFO_NULL_get();
  public final static native int MPI_COMM_NULL_get();
  public final static native int MPI_COMM_WORLD_get();
  public final static native int MPI_COMM_SELF_get();
  public final static native int MPI_INT_get();
  public final static native int MPI_CHAR_get();
  public final static native int MPI_DOUBLE_get();
  public final static native int MPI_ANY_SOURCE_get();
  public final static native int MPI_ANY_TAG_get();
  public final static native int MPI_SUM_get();
  public final static native int MPI_MAX_PROCESSOR_NAME_get();
  public final static native int MPI_Init(long jarg1, long jarg2);
  public final static native int MPI_Finalize();
  public final static native int MPI_Initialized(long jarg1);
  public final static native int MPI_Barrier(int jarg1);
  public final static native int MPI_Bcast(long jarg1, int jarg2, int jarg3, int jarg4, int jarg5);
  public final static native int MPI_Comm_dup(int jarg1, long jarg2);
  public final static native int MPI_Comm_rank(int jarg1, long jarg2);
  public final static native int MPI_Comm_size(int jarg1, long jarg2);
  public final static native int MPI_Comm_free(long jarg1);
  public final static native int MPI_Comm_f2c(int jarg1);
  public final static native int MPI_Gather(long jarg1, int jarg2, int jarg3, long jarg4, int jarg5, int jarg6, int jarg7, int jarg8);
  public final static native int MPI_Gatherv(long jarg1, int jarg2, int jarg3, long jarg4, long jarg5, long jarg6, int jarg7, int jarg8, int jarg9);
  public final static native int MPI_Allgather(long jarg1, int jarg2, int jarg3, long jarg4, int jarg5, int jarg6, int jarg7);
  public final static native int MPI_Scatter(long jarg1, int jarg2, int jarg3, long jarg4, int jarg5, int jarg6, int jarg7, int jarg8);
  public final static native int MPI_Scatterv(long jarg1, long jarg2, long jarg3, int jarg4, long jarg5, int jarg6, int jarg7, int jarg8, int jarg9);
  public final static native int MPI_File_open(int jarg1, String jarg2, int jarg3, int jarg4, long jarg5);
  public final static native int MPI_File_close(long jarg1);
  public final static native int MPI_File_get_size(int jarg1, long jarg2);
  public final static native int MPI_File_read(int jarg1, long jarg2, int jarg3, int jarg4, long jarg5);
  public final static native int MPI_File_seek(int jarg1, java.math.BigInteger jarg2, int jarg3);
  public final static native int MPI_Get_count(long jarg1, int jarg2, long jarg3);
  public final static native int MPI_Error_string(int jarg1, String jarg2, long jarg3);
  public final static native int MPI_Comm_split(int jarg1, int jarg2, int jarg3, long jarg4);
  public final static native int MPI_Get_processor_name(String jarg1, long jarg2);
  public final static native double MPI_Wtime();
  public final static native int adios_unknown_get();
  public final static native int adios_byte_get();
  public final static native int adios_short_get();
  public final static native int adios_integer_get();
  public final static native int adios_long_get();
  public final static native int adios_unsigned_byte_get();
  public final static native int adios_unsigned_short_get();
  public final static native int adios_unsigned_integer_get();
  public final static native int adios_unsigned_long_get();
  public final static native int adios_real_get();
  public final static native int adios_double_get();
  public final static native int adios_long_double_get();
  public final static native int adios_string_get();
  public final static native int adios_complex_get();
  public final static native int adios_double_complex_get();
  public final static native int adios_string_array_get();
  public final static native int adios_flag_unknown_get();
  public final static native int adios_flag_yes_get();
  public final static native int adios_flag_no_get();
  public final static native int adios_stat_no_get();
  public final static native int adios_stat_minmax_get();
  public final static native int adios_stat_full_get();
  public final static native int adios_stat_default_get();
  public final static native int adios_stat_no_do_not_use_this_get();
  public final static native void ADIOS_FILE_fh_set(long jarg1, ADIOS_FILE jarg1_, java.math.BigInteger jarg2);
  public final static native java.math.BigInteger ADIOS_FILE_fh_get(long jarg1, ADIOS_FILE jarg1_);
  public final static native void ADIOS_FILE_nvars_set(long jarg1, ADIOS_FILE jarg1_, int jarg2);
  public final static native int ADIOS_FILE_nvars_get(long jarg1, ADIOS_FILE jarg1_);
  public final static native void ADIOS_FILE_var_namelist_set(long jarg1, ADIOS_FILE jarg1_, String[] jarg2);
  public final static native String[] ADIOS_FILE_var_namelist_get(long jarg1, ADIOS_FILE jarg1_);
  public final static native void ADIOS_FILE_nattrs_set(long jarg1, ADIOS_FILE jarg1_, int jarg2);
  public final static native int ADIOS_FILE_nattrs_get(long jarg1, ADIOS_FILE jarg1_);
  public final static native void ADIOS_FILE_attr_namelist_set(long jarg1, ADIOS_FILE jarg1_, String[] jarg2);
  public final static native String[] ADIOS_FILE_attr_namelist_get(long jarg1, ADIOS_FILE jarg1_);
  public final static native void ADIOS_FILE_nmeshes_set(long jarg1, ADIOS_FILE jarg1_, int jarg2);
  public final static native int ADIOS_FILE_nmeshes_get(long jarg1, ADIOS_FILE jarg1_);
  public final static native void ADIOS_FILE_mesh_namelist_set(long jarg1, ADIOS_FILE jarg1_, long jarg2);
  public final static native long ADIOS_FILE_mesh_namelist_get(long jarg1, ADIOS_FILE jarg1_);
  public final static native void ADIOS_FILE_nlinks_set(long jarg1, ADIOS_FILE jarg1_, int jarg2);
  public final static native int ADIOS_FILE_nlinks_get(long jarg1, ADIOS_FILE jarg1_);
  public final static native void ADIOS_FILE_link_namelist_set(long jarg1, ADIOS_FILE jarg1_, long jarg2);
  public final static native long ADIOS_FILE_link_namelist_get(long jarg1, ADIOS_FILE jarg1_);
  public final static native void ADIOS_FILE_current_step_set(long jarg1, ADIOS_FILE jarg1_, int jarg2);
  public final static native int ADIOS_FILE_current_step_get(long jarg1, ADIOS_FILE jarg1_);
  public final static native void ADIOS_FILE_last_step_set(long jarg1, ADIOS_FILE jarg1_, int jarg2);
  public final static native int ADIOS_FILE_last_step_get(long jarg1, ADIOS_FILE jarg1_);
  public final static native void ADIOS_FILE_is_streaming_set(long jarg1, ADIOS_FILE jarg1_, int jarg2);
  public final static native int ADIOS_FILE_is_streaming_get(long jarg1, ADIOS_FILE jarg1_);
  public final static native void ADIOS_FILE_path_set(long jarg1, ADIOS_FILE jarg1_, String jarg2);
  public final static native String ADIOS_FILE_path_get(long jarg1, ADIOS_FILE jarg1_);
  public final static native void ADIOS_FILE_endianness_set(long jarg1, ADIOS_FILE jarg1_, int jarg2);
  public final static native int ADIOS_FILE_endianness_get(long jarg1, ADIOS_FILE jarg1_);
  public final static native void ADIOS_FILE_version_set(long jarg1, ADIOS_FILE jarg1_, int jarg2);
  public final static native int ADIOS_FILE_version_get(long jarg1, ADIOS_FILE jarg1_);
  public final static native void ADIOS_FILE_file_size_set(long jarg1, ADIOS_FILE jarg1_, java.math.BigInteger jarg2);
  public final static native java.math.BigInteger ADIOS_FILE_file_size_get(long jarg1, ADIOS_FILE jarg1_);
  public final static native void ADIOS_FILE_internal_data_set(long jarg1, ADIOS_FILE jarg1_, long jarg2);
  public final static native long ADIOS_FILE_internal_data_get(long jarg1, ADIOS_FILE jarg1_);
  public final static native long new_ADIOS_FILE();
  public final static native void delete_ADIOS_FILE(long jarg1);
  public final static native void _ADIOS_VARSTAT_steps_set(long jarg1, _ADIOS_VARSTAT jarg1_, long jarg2, ADIOS_STAT_STEP jarg2_);
  public final static native long _ADIOS_VARSTAT_steps_get(long jarg1, _ADIOS_VARSTAT jarg1_);
  public final static native void _ADIOS_VARSTAT_blocks_set(long jarg1, _ADIOS_VARSTAT jarg1_, long jarg2, ADIOS_STAT_BLOCK jarg2_);
  public final static native long _ADIOS_VARSTAT_blocks_get(long jarg1, _ADIOS_VARSTAT jarg1_);
  public final static native void _ADIOS_VARSTAT_histogram_set(long jarg1, _ADIOS_VARSTAT jarg1_, long jarg2, ADIOS_HIST jarg2_);
  public final static native long _ADIOS_VARSTAT_histogram_get(long jarg1, _ADIOS_VARSTAT jarg1_);
  public final static native void _ADIOS_VARSTAT_min_set(long jarg1, _ADIOS_VARSTAT jarg1_, long jarg2);
  public final static native long _ADIOS_VARSTAT_min_get(long jarg1, _ADIOS_VARSTAT jarg1_);
  public final static native void _ADIOS_VARSTAT_max_set(long jarg1, _ADIOS_VARSTAT jarg1_, long jarg2);
  public final static native long _ADIOS_VARSTAT_max_get(long jarg1, _ADIOS_VARSTAT jarg1_);
  public final static native void _ADIOS_VARSTAT_avg_set(long jarg1, _ADIOS_VARSTAT jarg1_, long jarg2);
  public final static native long _ADIOS_VARSTAT_avg_get(long jarg1, _ADIOS_VARSTAT jarg1_);
  public final static native void _ADIOS_VARSTAT_std_dev_set(long jarg1, _ADIOS_VARSTAT jarg1_, long jarg2);
  public final static native long _ADIOS_VARSTAT_std_dev_get(long jarg1, _ADIOS_VARSTAT jarg1_);
  public final static native long new__ADIOS_VARSTAT();
  public final static native void delete__ADIOS_VARSTAT(long jarg1);
  public final static native void ADIOS_STAT_STEP_mins_set(long jarg1, ADIOS_STAT_STEP jarg1_, long jarg2);
  public final static native long ADIOS_STAT_STEP_mins_get(long jarg1, ADIOS_STAT_STEP jarg1_);
  public final static native void ADIOS_STAT_STEP_maxs_set(long jarg1, ADIOS_STAT_STEP jarg1_, long jarg2);
  public final static native long ADIOS_STAT_STEP_maxs_get(long jarg1, ADIOS_STAT_STEP jarg1_);
  public final static native void ADIOS_STAT_STEP_avgs_set(long jarg1, ADIOS_STAT_STEP jarg1_, long jarg2);
  public final static native long ADIOS_STAT_STEP_avgs_get(long jarg1, ADIOS_STAT_STEP jarg1_);
  public final static native void ADIOS_STAT_STEP_std_devs_set(long jarg1, ADIOS_STAT_STEP jarg1_, long jarg2);
  public final static native long ADIOS_STAT_STEP_std_devs_get(long jarg1, ADIOS_STAT_STEP jarg1_);
  public final static native long new_ADIOS_STAT_STEP();
  public final static native void delete_ADIOS_STAT_STEP(long jarg1);
  public final static native void ADIOS_STAT_BLOCK_mins_set(long jarg1, ADIOS_STAT_BLOCK jarg1_, long jarg2);
  public final static native long ADIOS_STAT_BLOCK_mins_get(long jarg1, ADIOS_STAT_BLOCK jarg1_);
  public final static native void ADIOS_STAT_BLOCK_maxs_set(long jarg1, ADIOS_STAT_BLOCK jarg1_, long jarg2);
  public final static native long ADIOS_STAT_BLOCK_maxs_get(long jarg1, ADIOS_STAT_BLOCK jarg1_);
  public final static native void ADIOS_STAT_BLOCK_avgs_set(long jarg1, ADIOS_STAT_BLOCK jarg1_, long jarg2);
  public final static native long ADIOS_STAT_BLOCK_avgs_get(long jarg1, ADIOS_STAT_BLOCK jarg1_);
  public final static native void ADIOS_STAT_BLOCK_std_devs_set(long jarg1, ADIOS_STAT_BLOCK jarg1_, long jarg2);
  public final static native long ADIOS_STAT_BLOCK_std_devs_get(long jarg1, ADIOS_STAT_BLOCK jarg1_);
  public final static native long new_ADIOS_STAT_BLOCK();
  public final static native void delete_ADIOS_STAT_BLOCK(long jarg1);
  public final static native void ADIOS_HIST_num_breaks_set(long jarg1, ADIOS_HIST jarg1_, long jarg2);
  public final static native long ADIOS_HIST_num_breaks_get(long jarg1, ADIOS_HIST jarg1_);
  public final static native void ADIOS_HIST_max_set(long jarg1, ADIOS_HIST jarg1_, double jarg2);
  public final static native double ADIOS_HIST_max_get(long jarg1, ADIOS_HIST jarg1_);
  public final static native void ADIOS_HIST_min_set(long jarg1, ADIOS_HIST jarg1_, double jarg2);
  public final static native double ADIOS_HIST_min_get(long jarg1, ADIOS_HIST jarg1_);
  public final static native void ADIOS_HIST_breaks_set(long jarg1, ADIOS_HIST jarg1_, long jarg2);
  public final static native long ADIOS_HIST_breaks_get(long jarg1, ADIOS_HIST jarg1_);
  public final static native void ADIOS_HIST_frequencies_set(long jarg1, ADIOS_HIST jarg1_, long jarg2);
  public final static native long ADIOS_HIST_frequencies_get(long jarg1, ADIOS_HIST jarg1_);
  public final static native void ADIOS_HIST_gfrequencies_set(long jarg1, ADIOS_HIST jarg1_, long jarg2);
  public final static native long ADIOS_HIST_gfrequencies_get(long jarg1, ADIOS_HIST jarg1_);
  public final static native long new_ADIOS_HIST();
  public final static native void delete_ADIOS_HIST(long jarg1);
  public final static native void _ADIOS_VARBLOCK_start_set(long jarg1, _ADIOS_VARBLOCK jarg1_, long jarg2);
  public final static native long _ADIOS_VARBLOCK_start_get(long jarg1, _ADIOS_VARBLOCK jarg1_);
  public final static native void _ADIOS_VARBLOCK_count_set(long jarg1, _ADIOS_VARBLOCK jarg1_, long jarg2);
  public final static native long _ADIOS_VARBLOCK_count_get(long jarg1, _ADIOS_VARBLOCK jarg1_);
  public final static native void _ADIOS_VARBLOCK_process_id_set(long jarg1, _ADIOS_VARBLOCK jarg1_, long jarg2);
  public final static native long _ADIOS_VARBLOCK_process_id_get(long jarg1, _ADIOS_VARBLOCK jarg1_);
  public final static native void _ADIOS_VARBLOCK_time_index_set(long jarg1, _ADIOS_VARBLOCK jarg1_, long jarg2);
  public final static native long _ADIOS_VARBLOCK_time_index_get(long jarg1, _ADIOS_VARBLOCK jarg1_);
  public final static native long new__ADIOS_VARBLOCK();
  public final static native void delete__ADIOS_VARBLOCK(long jarg1);
  public final static native int point_get();
  public final static native int cell_get();
  public final static native void _ADIOS_VARMESH_meshid_set(long jarg1, _ADIOS_VARMESH jarg1_, int jarg2);
  public final static native int _ADIOS_VARMESH_meshid_get(long jarg1, _ADIOS_VARMESH jarg1_);
  public final static native void _ADIOS_VARMESH_centering_set(long jarg1, _ADIOS_VARMESH jarg1_, int jarg2);
  public final static native int _ADIOS_VARMESH_centering_get(long jarg1, _ADIOS_VARMESH jarg1_);
  public final static native long new__ADIOS_VARMESH();
  public final static native void delete__ADIOS_VARMESH(long jarg1);
  public final static native void ADIOS_VARINFO_varid_set(long jarg1, ADIOS_VARINFO jarg1_, int jarg2);
  public final static native int ADIOS_VARINFO_varid_get(long jarg1, ADIOS_VARINFO jarg1_);
  public final static native void ADIOS_VARINFO_type_set(long jarg1, ADIOS_VARINFO jarg1_, int jarg2);
  public final static native int ADIOS_VARINFO_type_get(long jarg1, ADIOS_VARINFO jarg1_);
  public final static native void ADIOS_VARINFO_ndim_set(long jarg1, ADIOS_VARINFO jarg1_, int jarg2);
  public final static native int ADIOS_VARINFO_ndim_get(long jarg1, ADIOS_VARINFO jarg1_);
  public final static native void ADIOS_VARINFO_nsteps_set(long jarg1, ADIOS_VARINFO jarg1_, int jarg2);
  public final static native int ADIOS_VARINFO_nsteps_get(long jarg1, ADIOS_VARINFO jarg1_);
  public final static native void ADIOS_VARINFO_value_set(long jarg1, ADIOS_VARINFO jarg1_, long jarg2);
  public final static native long ADIOS_VARINFO_value_get(long jarg1, ADIOS_VARINFO jarg1_);
  public final static native void ADIOS_VARINFO_global_set(long jarg1, ADIOS_VARINFO jarg1_, int jarg2);
  public final static native int ADIOS_VARINFO_global_get(long jarg1, ADIOS_VARINFO jarg1_);
  public final static native void ADIOS_VARINFO_nblocks_set(long jarg1, ADIOS_VARINFO jarg1_, long jarg2);
  public final static native long ADIOS_VARINFO_nblocks_get(long jarg1, ADIOS_VARINFO jarg1_);
  public final static native void ADIOS_VARINFO_sum_nblocks_set(long jarg1, ADIOS_VARINFO jarg1_, int jarg2);
  public final static native int ADIOS_VARINFO_sum_nblocks_get(long jarg1, ADIOS_VARINFO jarg1_);
  public final static native void ADIOS_VARINFO_nattrs_set(long jarg1, ADIOS_VARINFO jarg1_, int jarg2);
  public final static native int ADIOS_VARINFO_nattrs_get(long jarg1, ADIOS_VARINFO jarg1_);
  public final static native void ADIOS_VARINFO_attr_ids_set(long jarg1, ADIOS_VARINFO jarg1_, long jarg2);
  public final static native long ADIOS_VARINFO_attr_ids_get(long jarg1, ADIOS_VARINFO jarg1_);
  public final static native void ADIOS_VARINFO_statistics_set(long jarg1, ADIOS_VARINFO jarg1_, long jarg2);
  public final static native long ADIOS_VARINFO_statistics_get(long jarg1, ADIOS_VARINFO jarg1_);
  public final static native void ADIOS_VARINFO_blockinfo_set(long jarg1, ADIOS_VARINFO jarg1_, long jarg2);
  public final static native long ADIOS_VARINFO_blockinfo_get(long jarg1, ADIOS_VARINFO jarg1_);
  public final static native void ADIOS_VARINFO_meshinfo_set(long jarg1, ADIOS_VARINFO jarg1_, long jarg2);
  public final static native long ADIOS_VARINFO_meshinfo_get(long jarg1, ADIOS_VARINFO jarg1_);
  public final static native java.math.BigInteger ADIOS_VARINFO_getDims(long jarg1, ADIOS_VARINFO jarg1_, int jarg2);
  public final static native long new_ADIOS_VARINFO();
  public final static native void delete_ADIOS_VARINFO(long jarg1);
  public final static native void _ADIOS_VARCHUNK_varid_set(long jarg1, _ADIOS_VARCHUNK jarg1_, int jarg2);
  public final static native int _ADIOS_VARCHUNK_varid_get(long jarg1, _ADIOS_VARCHUNK jarg1_);
  public final static native void _ADIOS_VARCHUNK_type_set(long jarg1, _ADIOS_VARCHUNK jarg1_, int jarg2);
  public final static native int _ADIOS_VARCHUNK_type_get(long jarg1, _ADIOS_VARCHUNK jarg1_);
  public final static native void _ADIOS_VARCHUNK_from_steps_set(long jarg1, _ADIOS_VARCHUNK jarg1_, int jarg2);
  public final static native int _ADIOS_VARCHUNK_from_steps_get(long jarg1, _ADIOS_VARCHUNK jarg1_);
  public final static native void _ADIOS_VARCHUNK_nsteps_set(long jarg1, _ADIOS_VARCHUNK jarg1_, int jarg2);
  public final static native int _ADIOS_VARCHUNK_nsteps_get(long jarg1, _ADIOS_VARCHUNK jarg1_);
  public final static native void _ADIOS_VARCHUNK_sel_set(long jarg1, _ADIOS_VARCHUNK jarg1_, long jarg2);
  public final static native long _ADIOS_VARCHUNK_sel_get(long jarg1, _ADIOS_VARCHUNK jarg1_);
  public final static native void _ADIOS_VARCHUNK_data_set(long jarg1, _ADIOS_VARCHUNK jarg1_, long jarg2);
  public final static native long _ADIOS_VARCHUNK_data_get(long jarg1, _ADIOS_VARCHUNK jarg1_);
  public final static native long new__ADIOS_VARCHUNK();
  public final static native void delete__ADIOS_VARCHUNK(long jarg1);
  public final static native int ADIOS_READ_METHOD_BP_get();
  public final static native int ADIOS_READ_METHOD_BP_AGGREGATE_get();
  public final static native int ADIOS_READ_METHOD_DATASPACES_get();
  public final static native int ADIOS_READ_METHOD_DIMES_get();
  public final static native int ADIOS_READ_METHOD_FLEXPATH_get();
  public final static native int ADIOS_READ_METHOD_ICEE_get();
  public final static native int ADIOS_LOCKMODE_NONE_get();
  public final static native int ADIOS_LOCKMODE_CURRENT_get();
  public final static native int ADIOS_LOCKMODE_ALL_get();
  public final static native void adios_errno_set(int jarg1);
  public final static native int adios_errno_get();
  public final static native String adios_errmsg();
  public final static native int adios_read_init_method(int jarg1, int jarg2, String jarg3);
  public final static native int adios_read_finalize_method(int jarg1);
  public final static native long adios_read_open(String jarg1, int jarg2, int jarg3, int jarg4, float jarg5);
  public final static native long adios_read_open_file(String jarg1, int jarg2, int jarg3);
  public final static native int adios_read_close(long jarg1, ADIOS_FILE jarg1_);
  public final static native int adios_advance_step(long jarg1, ADIOS_FILE jarg1_, int jarg2, float jarg3);
  public final static native void adios_release_step(long jarg1, ADIOS_FILE jarg1_);
  public final static native long adios_inq_var(long jarg1, ADIOS_FILE jarg1_, String jarg2);
  public final static native long adios_inq_var_byid(long jarg1, ADIOS_FILE jarg1_, int jarg2);
  public final static native void adios_free_varinfo(long jarg1, ADIOS_VARINFO jarg1_);
  public final static native int adios_inq_var_stat(long jarg1, ADIOS_FILE jarg1_, long jarg2, ADIOS_VARINFO jarg2_, int jarg3, int jarg4);
  public final static native int adios_inq_var_blockinfo(long jarg1, ADIOS_FILE jarg1_, long jarg2, ADIOS_VARINFO jarg2_);
  public final static native long adios_inq_link_byid(long jarg1, ADIOS_FILE jarg1_, int jarg2);
  public final static native void adios_free_linkinfo(long jarg1);
  public final static native long adios_inq_mesh_byid(long jarg1, ADIOS_FILE jarg1_, int jarg2);
  public final static native int adios_complete_meshinfo(long jarg1, ADIOS_FILE jarg1_, long jarg2, ADIOS_FILE jarg2_, long jarg3);
  public final static native void adios_free_meshinfo(long jarg1);
  public final static native int adios_inq_var_meshinfo(long jarg1, ADIOS_FILE jarg1_, long jarg2, ADIOS_VARINFO jarg2_);
  public final static native int adios_schedule_read(long jarg1, ADIOS_FILE jarg1_, long jarg2, String jarg3, int jarg4, int jarg5, long jarg6);
  public final static native int adios_schedule_read_byid(long jarg1, ADIOS_FILE jarg1_, long jarg2, int jarg3, int jarg4, int jarg5, long jarg6);
  public final static native int adios_schedule_read_param(long jarg1, ADIOS_FILE jarg1_, long jarg2, String jarg3, int jarg4, int jarg5, String jarg6, long jarg7);
  public final static native int adios_schedule_read_byid_param(long jarg1, ADIOS_FILE jarg1_, long jarg2, int jarg3, int jarg4, int jarg5, String jarg6, long jarg7);
  public final static native int adios_perform_reads(long jarg1, ADIOS_FILE jarg1_, int jarg2);
  public final static native int adios_check_reads(long jarg1, ADIOS_FILE jarg1_, long jarg2);
  public final static native void adios_free_chunk(long jarg1);
  public final static native int adios_get_attr(long jarg1, ADIOS_FILE jarg1_, String jarg2, long jarg3, long jarg4, long jarg5);
  public final static native int adios_get_attr_byid(long jarg1, ADIOS_FILE jarg1_, int jarg2, long jarg3, long jarg4, long jarg5);
  public final static native String adios_type_to_string(int jarg1);
  public final static native int adios_type_size(int jarg1, long jarg2);
  public final static native int adios_get_grouplist(long jarg1, ADIOS_FILE jarg1_, long jarg2);
  public final static native int adios_group_view(long jarg1, ADIOS_FILE jarg1_, int jarg2);
  public final static native void adios_print_fileinfo(long jarg1, ADIOS_FILE jarg1_);
}
