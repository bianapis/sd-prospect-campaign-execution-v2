package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAnalysisRetrieveOutputModelProspectCampaignProcedureInstanceRecordProspectCampaignProcedureResult
 */
public class BQAnalysisRetrieveOutputModelProspectCampaignProcedureInstanceRecordProspectCampaignProcedureResult   {
  private String prospectCampaignProcedureProspectIdentification = null;

  private String partyLifecycleManagementProcedureInstanceReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A reference to prospects generated by the prospect campaign 
   * @return prospectCampaignProcedureProspectIdentification
  **/

  public String getProspectCampaignProcedureProspectIdentification() {
    return prospectCampaignProcedureProspectIdentification;
  }

  public void setProspectCampaignProcedureProspectIdentification(String prospectCampaignProcedureProspectIdentification) {
    this.prospectCampaignProcedureProspectIdentification = prospectCampaignProcedureProspectIdentification;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the prospect on-boarding task as handled by the Party Lifecycle Management Service Domain 
   * @return partyLifecycleManagementProcedureInstanceReference
  **/

  public String getPartyLifecycleManagementProcedureInstanceReference() {
    return partyLifecycleManagementProcedureInstanceReference;
  }

  public void setPartyLifecycleManagementProcedureInstanceReference(String partyLifecycleManagementProcedureInstanceReference) {
    this.partyLifecycleManagementProcedureInstanceReference = partyLifecycleManagementProcedureInstanceReference;
  }


}

