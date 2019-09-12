package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQExecutionInitiateInputModelExecutionInstanceRecord
 */
public class BQExecutionInitiateInputModelExecutionInstanceRecord   {
  private String prospectCampaignProcedureWorkTaskType = null;

  private String documentDirectoryEntryInstanceReference = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to associated documents 
   * @return documentDirectoryEntryInstanceReference
  **/

  public String getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(String documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }


}

