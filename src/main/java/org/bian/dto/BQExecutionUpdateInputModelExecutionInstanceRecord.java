package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQExecutionUpdateInputModelExecutionInstanceRecord
 */
public class BQExecutionUpdateInputModelExecutionInstanceRecord   {
  private String prospectCampaignProcedureWorkTaskType = null;

  private String prospectCampaignProcedureWorkTaskDescription = null;

  private String prospectCampaignProcedureWorkTaskWorkProducts = null;

  private String documentDirectoryEntryInstanceReference = null;

  private String prospectCampaignProcedureWorkTaskResult = null;

  private String prospectCampaignProcedureWorkTaskDateTime = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of work task (e.g. execute campaign through mailshot) 
   * @return prospectCampaignProcedureWorkTaskType
  **/

  public String getProspectCampaignProcedureWorkTaskType() {
    return prospectCampaignProcedureWorkTaskType;
  }

  public void setProspectCampaignProcedureWorkTaskType(String prospectCampaignProcedureWorkTaskType) {
    this.prospectCampaignProcedureWorkTaskType = prospectCampaignProcedureWorkTaskType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the task performed, includes summary of activities as necessary for reference 
   * @return prospectCampaignProcedureWorkTaskDescription
  **/

  public String getProspectCampaignProcedureWorkTaskDescription() {
    return prospectCampaignProcedureWorkTaskDescription;
  }

  public void setProspectCampaignProcedureWorkTaskDescription(String prospectCampaignProcedureWorkTaskDescription) {
    this.prospectCampaignProcedureWorkTaskDescription = prospectCampaignProcedureWorkTaskDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: File of consolidated notes, forms and documents for the work task 
   * @return prospectCampaignProcedureWorkTaskWorkProducts
  **/

  public String getProspectCampaignProcedureWorkTaskWorkProducts() {
    return prospectCampaignProcedureWorkTaskWorkProducts;
  }

  public void setProspectCampaignProcedureWorkTaskWorkProducts(String prospectCampaignProcedureWorkTaskWorkProducts) {
    this.prospectCampaignProcedureWorkTaskWorkProducts = prospectCampaignProcedureWorkTaskWorkProducts;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to associated documents 
   * @return documentDirectoryEntryInstanceReference
  **/

  public String getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(String documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the outcome or result of the work task - can be the identification of prospects that have expressed an interest in becoming a customer 
   * @return prospectCampaignProcedureWorkTaskResult
  **/

  public String getProspectCampaignProcedureWorkTaskResult() {
    return prospectCampaignProcedureWorkTaskResult;
  }

  public void setProspectCampaignProcedureWorkTaskResult(String prospectCampaignProcedureWorkTaskResult) {
    this.prospectCampaignProcedureWorkTaskResult = prospectCampaignProcedureWorkTaskResult;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date-time the prospect campaign execution task is processed 
   * @return prospectCampaignProcedureWorkTaskDateTime
  **/

  public String getProspectCampaignProcedureWorkTaskDateTime() {
    return prospectCampaignProcedureWorkTaskDateTime;
  }

  public void setProspectCampaignProcedureWorkTaskDateTime(String prospectCampaignProcedureWorkTaskDateTime) {
    this.prospectCampaignProcedureWorkTaskDateTime = prospectCampaignProcedureWorkTaskDateTime;
  }


}

