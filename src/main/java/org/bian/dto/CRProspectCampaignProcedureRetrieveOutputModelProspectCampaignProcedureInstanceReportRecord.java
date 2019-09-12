package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignProcedureRetrieveOutputModelProspectCampaignProcedureInstanceReportRecord
 */
public class CRProspectCampaignProcedureRetrieveOutputModelProspectCampaignProcedureInstanceReportRecord   {
  private String prospectCampaignProcedureInstanceReportData = null;

  private String prospectCampaignProcedureInstanceReportType = null;

  private Object prospectCampaignProcedureInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return prospectCampaignProcedureInstanceReportData
  **/

  public String getProspectCampaignProcedureInstanceReportData() {
    return prospectCampaignProcedureInstanceReportData;
  }

  public void setProspectCampaignProcedureInstanceReportData(String prospectCampaignProcedureInstanceReportData) {
    this.prospectCampaignProcedureInstanceReportData = prospectCampaignProcedureInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return prospectCampaignProcedureInstanceReportType
  **/

  public String getProspectCampaignProcedureInstanceReportType() {
    return prospectCampaignProcedureInstanceReportType;
  }

  public void setProspectCampaignProcedureInstanceReportType(String prospectCampaignProcedureInstanceReportType) {
    this.prospectCampaignProcedureInstanceReportType = prospectCampaignProcedureInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return prospectCampaignProcedureInstanceReport
  **/

  public Object getProspectCampaignProcedureInstanceReport() {
    return prospectCampaignProcedureInstanceReport;
  }

  public void setProspectCampaignProcedureInstanceReport(Object prospectCampaignProcedureInstanceReport) {
    this.prospectCampaignProcedureInstanceReport = prospectCampaignProcedureInstanceReport;
  }


}

