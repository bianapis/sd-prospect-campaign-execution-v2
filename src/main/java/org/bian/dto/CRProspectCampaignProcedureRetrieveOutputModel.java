package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProspectCampaignProcedureRetrieveOutputModelProspectCampaignProcedureInstanceAnalysis;
import org.bian.dto.CRProspectCampaignProcedureRetrieveOutputModelProspectCampaignProcedureInstanceRecord;
import org.bian.dto.CRProspectCampaignProcedureRetrieveOutputModelProspectCampaignProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignProcedureRetrieveOutputModel
 */
public class CRProspectCampaignProcedureRetrieveOutputModel   {
  private CRProspectCampaignProcedureRetrieveOutputModelProspectCampaignProcedureInstanceRecord prospectCampaignProcedureInstanceRecord = null;

  private String prospectCampaignProcedureRetrieveActionTaskReference = null;

  private Object prospectCampaignProcedureRetrieveActionTaskRecord = null;

  private String prospectCampaignProcedureRetrieveActionResponse = null;

  private CRProspectCampaignProcedureRetrieveOutputModelProspectCampaignProcedureInstanceReportRecord prospectCampaignProcedureInstanceReportRecord = null;

  private CRProspectCampaignProcedureRetrieveOutputModelProspectCampaignProcedureInstanceAnalysis prospectCampaignProcedureInstanceAnalysis = null;


  /**
   * Get prospectCampaignProcedureInstanceRecord
   * @return prospectCampaignProcedureInstanceRecord
  **/

  public CRProspectCampaignProcedureRetrieveOutputModelProspectCampaignProcedureInstanceRecord getProspectCampaignProcedureInstanceRecord() {
    return prospectCampaignProcedureInstanceRecord;
  }

  public void setProspectCampaignProcedureInstanceRecord(CRProspectCampaignProcedureRetrieveOutputModelProspectCampaignProcedureInstanceRecord prospectCampaignProcedureInstanceRecord) {
    this.prospectCampaignProcedureInstanceRecord = prospectCampaignProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Prospect Campaign Procedure instance retrieve service call 
   * @return prospectCampaignProcedureRetrieveActionTaskReference
  **/

  public String getProspectCampaignProcedureRetrieveActionTaskReference() {
    return prospectCampaignProcedureRetrieveActionTaskReference;
  }

  public void setProspectCampaignProcedureRetrieveActionTaskReference(String prospectCampaignProcedureRetrieveActionTaskReference) {
    this.prospectCampaignProcedureRetrieveActionTaskReference = prospectCampaignProcedureRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return prospectCampaignProcedureRetrieveActionResponse
  **/

  public String getProspectCampaignProcedureRetrieveActionResponse() {
    return prospectCampaignProcedureRetrieveActionResponse;
  }

  public void setProspectCampaignProcedureRetrieveActionResponse(String prospectCampaignProcedureRetrieveActionResponse) {
    this.prospectCampaignProcedureRetrieveActionResponse = prospectCampaignProcedureRetrieveActionResponse;
  }


  /**
   * Get prospectCampaignProcedureInstanceReportRecord
   * @return prospectCampaignProcedureInstanceReportRecord
  **/

  public CRProspectCampaignProcedureRetrieveOutputModelProspectCampaignProcedureInstanceReportRecord getProspectCampaignProcedureInstanceReportRecord() {
    return prospectCampaignProcedureInstanceReportRecord;
  }

  public void setProspectCampaignProcedureInstanceReportRecord(CRProspectCampaignProcedureRetrieveOutputModelProspectCampaignProcedureInstanceReportRecord prospectCampaignProcedureInstanceReportRecord) {
    this.prospectCampaignProcedureInstanceReportRecord = prospectCampaignProcedureInstanceReportRecord;
  }


  /**
   * Get prospectCampaignProcedureInstanceAnalysis
   * @return prospectCampaignProcedureInstanceAnalysis
  **/

  public CRProspectCampaignProcedureRetrieveOutputModelProspectCampaignProcedureInstanceAnalysis getProspectCampaignProcedureInstanceAnalysis() {
    return prospectCampaignProcedureInstanceAnalysis;
  }

  public void setProspectCampaignProcedureInstanceAnalysis(CRProspectCampaignProcedureRetrieveOutputModelProspectCampaignProcedureInstanceAnalysis prospectCampaignProcedureInstanceAnalysis) {
    this.prospectCampaignProcedureInstanceAnalysis = prospectCampaignProcedureInstanceAnalysis;
  }


}

