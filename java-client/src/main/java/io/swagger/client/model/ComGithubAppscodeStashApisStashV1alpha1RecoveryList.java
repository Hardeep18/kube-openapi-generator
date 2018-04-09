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
import io.swagger.client.model.ComGithubAppscodeStashApisStashV1alpha1Recovery;
import io.swagger.client.model.IoK8sApimachineryPkgApisMetaV1ListMeta;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ComGithubAppscodeStashApisStashV1alpha1RecoveryList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-09T00:59:16.508-07:00")
public class ComGithubAppscodeStashApisStashV1alpha1RecoveryList {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("items")
  private List<ComGithubAppscodeStashApisStashV1alpha1Recovery> items = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private IoK8sApimachineryPkgApisMetaV1ListMeta metadata = null;

  public ComGithubAppscodeStashApisStashV1alpha1RecoveryList apiVersion(String apiVersion) {
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

  public ComGithubAppscodeStashApisStashV1alpha1RecoveryList items(List<ComGithubAppscodeStashApisStashV1alpha1Recovery> items) {
    this.items = items;
    return this;
  }

  public ComGithubAppscodeStashApisStashV1alpha1RecoveryList addItemsItem(ComGithubAppscodeStashApisStashV1alpha1Recovery itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<ComGithubAppscodeStashApisStashV1alpha1Recovery>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")
  public List<ComGithubAppscodeStashApisStashV1alpha1Recovery> getItems() {
    return items;
  }

  public void setItems(List<ComGithubAppscodeStashApisStashV1alpha1Recovery> items) {
    this.items = items;
  }

  public ComGithubAppscodeStashApisStashV1alpha1RecoveryList kind(String kind) {
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

  public ComGithubAppscodeStashApisStashV1alpha1RecoveryList metadata(IoK8sApimachineryPkgApisMetaV1ListMeta metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public IoK8sApimachineryPkgApisMetaV1ListMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(IoK8sApimachineryPkgApisMetaV1ListMeta metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubAppscodeStashApisStashV1alpha1RecoveryList comGithubAppscodeStashApisStashV1alpha1RecoveryList = (ComGithubAppscodeStashApisStashV1alpha1RecoveryList) o;
    return Objects.equals(this.apiVersion, comGithubAppscodeStashApisStashV1alpha1RecoveryList.apiVersion) &&
        Objects.equals(this.items, comGithubAppscodeStashApisStashV1alpha1RecoveryList.items) &&
        Objects.equals(this.kind, comGithubAppscodeStashApisStashV1alpha1RecoveryList.kind) &&
        Objects.equals(this.metadata, comGithubAppscodeStashApisStashV1alpha1RecoveryList.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, items, kind, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubAppscodeStashApisStashV1alpha1RecoveryList {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
