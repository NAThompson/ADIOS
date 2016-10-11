/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ornl.adios.adioslib;

public class _ADIOS_VARMESH {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _ADIOS_VARMESH(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_ADIOS_VARMESH obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        adioslibJNI.delete__ADIOS_VARMESH(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setMeshid(int value) {
    adioslibJNI._ADIOS_VARMESH_meshid_set(swigCPtr, this, value);
  }

  public int getMeshid() {
    return adioslibJNI._ADIOS_VARMESH_meshid_get(swigCPtr, this);
  }

  public void setCentering(var_centering value) {
    adioslibJNI._ADIOS_VARMESH_centering_set(swigCPtr, this, value.swigValue());
  }

  public var_centering getCentering() {
    return var_centering.swigToEnum(adioslibJNI._ADIOS_VARMESH_centering_get(swigCPtr, this));
  }

  public _ADIOS_VARMESH() {
    this(adioslibJNI.new__ADIOS_VARMESH(), true);
  }

}
