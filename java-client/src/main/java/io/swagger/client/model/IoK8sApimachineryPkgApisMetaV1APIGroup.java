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
import io.swagger.client.model.IoK8sApimachineryPkgApisMetaV1GroupVersionForDiscovery;
import io.swagger.client.model.IoK8sApimachineryPkgApisMetaV1ServerAddressByClientCIDR;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * APIGroup contains the name, the supported versions, and the preferred version of a group.
 */
@ApiModel(description = "APIGroup contains the name, the supported versions, and the preferred version of a group.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-09T00:59:16.508-07:00")
public class IoK8sApimachineryPkgApisMetaV1APIGroup {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("preferredVersion")
  private IoK8sApimachineryPkgApisMetaV1GroupVersionForDiscovery preferredVersion = null;

  @SerializedName("serverAddressByClientCIDRs")
  private List<IoK8sApimachineryPkgApisMetaV1ServerAddressByClientCIDR> serverAddressByClientCIDRs = new ArrayList<IoK8sApimachineryPkgApisMetaV1ServerAddressByClientCIDR>();

  @SerializedName("versions")
  private List<IoK8sApimachineryPkgApisMetaV1GroupVersionForDiscovery> versions = new ArrayList<IoK8sApimachineryPkgApisMetaV1GroupVersionForDiscovery>();

  public IoK8sApimachineryPkgApisMetaV1APIGroup apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
   * @return apiVersion
  **/
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public IoK8sApimachineryPkgApisMetaV1APIGroup kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
   * @return kind
  **/
  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public IoK8sApimachineryPkgApisMetaV1APIGroup name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name is the name of the group.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "name is the name of the group.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IoK8sApimachineryPkgApisMetaV1APIGroup preferredVersion(IoK8sApimachineryPkgApisMetaV1GroupVersionForDiscovery preferredVersion) {
    this.preferredVersion = preferredVersion;
    return this;
  }

   /**
   * preferredVersion is the version preferred by the API server, which probably is the storage version.
   * @return preferredVersion
  **/
  @ApiModelProperty(value = "preferredVersion is the version preferred by the API server, which probably is the storage version.")
  public IoK8sApimachineryPkgApisMetaV1GroupVersionForDiscovery getPreferredVersion() {
    return preferredVersion;
  }

  public void setPreferredVersion(IoK8sApimachineryPkgApisMetaV1GroupVersionForDiscovery preferredVersion) {
    this.preferredVersion = preferredVersion;
  }

  public IoK8sApimachineryPkgApisMetaV1APIGroup serverAddressByClientCIDRs(List<IoK8sApimachineryPkgApisMetaV1ServerAddressByClientCIDR> serverAddressByClientCIDRs) {
    this.serverAddressByClientCIDRs = serverAddressByClientCIDRs;
    return this;
  }

  public IoK8sApimachineryPkgApisMetaV1APIGroup addServerAddressByClientCIDRsItem(IoK8sApimachineryPkgApisMetaV1ServerAddressByClientCIDR serverAddressByClientCIDRsItem) {
    this.serverAddressByClientCIDRs.add(serverAddressByClientCIDRsItem);
    return this;
  }

   /**
   * a map of client CIDR to server address that is serving this group. This is to help clients reach servers in the most network-efficient way possible. Clients can use the appropriate server address as per the CIDR that they match. In case of multiple matches, clients should use the longest matching CIDR. The server returns only those CIDRs that it thinks that the client can match. For example: the master will return an internal IP CIDR only, if the client reaches the server using an internal IP. Server looks at X-Forwarded-For header or X-Real-Ip header or request.RemoteAddr (in that order) to get the client IP.
   * @return serverAddressByClientCIDRs
  **/
  @ApiModelProperty(required = true, value = "a map of client CIDR to server address that is serving this group. This is to help clients reach servers in the most network-efficient way possible. Clients can use the appropriate server address as per the CIDR that they match. In case of multiple matches, clients should use the longest matching CIDR. The server returns only those CIDRs that it thinks that the client can match. For example: the master will return an internal IP CIDR only, if the client reaches the server using an internal IP. Server looks at X-Forwarded-For header or X-Real-Ip header or request.RemoteAddr (in that order) to get the client IP.")
  public List<IoK8sApimachineryPkgApisMetaV1ServerAddressByClientCIDR> getServerAddressByClientCIDRs() {
    return serverAddressByClientCIDRs;
  }

  public void setServerAddressByClientCIDRs(List<IoK8sApimachineryPkgApisMetaV1ServerAddressByClientCIDR> serverAddressByClientCIDRs) {
    this.serverAddressByClientCIDRs = serverAddressByClientCIDRs;
  }

  public IoK8sApimachineryPkgApisMetaV1APIGroup versions(List<IoK8sApimachineryPkgApisMetaV1GroupVersionForDiscovery> versions) {
    this.versions = versions;
    return this;
  }

  public IoK8sApimachineryPkgApisMetaV1APIGroup addVersionsItem(IoK8sApimachineryPkgApisMetaV1GroupVersionForDiscovery versionsItem) {
    this.versions.add(versionsItem);
    return this;
  }

   /**
   * versions are the versions supported in this group.
   * @return versions
  **/
  @ApiModelProperty(required = true, value = "versions are the versions supported in this group.")
  public List<IoK8sApimachineryPkgApisMetaV1GroupVersionForDiscovery> getVersions() {
    return versions;
  }

  public void setVersions(List<IoK8sApimachineryPkgApisMetaV1GroupVersionForDiscovery> versions) {
    this.versions = versions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApimachineryPkgApisMetaV1APIGroup ioK8sApimachineryPkgApisMetaV1APIGroup = (IoK8sApimachineryPkgApisMetaV1APIGroup) o;
    return Objects.equals(this.apiVersion, ioK8sApimachineryPkgApisMetaV1APIGroup.apiVersion) &&
        Objects.equals(this.kind, ioK8sApimachineryPkgApisMetaV1APIGroup.kind) &&
        Objects.equals(this.name, ioK8sApimachineryPkgApisMetaV1APIGroup.name) &&
        Objects.equals(this.preferredVersion, ioK8sApimachineryPkgApisMetaV1APIGroup.preferredVersion) &&
        Objects.equals(this.serverAddressByClientCIDRs, ioK8sApimachineryPkgApisMetaV1APIGroup.serverAddressByClientCIDRs) &&
        Objects.equals(this.versions, ioK8sApimachineryPkgApisMetaV1APIGroup.versions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, name, preferredVersion, serverAddressByClientCIDRs, versions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApimachineryPkgApisMetaV1APIGroup {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    preferredVersion: ").append(toIndentedString(preferredVersion)).append("\n");
    sb.append("    serverAddressByClientCIDRs: ").append(toIndentedString(serverAddressByClientCIDRs)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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

