package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * School
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-07-09T13:47:33.617+02:00[Europe/Berlin]")

public class School   {
  @JsonProperty("schoolname")
  private String schoolname = null;

  @JsonProperty("preis")
  private Integer preis = null;

  @JsonProperty("address")
  private String address = null;

  public School schoolname(String schoolname) {
    this.schoolname = schoolname;
    return this;
  }

  /**
   * Get schoolname
   * @return schoolname
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getSchoolname() {
    return schoolname;
  }

  public void setSchoolname(String schoolname) {
    this.schoolname = schoolname;
  }

  public School preis(Integer preis) {
    this.preis = preis;
    return this;
  }

  /**
   * Get preis
   * @return preis
  **/
  @ApiModelProperty(value = "")


  public Integer getPreis() {
    return preis;
  }

  public void setPreis(Integer preis) {
    this.preis = preis;
  }

  public School address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    School school = (School) o;
    return Objects.equals(this.schoolname, school.schoolname) &&
        Objects.equals(this.preis, school.preis) &&
        Objects.equals(this.address, school.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schoolname, preis, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class School {\n");
    
    sb.append("    schoolname: ").append(toIndentedString(schoolname)).append("\n");
    sb.append("    preis: ").append(toIndentedString(preis)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

