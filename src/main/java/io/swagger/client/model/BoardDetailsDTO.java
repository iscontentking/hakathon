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
import io.swagger.client.model.AirplaneDTO;
import io.swagger.client.model.PassengerDTO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * BoardDetailsDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2022-09-28T10:57:44.889768+02:00[Europe/Warsaw]")
public class BoardDetailsDTO {

  @SerializedName("passengers")
  private List<PassengerDTO> passengers = null;
  
  @SerializedName("airplanes")
  private List<AirplaneDTO> airplanes = null;
  
  @SerializedName("started")
  private Boolean started = null;
  
  @SerializedName("finished")
  private Boolean finished = null;
  
  @SerializedName("width")
  private Integer width = null;
  
  @SerializedName("height")
  private Integer height = null;
  
  @SerializedName("startX")
  private Integer startX = null;
  
  @SerializedName("startY")
  private Integer startY = null;
  
  public BoardDetailsDTO passengers(List<PassengerDTO> passengers) {
    this.passengers = passengers;
    return this;
  }

  public BoardDetailsDTO addPassengersItem(PassengerDTO passengersItem) {
    
    if (this.passengers == null) {
      this.passengers = new ArrayList<PassengerDTO>();
    }
    
    this.passengers.add(passengersItem);
    return this;
  }
  
  /**
  * Get passengers
  * @return passengers
  **/
  @ApiModelProperty(value = "")
  public List<PassengerDTO> getPassengers() {
    return passengers;
  }
  public void setPassengers(List<PassengerDTO> passengers) {
    this.passengers = passengers;
  }
  
  public BoardDetailsDTO airplanes(List<AirplaneDTO> airplanes) {
    this.airplanes = airplanes;
    return this;
  }

  public BoardDetailsDTO addAirplanesItem(AirplaneDTO airplanesItem) {
    
    if (this.airplanes == null) {
      this.airplanes = new ArrayList<AirplaneDTO>();
    }
    
    this.airplanes.add(airplanesItem);
    return this;
  }
  
  /**
  * Get airplanes
  * @return airplanes
  **/
  @ApiModelProperty(value = "")
  public List<AirplaneDTO> getAirplanes() {
    return airplanes;
  }
  public void setAirplanes(List<AirplaneDTO> airplanes) {
    this.airplanes = airplanes;
  }
  
  public BoardDetailsDTO started(Boolean started) {
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
  
  public BoardDetailsDTO finished(Boolean finished) {
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
  
  public BoardDetailsDTO width(Integer width) {
    this.width = width;
    return this;
  }

  
  /**
  * Get width
  * @return width
  **/
  @ApiModelProperty(value = "")
  public Integer getWidth() {
    return width;
  }
  public void setWidth(Integer width) {
    this.width = width;
  }
  
  public BoardDetailsDTO height(Integer height) {
    this.height = height;
    return this;
  }

  
  /**
  * Get height
  * @return height
  **/
  @ApiModelProperty(value = "")
  public Integer getHeight() {
    return height;
  }
  public void setHeight(Integer height) {
    this.height = height;
  }
  
  public BoardDetailsDTO startX(Integer startX) {
    this.startX = startX;
    return this;
  }

  
  /**
  * Get startX
  * @return startX
  **/
  @ApiModelProperty(value = "")
  public Integer getStartX() {
    return startX;
  }
  public void setStartX(Integer startX) {
    this.startX = startX;
  }
  
  public BoardDetailsDTO startY(Integer startY) {
    this.startY = startY;
    return this;
  }

  
  /**
  * Get startY
  * @return startY
  **/
  @ApiModelProperty(value = "")
  public Integer getStartY() {
    return startY;
  }
  public void setStartY(Integer startY) {
    this.startY = startY;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoardDetailsDTO boardDetailsDTO = (BoardDetailsDTO) o;
    return Objects.equals(this.passengers, boardDetailsDTO.passengers) &&
        Objects.equals(this.airplanes, boardDetailsDTO.airplanes) &&
        Objects.equals(this.started, boardDetailsDTO.started) &&
        Objects.equals(this.finished, boardDetailsDTO.finished) &&
        Objects.equals(this.width, boardDetailsDTO.width) &&
        Objects.equals(this.height, boardDetailsDTO.height) &&
        Objects.equals(this.startX, boardDetailsDTO.startX) &&
        Objects.equals(this.startY, boardDetailsDTO.startY);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passengers, airplanes, started, finished, width, height, startX, startY);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardDetailsDTO {\n");
    
    sb.append("    passengers: ").append(toIndentedString(passengers)).append("\n");
    sb.append("    airplanes: ").append(toIndentedString(airplanes)).append("\n");
    sb.append("    started: ").append(toIndentedString(started)).append("\n");
    sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    startX: ").append(toIndentedString(startX)).append("\n");
    sb.append("    startY: ").append(toIndentedString(startY)).append("\n");
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



