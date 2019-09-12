package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignProcedureRetrieveOutputModelProspectCampaignProcedureInstanceAnalysis
 */
public class CRProspectCampaignProcedureRetrieveOutputModelProspectCampaignProcedureInstanceAnalysis   {
  private String prospectCampaignProcedureInstanceAnalysisData = null;

  private String prospectCampaignProcedureInstanceAnalysisReportType = null;

  private Object prospectCampaignProcedureInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return prospectCampaignProcedureInstanceAnalysisData
  **/

  public String getProspectCampaignProcedureInstanceAnalysisData() {
    return prospectCampaignProcedureInstanceAnalysisData;
  }

  public void setProspectCampaignProcedureInstanceAnalysisData(String prospectCampaignProcedureInstanceAnalysisData) {
    this.prospectCampaignProcedureInstanceAnalysisData = prospectCampaignProcedureInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return prospectCampaignProcedureInstanceAnalysisReportType
  **/

  public String getProspectCampaignProcedureInstanceAnalysisReportType() {
    return prospectCampaignProcedureInstanceAnalysisReportType;
  }

  public void setProspectCampaignProcedureInstanceAnalysisReportType(String prospectCampaignProcedureInstanceAnalysisReportType) {
    this.prospectCampaignProcedureInstanceAnalysisReportType = prospectCampaignProcedureInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return prospectCampaignProcedureInstanceAnalysisReport
  **/

  public Object getProspectCampaignProcedureInstanceAnalysisReport() {
    return prospectCampaignProcedureInstanceAnalysisReport;
  }

  public void setProspectCampaignProcedureInstanceAnalysisReport(Object prospectCampaignProcedureInstanceAnalysisReport) {
    this.prospectCampaignProcedureInstanceAnalysisReport = prospectCampaignProcedureInstanceAnalysisReport;
  }


}

