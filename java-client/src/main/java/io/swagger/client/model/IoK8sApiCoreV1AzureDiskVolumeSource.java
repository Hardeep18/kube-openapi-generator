/*
 * stash-server
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1alpha1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
 */
@ApiModel(description = "AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-09T00:59:16.508-07:00")
public class IoK8sApiCoreV1AzureDiskVolumeSource {
  @SerializedName("cachingMode")
  private String cachingMode = null;

  @SerializedName("diskName")
  private String diskName = null;

  @SerializedName("diskURI")
  private String diskURI = null;

  @SerializedName("fsType")
  private String fsType = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("readOnly")
  private Boolean readOnly = null;

  public IoK8sApiCoreV1AzureDiskVolumeSource cachingMode(String cachingMode) {
    this.cachingMode = cachingMode;
    return this;
  }

   /**
   * Host Caching mode: None, Read Only, Read Write.
   * @return cachingMode
  **/
  @ApiModelProperty(value = "Host Caching mode: None, Read Only, Read Write.")
  public String getCachingMode() {
    return cachingMode;
  }

  public void setCachingMode(String cachingMode) {
    this.cachingMode = cachingMode;
  }

  public IoK8sApiCoreV1AzureDiskVolumeSource diskName(String diskName) {
    this.diskName = diskName;
    return this;
  }

   /**
   * The Name of the data disk in the blob storage
   * @return diskName
  **/
  @ApiModelProperty(required = true, value = "The Name of the data disk in the blob storage")
  public String getDiskName() {
    return diskName;
  }

  public void setDiskName(String diskName) {
    this.diskName = diskName;
  }

  public IoK8sApiCoreV1AzureDiskVolumeSource diskURI(String diskURI) {
    this.diskURI = diskURI;
    return this;
  }

   /**
   * The URI the data disk in the blob storage
   * @return diskURI
  **/
  @ApiModelProperty(required = true, value = "The URI the data disk in the blob storage")
  public String getDiskURI() {
    return diskURI;
  }

  public void setDiskURI(String diskURI) {
    this.diskURI = diskURI;
  }

  public IoK8sApiCoreV1AzureDiskVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

   /**
   * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Implicitly inferred to be \&quot;ext4\&quot; if unspecified.
   * @return fsType
  **/
  @ApiModelProperty(value = "Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified.")
  public String getFsType() {
    return fsType;
  }

  public void setFsType(String fsType) {
    this.fsType = fsType;
  }

  public IoK8sApiCoreV1AzureDiskVolumeSource kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Expected values Shared: multiple blob disks per storage account  Dedicated: single blob disk per storage account  Managed: azure managed data disk (only in managed availability set). defaults to shared
   * @return kind
  **/
  @ApiModelProperty(value = "Expected values Shared: multiple blob disks per storage account  Dedicated: single blob disk per storage account  Managed: azure managed data disk (only in managed availability set). defaults to shared")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public IoK8sApiCoreV1AzureDiskVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
   * @return readOnly
  **/
  @ApiModelProperty(value = "Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.")
  public Boolean isReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1AzureDiskVolumeSource ioK8sApiCoreV1AzureDiskVolumeSource = (IoK8sApiCoreV1AzureDiskVolumeSource) o;
    return Objects.equals(this.cachingMode, ioK8sApiCoreV1AzureDiskVolumeSource.cachingMode) &&
        Objects.equals(this.diskName, ioK8sApiCoreV1AzureDiskVolumeSource.diskName) &&
        Objects.equals(this.diskURI, ioK8sApiCoreV1AzureDiskVolumeSource.diskURI) &&
        Objects.equals(this.fsType, ioK8sApiCoreV1AzureDiskVolumeSource.fsType) &&
        Objects.equals(this.kind, ioK8sApiCoreV1AzureDiskVolumeSource.kind) &&
        Objects.equals(this.readOnly, ioK8sApiCoreV1AzureDiskVolumeSource.readOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cachingMode, diskName, diskURI, fsType, kind, readOnly);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1AzureDiskVolumeSource {\n");
    
    sb.append("    cachingMode: ").append(toIndentedString(cachingMode)).append("\n");
    sb.append("    diskName: ").append(toIndentedString(diskName)).append("\n");
    sb.append("    diskURI: ").append(toIndentedString(diskURI)).append("\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

