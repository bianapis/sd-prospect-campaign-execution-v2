package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCandidateSelectionUpdateInputModelCandidateSelectionInstanceRecord;
import org.bian.dto.BQCandidateSelectionUpdateInputModelProspectCampaignProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCandidateSelectionUpdateOutputModel
 */
public class BQCandidateSelectionUpdateOutputModel   {
  private BQCandidateSelectionUpdateInputModelProspectCampaignProcedureInstanceRecord prospectCampaignProcedureInstanceRecord = null;

  private BQCandidateSelectionUpdateInputModelCandidateSelectionInstanceRecord candidateSelectionInstanceRecord = null;

  private String candidateSelectionUpdateActionTaskReference = null;

  private Object candidateSelectionUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get prospectCampaignProcedureInstanceRecord
   * @return prospectCampaignProcedureInstanceRecord
  **/

  public BQCandidateSelectionUpdateInputModelProspectCampaignProcedureInstanceRecord getProspectCampaignProcedureInstanceRecord() {
    return prospectCampaignProcedureInstanceRecord;
  }

  public void setProspectCampaignProcedureInstanceRecord(BQCandidateSelectionUpdateInputModelProspectCampaignProcedureInstanceRecord prospectCampaignProcedureInstanceRecord) {
    this.prospectCampaignProcedureInstanceRecord = prospectCampaignProcedureInstanceRecord;
  }


  /**
   * Get candidateSelectionInstanceRecord
   * @return candidateSelectionInstanceRecord
  **/

  public BQCandidateSelectionUpdateInputModelCandidateSelectionInstanceRecord getCandidateSelectionInstanceRecord() {
    return candidateSelectionInstanceRecord;
  }

  public void setCandidateSelectionInstanceRecord(BQCandidateSelectionUpdateInputModelCandidateSelectionInstanceRecord candidateSelectionInstanceRecord) {
    this.candidateSelectionInstanceRecord = candidateSelectionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return candidateSelectionUpdateActionTaskReference
  **/

  public String getCandidateSelectionUpdateActionTaskReference() {
    return candidateSelectionUpdateActionTaskReference;
  }

  public void setCandidateSelectionUpdateActionTaskReference(String candidateSelectionUpdateActionTaskReference) {
    this.candidateSelectionUpdateActionTaskReference = candidateSelectionUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return candidateSelectionUpdateActionTaskRecord
  **/

  public Object getCandidateSelectionUpdateActionTaskRecord() {
    return candidateSelectionUpdateActionTaskRecord;
  }

  public void setCandidateSelectionUpdateActionTaskRecord(Object candidateSelectionUpdateActionTaskRecord) {
    this.candidateSelectionUpdateActionTaskRecord = candidateSelectionUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

