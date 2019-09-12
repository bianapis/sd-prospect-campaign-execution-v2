package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignProcedureRetrieveInputModelProspectCampaignProcedureInstanceAnalysis
 */
public class CRProspectCampaignProcedureRetrieveInputModelProspectCampaignProcedureInstanceAnalysis   {
  private String prospectCampaignProcedureInstanceAnalysisReference = null;

  private String prospectCampaignProcedureInstanceAnalysisReportType = null;

  private String prospectCampaignProcedureInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return prospectCampaignProcedureInstanceAnalysisReference
  **/

  public String getProspectCampaignProcedureInstanceAnalysisReference() {
    return prospectCampaignProcedureInstanceAnalysisReference;
  }

  public void setProspectCampaignProcedureInstanceAnalysisReference(String prospectCampaignProcedureInstanceAnalysisReference) {
    this.prospectCampaignProcedureInstanceAnalysisReference = prospectCampaignProcedureInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return prospectCampaignProcedureInstanceAnalysisParameters
  **/

  public String getProspectCampaignProcedureInstanceAnalysisParameters() {
    return prospectCampaignProcedureInstanceAnalysisParameters;
  }

  public void setProspectCampaignProcedureInstanceAnalysisParameters(String prospectCampaignProcedureInstanceAnalysisParameters) {
    this.prospectCampaignProcedureInstanceAnalysisParameters = prospectCampaignProcedureInstanceAnalysisParameters;
  }


}

