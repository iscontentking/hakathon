/*
 * Airplane Hackathon API
 * Airplane Hackathon API
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;

/**
 * BoardGeneralDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2022-09-28T10:57:44.889768+02:00[Europe/Warsaw]")
public class BoardGeneralDTO {

  @SerializedName("id")
  private UUID id = null;
  
  @SerializedName("createdBy")
  private String createdBy = null;
  
  @SerializedName("started")
  private Boolean started = null;
  
  @SerializedName("finished")
  private Boolean finished = null;
  
  public BoardGeneralDTO id(UUID id) {
    this.id = id;
    return this;
  }

  
  /**
  * Get id
  * @return id
  **/
  @ApiModelProperty(value = "")
  public UUID getId() {
    return id;
  }
  public void setId(UUID id) {
    this.id = id;
  }
  
  public BoardGeneralDTO createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  
  /**
  * Get createdBy
  * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public String getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }
  
  public BoardGeneralDTO started(Boolean started) {
    this.started = started;
    return this;
  }

  
  /**
  * Get started
  * @return started
  **/
  @ApiModelProperty(value = "")
  public Boolean isStarted() {
    return started;
  }
  public void setStarted(Boolean started) {
    this.started = started;
  }
  
  public BoardGeneralDTO finished(Boolean finished) {
    this.finished = finished;
    return this;
  }

  
  /**
  * Get finished
  * @return finished
  **/
  @ApiModelProperty(value = "")
  public Boolean isFinished() {
    return finished;
  }
  public void setFinished(Boolean finished) {
    this.finished = finished;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoardGeneralDTO boardGeneralDTO = (BoardGeneralDTO) o;
    return Objects.equals(this.id, boardGeneralDTO.id) &&
        Objects.equals(this.createdBy, boardGeneralDTO.createdBy) &&
        Objects.equals(this.started, boardGeneralDTO.started) &&
        Objects.equals(this.finished, boardGeneralDTO.finished);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdBy, started, finished);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardGeneralDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    started: ").append(toIndentedString(started)).append("\n");
    sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
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



