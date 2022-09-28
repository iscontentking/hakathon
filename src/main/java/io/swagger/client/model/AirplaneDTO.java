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

/**
 * AirplaneDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2022-09-28T10:57:44.889768+02:00[Europe/Warsaw]")
public class AirplaneDTO {

  @SerializedName("name")
  private String name = null;
  
  @SerializedName("color")
  private String color = null;
  
  @SerializedName("x")
  private Integer x = null;
  
  @SerializedName("y")
  private Integer y = null;
  
  public AirplaneDTO name(String name) {
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
  
  public AirplaneDTO color(String color) {
    this.color = color;
    return this;
  }

  
  /**
  * Get color
  * @return color
  **/
  @ApiModelProperty(value = "")
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }
  
  public AirplaneDTO x(Integer x) {
    this.x = x;
    return this;
  }

  
  /**
  * Get x
  * @return x
  **/
  @ApiModelProperty(value = "")
  public Integer getX() {
    return x;
  }
  public void setX(Integer x) {
    this.x = x;
  }
  
  public AirplaneDTO y(Integer y) {
    this.y = y;
    return this;
  }

  
  /**
  * Get y
  * @return y
  **/
  @ApiModelProperty(value = "")
  public Integer getY() {
    return y;
  }
  public void setY(Integer y) {
    this.y = y;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AirplaneDTO airplaneDTO = (AirplaneDTO) o;
    return Objects.equals(this.name, airplaneDTO.name) &&
        Objects.equals(this.color, airplaneDTO.color) &&
        Objects.equals(this.x, airplaneDTO.x) &&
        Objects.equals(this.y, airplaneDTO.y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, color, x, y);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirplaneDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
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



