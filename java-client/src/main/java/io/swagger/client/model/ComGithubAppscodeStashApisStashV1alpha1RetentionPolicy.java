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
 * ComGithubAppscodeStashApisStashV1alpha1RetentionPolicy
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-09T00:59:16.508-07:00")
public class ComGithubAppscodeStashApisStashV1alpha1RetentionPolicy {
  @SerializedName("dryRun")
  private Boolean dryRun = null;

  @SerializedName("keepDaily")
  private Integer keepDaily = null;

  @SerializedName("keepHourly")
  private Integer keepHourly = null;

  @SerializedName("keepLast")
  private Integer keepLast = null;

  @SerializedName("keepMonthly")
  private Integer keepMonthly = null;

  @SerializedName("keepTags")
  private List<String> keepTags = null;

  @SerializedName("keepWeekly")
  private Integer keepWeekly = null;

  @SerializedName("keepYearly")
  private Integer keepYearly = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("prune")
  private Boolean prune = null;

  public ComGithubAppscodeStashApisStashV1alpha1RetentionPolicy dryRun(Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

   /**
   * Get dryRun
   * @return dryRun
  **/
  @ApiModelProperty(value = "")
  public Boolean isDryRun() {
    return dryRun;
  }

  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }

  public ComGithubAppscodeStashApisStashV1alpha1RetentionPolicy keepDaily(Integer keepDaily) {
    this.keepDaily = keepDaily;
    return this;
  }

   /**
   * Get keepDaily
   * @return keepDaily
  **/
  @ApiModelProperty(value = "")
  public Integer getKeepDaily() {
    return keepDaily;
  }

  public void setKeepDaily(Integer keepDaily) {
    this.keepDaily = keepDaily;
  }

  public ComGithubAppscodeStashApisStashV1alpha1RetentionPolicy keepHourly(Integer keepHourly) {
    this.keepHourly = keepHourly;
    return this;
  }

   /**
   * Get keepHourly
   * @return keepHourly
  **/
  @ApiModelProperty(value = "")
  public Integer getKeepHourly() {
    return keepHourly;
  }

  public void setKeepHourly(Integer keepHourly) {
    this.keepHourly = keepHourly;
  }

  public ComGithubAppscodeStashApisStashV1alpha1RetentionPolicy keepLast(Integer keepLast) {
    this.keepLast = keepLast;
    return this;
  }

   /**
   * Get keepLast
   * @return keepLast
  **/
  @ApiModelProperty(value = "")
  public Integer getKeepLast() {
    return keepLast;
  }

  public void setKeepLast(Integer keepLast) {
    this.keepLast = keepLast;
  }

  public ComGithubAppscodeStashApisStashV1alpha1RetentionPolicy keepMonthly(Integer keepMonthly) {
    this.keepMonthly = keepMonthly;
    return this;
  }

   /**
   * Get keepMonthly
   * @return keepMonthly
  **/
  @ApiModelProperty(value = "")
  public Integer getKeepMonthly() {
    return keepMonthly;
  }

  public void setKeepMonthly(Integer keepMonthly) {
    this.keepMonthly = keepMonthly;
  }

  public ComGithubAppscodeStashApisStashV1alpha1RetentionPolicy keepTags(List<String> keepTags) {
    this.keepTags = keepTags;
    return this;
  }

  public ComGithubAppscodeStashApisStashV1alpha1RetentionPolicy addKeepTagsItem(String keepTagsItem) {
    if (this.keepTags == null) {
      this.keepTags = new ArrayList<String>();
    }
    this.keepTags.add(keepTagsItem);
    return this;
  }

   /**
   * Get keepTags
   * @return keepTags
  **/
  @ApiModelProperty(value = "")
  public List<String> getKeepTags() {
    return keepTags;
  }

  public void setKeepTags(List<String> keepTags) {
    this.keepTags = keepTags;
  }

