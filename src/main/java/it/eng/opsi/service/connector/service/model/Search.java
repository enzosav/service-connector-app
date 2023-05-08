/*
 * Hochschulstart Mock-API
 * An API-Spec used for hochschulstart as first try.
 *
 * OpenAPI spec version: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package it.eng.opsi.service.connector.service.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;


/**
 * Search
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-05-05T16:06:27.017901400+02:00[Europe/Rome]")public class Search {

  @JsonProperty("id")

  private Integer id = null;

  @JsonProperty("federalStateId")

  private Integer federalStateId = null;

  @JsonProperty("name")

  private String name = null;

  @JsonProperty("semester")

  private String semester = null;

  @JsonProperty("institution")

  private String institution = null;

  @JsonProperty("degree")

  private String degree = null;

  @JsonProperty("applicationPeriodFrom")

  private String applicationPeriodFrom = null;

  @JsonProperty("applicationPeriodTo")

  private String applicationPeriodTo = null;
  public Search id(Integer id) {
    this.id = id;
    return this;
  }

  

  /**
  * Get id
  * @return id
  **/
  @Schema(description = "")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public Search federalStateId(Integer federalStateId) {
    this.federalStateId = federalStateId;
    return this;
  }

  

  /**
  * Get federalStateId
  * @return federalStateId
  **/
  @Schema(description = "")
  public Integer getFederalStateId() {
    return federalStateId;
  }
  public void setFederalStateId(Integer federalStateId) {
    this.federalStateId = federalStateId;
  }
  public Search name(String name) {
    this.name = name;
    return this;
  }

  

  /**
  * Get name
  * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Search semester(String semester) {
    this.semester = semester;
    return this;
  }

  

  /**
  * Get semester
  * @return semester
  **/
  @Schema(description = "")
  public String getSemester() {
    return semester;
  }
  public void setSemester(String semester) {
    this.semester = semester;
  }
  public Search institution(String institution) {
    this.institution = institution;
    return this;
  }

  

  /**
  * Get institution
  * @return institution
  **/
  @Schema(description = "")
  public String getInstitution() {
    return institution;
  }
  public void setInstitution(String institution) {
    this.institution = institution;
  }
  public Search degree(String degree) {
    this.degree = degree;
    return this;
  }

  

  /**
  * Get degree
  * @return degree
  **/
  @Schema(description = "")
  public String getDegree() {
    return degree;
  }
  public void setDegree(String degree) {
    this.degree = degree;
  }
  public Search applicationPeriodFrom(String applicationPeriodFrom) {
    this.applicationPeriodFrom = applicationPeriodFrom;
    return this;
  }

  

  /**
  * Get applicationPeriodFrom
  * @return applicationPeriodFrom
  **/
  @Schema(description = "")
  public String getApplicationPeriodFrom() {
    return applicationPeriodFrom;
  }
  public void setApplicationPeriodFrom(String applicationPeriodFrom) {
    this.applicationPeriodFrom = applicationPeriodFrom;
  }
  public Search applicationPeriodTo(String applicationPeriodTo) {
    this.applicationPeriodTo = applicationPeriodTo;
    return this;
  }

  

  /**
  * Get applicationPeriodTo
  * @return applicationPeriodTo
  **/
  @Schema(description = "")
  public String getApplicationPeriodTo() {
    return applicationPeriodTo;
  }
  public void setApplicationPeriodTo(String applicationPeriodTo) {
    this.applicationPeriodTo = applicationPeriodTo;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Search search = (Search) o;
    return Objects.equals(this.id, search.id) &&
        Objects.equals(this.federalStateId, search.federalStateId) &&
        Objects.equals(this.name, search.name) &&
        Objects.equals(this.semester, search.semester) &&
        Objects.equals(this.institution, search.institution) &&
        Objects.equals(this.degree, search.degree) &&
        Objects.equals(this.applicationPeriodFrom, search.applicationPeriodFrom) &&
        Objects.equals(this.applicationPeriodTo, search.applicationPeriodTo);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, federalStateId, name, semester, institution, degree, applicationPeriodFrom, applicationPeriodTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Search {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    federalStateId: ").append(toIndentedString(federalStateId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    semester: ").append(toIndentedString(semester)).append("\n");
    sb.append("    institution: ").append(toIndentedString(institution)).append("\n");
    sb.append("    degree: ").append(toIndentedString(degree)).append("\n");
    sb.append("    applicationPeriodFrom: ").append(toIndentedString(applicationPeriodFrom)).append("\n");
    sb.append("    applicationPeriodTo: ").append(toIndentedString(applicationPeriodTo)).append("\n");
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
