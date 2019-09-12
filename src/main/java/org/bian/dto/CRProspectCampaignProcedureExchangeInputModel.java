package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProspectCampaignProcedureExchangeInputModelProspectCampaignProcedureExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignProcedureExchangeInputModel
 */
public class CRProspectCampaignProcedureExchangeInputModel   {
  private String prospectCampaignExecutionServicingSessionReference = null;

  private String prospectCampaignProcedureInstanceReference = null;

  private Object prospectCampaignProcedureExchangeActionTaskRecord = null;

  private CRProspectCampaignProcedureExchangeInputModelProspectCampaignProcedureExchangeActionRequest prospectCampaignProcedureExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return prospectCampaignExecutionServicingSessionReference
  **/

  public String getProspectCampaignExecutionServicingSessionReference() {
    return prospectCampaignExecutionServicingSessionReference;
  }

  public void setProspectCampaignExecutionServicingSessionReference(String prospectCampaignExecutionServicingSessionReference) {
    this.prospectCampaignExecutionServicingSessionReference = prospectCampaignExecutionServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Prospect Campaign Procedure instance 
   * @return prospectCampaignProcedureInstanceReference
  **/

  public String getProspectCampaignProcedureInstanceReference() {
    return prospectCampaignProcedureInstanceReference;
  }

  public void setProspectCampaignProcedureInstanceReference(String prospectCampaignProcedureInstanceReference) {
    this.prospectCampaignProcedureInstanceReference = prospectCampaignProcedureInstanceReference;
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
   * Get prospectCampaignProcedureExchangeActionRequest
   * @return prospectCampaignProcedureExchangeActionRequest
  **/

  public CRProspectCampaignProcedureExchangeInputModelProspectCampaignProcedureExchangeActionRequest getProspectCampaignProcedureExchangeActionRequest() {
    return prospectCampaignProcedureExchangeActionRequest;
  }

  public void setProspectCampaignProcedureExchangeActionRequest(CRProspectCampaignProcedureExchangeInputModelProspectCampaignProcedureExchangeActionRequest prospectCampaignProcedureExchangeActionRequest) {
    this.prospectCampaignProcedureExchangeActionRequest = prospectCampaignProcedureExchangeActionRequest;
  }


}