  public ComGithubAppscodeStashApisStashV1alpha1RetentionPolicy keepWeekly(Integer keepWeekly) {
    this.keepWeekly = keepWeekly;
    return this;
  }

   /**
   * Get keepWeekly
   * @return keepWeekly
  **/
  @ApiModelProperty(value = "")
  public Integer getKeepWeekly() {
    return keepWeekly;
  }

  public void setKeepWeekly(Integer keepWeekly) {
    this.keepWeekly = keepWeekly;
  }

  public ComGithubAppscodeStashApisStashV1alpha1RetentionPolicy keepYearly(Integer keepYearly) {
    this.keepYearly = keepYearly;
    return this;
  }

   /**
   * Get keepYearly
   * @return keepYearly
  **/
  @ApiModelProperty(value = "")
  public Integer getKeepYearly() {
    return keepYearly;
  }

  public void setKeepYearly(Integer keepYearly) {
    this.keepYearly = keepYearly;
  }

  public ComGithubAppscodeStashApisStashV1alpha1RetentionPolicy name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ComGithubAppscodeStashApisStashV1alpha1RetentionPolicy prune(Boolean prune) {
    this.prune = prune;
    return this;
  }

   /**
   * Get prune
   * @return prune
  **/
  @ApiModelProperty(value = "")
  public Boolean isPrune() {
    return prune;
  }

  public void setPrune(Boolean prune) {
    this.prune = prune;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubAppscodeStashApisStashV1alpha1RetentionPolicy comGithubAppscodeStashApisStashV1alpha1RetentionPolicy = (ComGithubAppscodeStashApisStashV1alpha1RetentionPolicy) o;
    return Objects.equals(this.dryRun, comGithubAppscodeStashApisStashV1alpha1RetentionPolicy.dryRun) &&
        Objects.equals(this.keepDaily, comGithubAppscodeStashApisStashV1alpha1RetentionPolicy.keepDaily) &&
        Objects.equals(this.keepHourly, comGithubAppscodeStashApisStashV1alpha1RetentionPolicy.keepHourly) &&
        Objects.equals(this.keepLast, comGithubAppscodeStashApisStashV1alpha1RetentionPolicy.keepLast) &&
        Objects.equals(this.keepMonthly, comGithubAppscodeStashApisStashV1alpha1RetentionPolicy.keepMonthly) &&
        Objects.equals(this.keepTags, comGithubAppscodeStashApisStashV1alpha1RetentionPolicy.keepTags) &&
        Objects.equals(this.keepWeekly, comGithubAppscodeStashApisStashV1alpha1RetentionPolicy.keepWeekly) &&
        Objects.equals(this.keepYearly, comGithubAppscodeStashApisStashV1alpha1RetentionPolicy.keepYearly) &&
        Objects.equals(this.name, comGithubAppscodeStashApisStashV1alpha1RetentionPolicy.name) &&
        Objects.equals(this.prune, comGithubAppscodeStashApisStashV1alpha1RetentionPolicy.prune);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dryRun, keepDaily, keepHourly, keepLast, keepMonthly, keepTags, keepWeekly, keepYearly, name, prune);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubAppscodeStashApisStashV1alpha1RetentionPolicy {\n");
    
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    keepDaily: ").append(toIndentedString(keepDaily)).append("\n");
    sb.append("    keepHourly: ").append(toIndentedString(keepHourly)).append("\n");
    sb.append("    keepLast: ").append(toIndentedString(keepLast)).append("\n");
    sb.append("    keepMonthly: ").append(toIndentedString(keepMonthly)).append("\n");
    sb.append("    keepTags: ").append(toIndentedString(keepTags)).append("\n");
    sb.append("    keepWeekly: ").append(toIndentedString(keepWeekly)).append("\n");
    sb.append("    keepYearly: ").append(toIndentedString(keepYearly)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    prune: ").append(toIndentedString(prune)).append("\n");
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

