package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignProcedureRetrieveInputModelProspectCampaignProcedureInstanceReportRecord
 */
public class CRProspectCampaignProcedureRetrieveInputModelProspectCampaignProcedureInstanceReportRecord   {
  private String prospectCampaignProcedureInstanceReportReference = null;

  private String prospectCampaignProcedureInstanceReportType = null;

  private String prospectCampaignProcedureInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return prospectCampaignProcedureInstanceReportReference
  **/

  public String getProspectCampaignProcedureInstanceReportReference() {
    return prospectCampaignProcedureInstanceReportReference;
  }

  public void setProspectCampaignProcedureInstanceReportReference(String prospectCampaignProcedureInstanceReportReference) {
    this.prospectCampaignProcedureInstanceReportReference = prospectCampaignProcedureInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return prospectCampaignProcedureInstanceReportParameters
  **/

  public String getProspectCampaignProcedureInstanceReportParameters() {
    return prospectCampaignProcedureInstanceReportParameters;
  }

  public void setProspectCampaignProcedureInstanceReportParameters(String prospectCampaignProcedureInstanceReportParameters) {
    this.prospectCampaignProcedureInstanceReportParameters = prospectCampaignProcedureInstanceReportParameters;
  }


}

