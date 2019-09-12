package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignProcedureControlOutputModel
 */
public class CRProspectCampaignProcedureControlOutputModel   {
  private String prospectCampaignProcedureControlActionTaskReference = null;

  private Object prospectCampaignProcedureControlActionTaskRecord = null;

  private String prospectCampaignProcedureControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Prospect Campaign Procedure instance control processing service call 
   * @return prospectCampaignProcedureControlActionTaskReference
  **/

  public String getProspectCampaignProcedureControlActionTaskReference() {
    return prospectCampaignProcedureControlActionTaskReference;
  }

  public void setProspectCampaignProcedureControlActionTaskReference(String prospectCampaignProcedureControlActionTaskReference) {
    this.prospectCampaignProcedureControlActionTaskReference = prospectCampaignProcedureControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return prospectCampaignProcedureControlActionTaskRecord
  **/

  public Object getProspectCampaignProcedureControlActionTaskRecord() {
    return prospectCampaignProcedureControlActionTaskRecord;
  }

  public void setProspectCampaignProcedureControlActionTaskRecord(Object prospectCampaignProcedureControlActionTaskRecord) {
    this.prospectCampaignProcedureControlActionTaskRecord = prospectCampaignProcedureControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return prospectCampaignProcedureControlActionResponse
  **/

  public String getProspectCampaignProcedureControlActionResponse() {
    return prospectCampaignProcedureControlActionResponse;
  }

  public void setProspectCampaignProcedureControlActionResponse(String prospectCampaignProcedureControlActionResponse) {
    this.prospectCampaignProcedureControlActionResponse = prospectCampaignProcedureControlActionResponse;
  }


}

