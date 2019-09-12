package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAnalysisRetrieveOutputModelAnalysisInstanceAnalysis;
import org.bian.dto.BQAnalysisRetrieveOutputModelAnalysisInstanceReport;
import org.bian.dto.BQAnalysisRetrieveOutputModelProspectCampaignProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAnalysisRetrieveOutputModel
 */
public class BQAnalysisRetrieveOutputModel   {
  private BQAnalysisRetrieveOutputModelProspectCampaignProcedureInstanceRecord prospectCampaignProcedureInstanceRecord = null;

  private String analysisRetrieveActionTaskReference = null;

  private Object analysisRetrieveActionTaskRecord = null;

  private String analysisRetrieveActionResponse = null;

  private BQAnalysisRetrieveOutputModelAnalysisInstanceReport analysisInstanceReport = null;

  private BQAnalysisRetrieveOutputModelAnalysisInstanceAnalysis analysisInstanceAnalysis = null;


  /**
   * Get prospectCampaignProcedureInstanceRecord
   * @return prospectCampaignProcedureInstanceRecord
  **/

  public BQAnalysisRetrieveOutputModelProspectCampaignProcedureInstanceRecord getProspectCampaignProcedureInstanceRecord() {
    return prospectCampaignProcedureInstanceRecord;
  }

  public void setProspectCampaignProcedureInstanceRecord(BQAnalysisRetrieveOutputModelProspectCampaignProcedureInstanceRecord prospectCampaignProcedureInstanceRecord) {
    this.prospectCampaignProcedureInstanceRecord = prospectCampaignProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Analysis instance retrieve service call 
   * @return analysisRetrieveActionTaskReference
  **/

  public String getAnalysisRetrieveActionTaskReference() {
    return analysisRetrieveActionTaskReference;
  }

  public void setAnalysisRetrieveActionTaskReference(String analysisRetrieveActionTaskReference) {
    this.analysisRetrieveActionTaskReference = analysisRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return analysisRetrieveActionTaskRecord
  **/

  public Object getAnalysisRetrieveActionTaskRecord() {
    return analysisRetrieveActionTaskRecord;
  }

  public void setAnalysisRetrieveActionTaskRecord(Object analysisRetrieveActionTaskRecord) {
    this.analysisRetrieveActionTaskRecord = analysisRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return analysisRetrieveActionResponse
  **/

  public String getAnalysisRetrieveActionResponse() {
    return analysisRetrieveActionResponse;
  }

  public void setAnalysisRetrieveActionResponse(String analysisRetrieveActionResponse) {
    this.analysisRetrieveActionResponse = analysisRetrieveActionResponse;
  }


  /**
   * Get analysisInstanceReport
   * @return analysisInstanceReport
  **/

  public BQAnalysisRetrieveOutputModelAnalysisInstanceReport getAnalysisInstanceReport() {
    return analysisInstanceReport;
  }

  public void setAnalysisInstanceReport(BQAnalysisRetrieveOutputModelAnalysisInstanceReport analysisInstanceReport) {
    this.analysisInstanceReport = analysisInstanceReport;
  }


  /**
   * Get analysisInstanceAnalysis
   * @return analysisInstanceAnalysis
  **/

  public BQAnalysisRetrieveOutputModelAnalysisInstanceAnalysis getAnalysisInstanceAnalysis() {
    return analysisInstanceAnalysis;
  }

  public void setAnalysisInstanceAnalysis(BQAnalysisRetrieveOutputModelAnalysisInstanceAnalysis analysisInstanceAnalysis) {
    this.analysisInstanceAnalysis = analysisInstanceAnalysis;
  }


}

