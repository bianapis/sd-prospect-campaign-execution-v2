package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignProcedureRequestOutputModel
 */
public class CRProspectCampaignProcedureRequestOutputModel   {
  private String prospectCampaignProcedureRequestActionTaskReference = null;

  private Object prospectCampaignProcedureRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Prospect Campaign Procedure instance request service call 
   * @return prospectCampaignProcedureRequestActionTaskReference
  **/

  public String getProspectCampaignProcedureRequestActionTaskReference() {
    return prospectCampaignProcedureRequestActionTaskReference;
  }

  public void setProspectCampaignProcedureRequestActionTaskReference(String prospectCampaignProcedureRequestActionTaskReference) {
    this.prospectCampaignProcedureRequestActionTaskReference = prospectCampaignProcedureRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return prospectCampaignProcedureRequestActionTaskRecord
  **/

  public Object getProspectCampaignProcedureRequestActionTaskRecord() {
    return prospectCampaignProcedureRequestActionTaskRecord;
  }

  public void setProspectCampaignProcedureRequestActionTaskRecord(Object prospectCampaignProcedureRequestActionTaskRecord) {
    this.prospectCampaignProcedureRequestActionTaskRecord = prospectCampaignProcedureRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

