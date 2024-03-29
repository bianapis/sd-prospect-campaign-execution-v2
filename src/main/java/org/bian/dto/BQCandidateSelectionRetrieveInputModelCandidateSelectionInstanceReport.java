package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCandidateSelectionRetrieveInputModelCandidateSelectionInstanceReport
 */
public class BQCandidateSelectionRetrieveInputModelCandidateSelectionInstanceReport   {
  private String candidateSelectionInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return candidateSelectionInstanceReportReference
  **/

  public String getCandidateSelectionInstanceReportReference() {
    return candidateSelectionInstanceReportReference;
  }

  public void setCandidateSelectionInstanceReportReference(String candidateSelectionInstanceReportReference) {
    this.candidateSelectionInstanceReportReference = candidateSelectionInstanceReportReference;
  }


}

