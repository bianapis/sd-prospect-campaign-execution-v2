package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCandidateSelectionUpdateInputModelCandidateSelectionInstanceRecord
 */
public class BQCandidateSelectionUpdateInputModelCandidateSelectionInstanceRecord   {
  private String prospectCampaignSelectionCriteria = null;

  private String prospectCampaignCandidateEmployeeBusinessUnitReference = null;

  private String prospectCampaignCandidateReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details the selection criteria used to identify candidate prospects 
   * @return prospectCampaignSelectionCriteria
  **/

  public String getProspectCampaignSelectionCriteria() {
    return prospectCampaignSelectionCriteria;
  }

  public void setProspectCampaignSelectionCriteria(String prospectCampaignSelectionCriteria) {
    this.prospectCampaignSelectionCriteria = prospectCampaignSelectionCriteria;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the employee or business unit that confirms eligibility of the prospect list (e.g. confirming not current customer checks) 
   * @return prospectCampaignCandidateEmployeeBusinessUnitReference
  **/

  public String getProspectCampaignCandidateEmployeeBusinessUnitReference() {
    return prospectCampaignCandidateEmployeeBusinessUnitReference;
  }

  public void setProspectCampaignCandidateEmployeeBusinessUnitReference(String prospectCampaignCandidateEmployeeBusinessUnitReference) {
    this.prospectCampaignCandidateEmployeeBusinessUnitReference = prospectCampaignCandidateEmployeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the prospects selected as a candidate 
   * @return prospectCampaignCandidateReference
  **/

  public String getProspectCampaignCandidateReference() {
    return prospectCampaignCandidateReference;
  }

  public void setProspectCampaignCandidateReference(String prospectCampaignCandidateReference) {
    this.prospectCampaignCandidateReference = prospectCampaignCandidateReference;
  }


}

