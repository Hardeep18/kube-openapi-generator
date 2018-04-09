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
import java.util.ArrayList;
import java.util.List;

/**
 * ComGithubAppscodeStashApisStashV1alpha1FileGroup
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-09T00:59:16.508-07:00")
public class ComGithubAppscodeStashApisStashV1alpha1FileGroup {
  @SerializedName("path")
  private String path = null;

  @SerializedName("retentionPolicyName")
  private String retentionPolicyName = null;

  @SerializedName("tags")
  private List<String> tags = null;

  public ComGithubAppscodeStashApisStashV1alpha1FileGroup path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Source of the backup volumeName:path
   * @return path
  **/
  @ApiModelProperty(value = "Source of the backup volumeName:path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public ComGithubAppscodeStashApisStashV1alpha1FileGroup retentionPolicyName(String retentionPolicyName) {
    this.retentionPolicyName = retentionPolicyName;
    return this;
  }

   /**
   * retention policy of snapshots
   * @return retentionPolicyName
  **/
  @ApiModelProperty(value = "retention policy of snapshots")
  public String getRetentionPolicyName() {
    return retentionPolicyName;
  }

  public void setRetentionPolicyName(String retentionPolicyName) {
    this.retentionPolicyName = retentionPolicyName;
  }

  public ComGithubAppscodeStashApisStashV1alpha1FileGroup tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ComGithubAppscodeStashApisStashV1alpha1FileGroup addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Tags of a snapshots
   * @return tags
  **/
  @ApiModelProperty(value = "Tags of a snapshots")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubAppscodeStashApisStashV1alpha1FileGroup comGithubAppscodeStashApisStashV1alpha1FileGroup = (ComGithubAppscodeStashApisStashV1alpha1FileGroup) o;
    return Objects.equals(this.path, comGithubAppscodeStashApisStashV1alpha1FileGroup.path) &&
        Objects.equals(this.retentionPolicyName, comGithubAppscodeStashApisStashV1alpha1FileGroup.retentionPolicyName) &&
        Objects.equals(this.tags, comGithubAppscodeStashApisStashV1alpha1FileGroup.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, retentionPolicyName, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubAppscodeStashApisStashV1alpha1FileGroup {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    retentionPolicyName: ").append(toIndentedString(retentionPolicyName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
