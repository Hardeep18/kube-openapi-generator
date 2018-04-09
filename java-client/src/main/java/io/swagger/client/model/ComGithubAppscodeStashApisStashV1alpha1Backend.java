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
import io.swagger.client.model.ComGithubAppscodeStashApisStashV1alpha1AzureSpec;
import io.swagger.client.model.ComGithubAppscodeStashApisStashV1alpha1B2Spec;
import io.swagger.client.model.ComGithubAppscodeStashApisStashV1alpha1GCSSpec;
import io.swagger.client.model.ComGithubAppscodeStashApisStashV1alpha1LocalSpec;
import io.swagger.client.model.ComGithubAppscodeStashApisStashV1alpha1S3Spec;
import io.swagger.client.model.ComGithubAppscodeStashApisStashV1alpha1SwiftSpec;
import java.io.IOException;

/**
 * ComGithubAppscodeStashApisStashV1alpha1Backend
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-09T00:59:16.508-07:00")
public class ComGithubAppscodeStashApisStashV1alpha1Backend {
  @SerializedName("azure")
  private ComGithubAppscodeStashApisStashV1alpha1AzureSpec azure = null;

  @SerializedName("b2")
  private ComGithubAppscodeStashApisStashV1alpha1B2Spec b2 = null;

  @SerializedName("gcs")
  private ComGithubAppscodeStashApisStashV1alpha1GCSSpec gcs = null;

  @SerializedName("local")
  private ComGithubAppscodeStashApisStashV1alpha1LocalSpec local = null;

  @SerializedName("s3")
  private ComGithubAppscodeStashApisStashV1alpha1S3Spec s3 = null;

  @SerializedName("storageSecretName")
  private String storageSecretName = null;

  @SerializedName("swift")
  private ComGithubAppscodeStashApisStashV1alpha1SwiftSpec swift = null;

  public ComGithubAppscodeStashApisStashV1alpha1Backend azure(ComGithubAppscodeStashApisStashV1alpha1AzureSpec azure) {
    this.azure = azure;
    return this;
  }

   /**
   * Get azure
   * @return azure
  **/
  @ApiModelProperty(value = "")
  public ComGithubAppscodeStashApisStashV1alpha1AzureSpec getAzure() {
    return azure;
  }

  public void setAzure(ComGithubAppscodeStashApisStashV1alpha1AzureSpec azure) {
    this.azure = azure;
  }

  public ComGithubAppscodeStashApisStashV1alpha1Backend b2(ComGithubAppscodeStashApisStashV1alpha1B2Spec b2) {
    this.b2 = b2;
    return this;
  }

   /**
   * Get b2
   * @return b2
  **/
  @ApiModelProperty(value = "")
  public ComGithubAppscodeStashApisStashV1alpha1B2Spec getB2() {
    return b2;
  }

  public void setB2(ComGithubAppscodeStashApisStashV1alpha1B2Spec b2) {
    this.b2 = b2;
  }

  public ComGithubAppscodeStashApisStashV1alpha1Backend gcs(ComGithubAppscodeStashApisStashV1alpha1GCSSpec gcs) {
    this.gcs = gcs;
    return this;
  }

   /**
   * Get gcs
   * @return gcs
  **/
  @ApiModelProperty(value = "")
  public ComGithubAppscodeStashApisStashV1alpha1GCSSpec getGcs() {
    return gcs;
  }

  public void setGcs(ComGithubAppscodeStashApisStashV1alpha1GCSSpec gcs) {
    this.gcs = gcs;
  }

  public ComGithubAppscodeStashApisStashV1alpha1Backend local(ComGithubAppscodeStashApisStashV1alpha1LocalSpec local) {
    this.local = local;
    return this;
  }

   /**
   * Get local
   * @return local
  **/
  @ApiModelProperty(value = "")
  public ComGithubAppscodeStashApisStashV1alpha1LocalSpec getLocal() {
    return local;
  }

  public void setLocal(ComGithubAppscodeStashApisStashV1alpha1LocalSpec local) {
    this.local = local;
  }

  public ComGithubAppscodeStashApisStashV1alpha1Backend s3(ComGithubAppscodeStashApisStashV1alpha1S3Spec s3) {
    this.s3 = s3;
    return this;
  }

   /**
   * Get s3
   * @return s3
  **/
  @ApiModelProperty(value = "")
  public ComGithubAppscodeStashApisStashV1alpha1S3Spec getS3() {
    return s3;
  }

  public void setS3(ComGithubAppscodeStashApisStashV1alpha1S3Spec s3) {
    this.s3 = s3;
  }

  public ComGithubAppscodeStashApisStashV1alpha1Backend storageSecretName(String storageSecretName) {
    this.storageSecretName = storageSecretName;
    return this;
  }

   /**
   * Get storageSecretName
   * @return storageSecretName
  **/
  @ApiModelProperty(value = "")
  public String getStorageSecretName() {
    return storageSecretName;
  }

  public void setStorageSecretName(String storageSecretName) {
    this.storageSecretName = storageSecretName;
  }

  public ComGithubAppscodeStashApisStashV1alpha1Backend swift(ComGithubAppscodeStashApisStashV1alpha1SwiftSpec swift) {
    this.swift = swift;
    return this;
  }

   /**
   * Get swift
   * @return swift
  **/
  @ApiModelProperty(value = "")
  public ComGithubAppscodeStashApisStashV1alpha1SwiftSpec getSwift() {
    return swift;
  }

  public void setSwift(ComGithubAppscodeStashApisStashV1alpha1SwiftSpec swift) {
    this.swift = swift;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubAppscodeStashApisStashV1alpha1Backend comGithubAppscodeStashApisStashV1alpha1Backend = (ComGithubAppscodeStashApisStashV1alpha1Backend) o;
    return Objects.equals(this.azure, comGithubAppscodeStashApisStashV1alpha1Backend.azure) &&
        Objects.equals(this.b2, comGithubAppscodeStashApisStashV1alpha1Backend.b2) &&
        Objects.equals(this.gcs, comGithubAppscodeStashApisStashV1alpha1Backend.gcs) &&
        Objects.equals(this.local, comGithubAppscodeStashApisStashV1alpha1Backend.local) &&
        Objects.equals(this.s3, comGithubAppscodeStashApisStashV1alpha1Backend.s3) &&
        Objects.equals(this.storageSecretName, comGithubAppscodeStashApisStashV1alpha1Backend.storageSecretName) &&
        Objects.equals(this.swift, comGithubAppscodeStashApisStashV1alpha1Backend.swift);
  }

  @Override
  public int hashCode() {
    return Objects.hash(azure, b2, gcs, local, s3, storageSecretName, swift);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubAppscodeStashApisStashV1alpha1Backend {\n");
    
    sb.append("    azure: ").append(toIndentedString(azure)).append("\n");
    sb.append("    b2: ").append(toIndentedString(b2)).append("\n");
    sb.append("    gcs: ").append(toIndentedString(gcs)).append("\n");
    sb.append("    local: ").append(toIndentedString(local)).append("\n");
    sb.append("    s3: ").append(toIndentedString(s3)).append("\n");
    sb.append("    storageSecretName: ").append(toIndentedString(storageSecretName)).append("\n");
    sb.append("    swift: ").append(toIndentedString(swift)).append("\n");
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
