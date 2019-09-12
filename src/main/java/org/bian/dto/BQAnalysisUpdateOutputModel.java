package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAnalysisUpdateOutputModelProspectCampaignProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAnalysisUpdateOutputModel
 */
public class BQAnalysisUpdateOutputModel   {
  private BQAnalysisUpdateOutputModelProspectCampaignProcedureInstanceRecord prospectCampaignProcedureInstanceRecord = null;

  private String analysisUpdateActionTaskReference = null;

  private Object analysisUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get prospectCampaignProcedureInstanceRecord
   * @return prospectCampaignProcedureInstanceRecord
  **/

  public BQAnalysisUpdateOutputModelProspectCampaignProcedureInstanceRecord getProspectCampaignProcedureInstanceRecord() {
    return prospectCampaignProcedureInstanceRecord;
  }

  public void setProspectCampaignProcedureInstanceRecord(BQAnalysisUpdateOutputModelProspectCampaignProcedureInstanceRecord prospectCampaignProcedureInstanceRecord) {
    this.prospectCampaignProcedureInstanceRecord = prospectCampaignProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return analysisUpdateActionTaskReference
  **/

  public String getAnalysisUpdateActionTaskReference() {
    return analysisUpdateActionTaskReference;
  }

  public void setAnalysisUpdateActionTaskReference(String analysisUpdateActionTaskReference) {
    this.analysisUpdateActionTaskReference = analysisUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return analysisUpdateActionTaskRecord
  **/

  public Object getAnalysisUpdateActionTaskRecord() {
    return analysisUpdateActionTaskRecord;
  }

  public void setAnalysisUpdateActionTaskRecord(Object analysisUpdateActionTaskRecord) {
    this.analysisUpdateActionTaskRecord = analysisUpdateActionTaskRecord;
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

