package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignProcedureExchangeOutputModel
 */
public class CRProspectCampaignProcedureExchangeOutputModel   {
  private String prospectCampaignProcedureExchangeActionTaskReference = null;

  private Object prospectCampaignProcedureExchangeActionTaskRecord = null;

  private String prospectCampaignProcedureExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Prospect Campaign Procedure instance exchange service call 
   * @return prospectCampaignProcedureExchangeActionTaskReference
  **/

  public String getProspectCampaignProcedureExchangeActionTaskReference() {
    return prospectCampaignProcedureExchangeActionTaskReference;
  }

  public void setProspectCampaignProcedureExchangeActionTaskReference(String prospectCampaignProcedureExchangeActionTaskReference) {
    this.prospectCampaignProcedureExchangeActionTaskReference = prospectCampaignProcedureExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return prospectCampaignProcedureExchangeActionTaskRecord
  **/

  public Object getProspectCampaignProcedureExchangeActionTaskRecord() {
    return prospectCampaignProcedureExchangeActionTaskRecord;
  }

  public void setProspectCampaignProcedureExchangeActionTaskRecord(Object prospectCampaignProcedureExchangeActionTaskRecord) {
    this.prospectCampaignProcedureExchangeActionTaskRecord = prospectCampaignProcedureExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return prospectCampaignProcedureExchangeActionResponse
  **/

  public String getProspectCampaignProcedureExchangeActionResponse() {
    return prospectCampaignProcedureExchangeActionResponse;
  }

  public void setProspectCampaignProcedureExchangeActionResponse(String prospectCampaignProcedureExchangeActionResponse) {
    this.prospectCampaignProcedureExchangeActionResponse = prospectCampaignProcedureExchangeActionResponse;
  }


}

