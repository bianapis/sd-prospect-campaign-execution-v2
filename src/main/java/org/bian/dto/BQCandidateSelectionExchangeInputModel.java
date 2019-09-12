package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProspectCampaignProcedureExchangeInputModelProspectCampaignProcedureExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQCandidateSelectionExchangeInputModel
 */
public class BQCandidateSelectionExchangeInputModel   {
  private String prospectCampaignProcedureInstanceReference = null;

  private String candidateSelectionInstanceReference = null;

  private Object candidateSelectionExchangeActionTaskRecord = null;

  private CRProspectCampaignProcedureExchangeInputModelProspectCampaignProcedureExchangeActionRequest candidateSelectionExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Prospect Campaign Procedure instance 
   * @return prospectCampaignProcedureInstanceReference
  **/

  public String getProspectCampaignProcedureInstanceReference() {
    return prospectCampaignProcedureInstanceReference;
  }

  public void setProspectCampaignProcedureInstanceReference(String prospectCampaignProcedureInstanceReference) {
    this.prospectCampaignProcedureInstanceReference = prospectCampaignProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Candidate Selection instance 
   * @return candidateSelectionInstanceReference
  **/

  public String getCandidateSelectionInstanceReference() {
    return candidateSelectionInstanceReference;
  }

  public void setCandidateSelectionInstanceReference(String candidateSelectionInstanceReference) {
    this.candidateSelectionInstanceReference = candidateSelectionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return candidateSelectionExchangeActionTaskRecord
  **/

  public Object getCandidateSelectionExchangeActionTaskRecord() {
    return candidateSelectionExchangeActionTaskRecord;
  }

  public void setCandidateSelectionExchangeActionTaskRecord(Object candidateSelectionExchangeActionTaskRecord) {
    this.candidateSelectionExchangeActionTaskRecord = candidateSelectionExchangeActionTaskRecord;
  }


  /**
   * Get candidateSelectionExchangeActionRequest
   * @return candidateSelectionExchangeActionRequest
  **/

  public CRProspectCampaignProcedureExchangeInputModelProspectCampaignProcedureExchangeActionRequest getCandidateSelectionExchangeActionRequest() {
    return candidateSelectionExchangeActionRequest;
  }

  public void setCandidateSelectionExchangeActionRequest(CRProspectCampaignProcedureExchangeInputModelProspectCampaignProcedureExchangeActionRequest candidateSelectionExchangeActionRequest) {
    this.candidateSelectionExchangeActionRequest = candidateSelectionExchangeActionRequest;
  }


}

