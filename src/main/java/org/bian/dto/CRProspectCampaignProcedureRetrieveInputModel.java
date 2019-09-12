package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProspectCampaignProcedureRetrieveInputModelProspectCampaignProcedureInstanceAnalysis;
import org.bian.dto.CRProspectCampaignProcedureRetrieveInputModelProspectCampaignProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignProcedureRetrieveInputModel
 */
public class CRProspectCampaignProcedureRetrieveInputModel   {
  private Object prospectCampaignProcedureRetrieveActionTaskRecord = null;

  private String prospectCampaignProcedureRetrieveActionRequest = null;

  private CRProspectCampaignProcedureRetrieveInputModelProspectCampaignProcedureInstanceReportRecord prospectCampaignProcedureInstanceReportRecord = null;

  private CRProspectCampaignProcedureRetrieveInputModelProspectCampaignProcedureInstanceAnalysis prospectCampaignProcedureInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return prospectCampaignProcedureRetrieveActionTaskRecord
  **/

  public Object getProspectCampaignProcedureRetrieveActionTaskRecord() {
    return prospectCampaignProcedureRetrieveActionTaskRecord;
  }

  public void setProspectCampaignProcedureRetrieveActionTaskRecord(Object prospectCampaignProcedureRetrieveActionTaskRecord) {
    this.prospectCampaignProcedureRetrieveActionTaskRecord = prospectCampaignProcedureRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return prospectCampaignProcedureRetrieveActionRequest
  **/

  public String getProspectCampaignProcedureRetrieveActionRequest() {
    return prospectCampaignProcedureRetrieveActionRequest;
  }

  public void setProspectCampaignProcedureRetrieveActionRequest(String prospectCampaignProcedureRetrieveActionRequest) {
    this.prospectCampaignProcedureRetrieveActionRequest = prospectCampaignProcedureRetrieveActionRequest;
  }


  /**
   * Get prospectCampaignProcedureInstanceReportRecord
   * @return prospectCampaignProcedureInstanceReportRecord
  **/

  public CRProspectCampaignProcedureRetrieveInputModelProspectCampaignProcedureInstanceReportRecord getProspectCampaignProcedureInstanceReportRecord() {
    return prospectCampaignProcedureInstanceReportRecord;
  }

  public void setProspectCampaignProcedureInstanceReportRecord(CRProspectCampaignProcedureRetrieveInputModelProspectCampaignProcedureInstanceReportRecord prospectCampaignProcedureInstanceReportRecord) {
    this.prospectCampaignProcedureInstanceReportRecord = prospectCampaignProcedureInstanceReportRecord;
  }


  /**
   * Get prospectCampaignProcedureInstanceAnalysis
   * @return prospectCampaignProcedureInstanceAnalysis
  **/

  public CRProspectCampaignProcedureRetrieveInputModelProspectCampaignProcedureInstanceAnalysis getProspectCampaignProcedureInstanceAnalysis() {
    return prospectCampaignProcedureInstanceAnalysis;
  }

  public void setProspectCampaignProcedureInstanceAnalysis(CRProspectCampaignProcedureRetrieveInputModelProspectCampaignProcedureInstanceAnalysis prospectCampaignProcedureInstanceAnalysis) {
    this.prospectCampaignProcedureInstanceAnalysis = prospectCampaignProcedureInstanceAnalysis;
  }


}

