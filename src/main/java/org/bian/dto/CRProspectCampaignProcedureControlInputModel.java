package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProspectCampaignProcedureControlInputModelProspectCampaignProcedureControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignProcedureControlInputModel
 */
public class CRProspectCampaignProcedureControlInputModel   {
  private String prospectCampaignExecutionServicingSessionReference = null;

  private String prospectCampaignProcedureInstanceReference = null;

  private Object prospectCampaignProcedureControlActionTaskRecord = null;

  private CRProspectCampaignProcedureControlInputModelProspectCampaignProcedureControlActionRequest prospectCampaignProcedureControlActionRequest = null;


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
   * Get prospectCampaignProcedureControlActionRequest
   * @return prospectCampaignProcedureControlActionRequest
  **/

  public CRProspectCampaignProcedureControlInputModelProspectCampaignProcedureControlActionRequest getProspectCampaignProcedureControlActionRequest() {
    return prospectCampaignProcedureControlActionRequest;
  }

  public void setProspectCampaignProcedureControlActionRequest(CRProspectCampaignProcedureControlInputModelProspectCampaignProcedureControlActionRequest prospectCampaignProcedureControlActionRequest) {
    this.prospectCampaignProcedureControlActionRequest = prospectCampaignProcedureControlActionRequest;
  }


}

