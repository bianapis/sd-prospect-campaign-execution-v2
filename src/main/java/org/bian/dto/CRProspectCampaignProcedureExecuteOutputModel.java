package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignProcedureExecuteOutputModel
 */
public class CRProspectCampaignProcedureExecuteOutputModel   {
  private String prospectCampaignProcedureExecuteActionTaskReference = null;

  private Object prospectCampaignProcedureExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Prospect Campaign Procedure instance execute service call 
   * @return prospectCampaignProcedureExecuteActionTaskReference
  **/

  public String getProspectCampaignProcedureExecuteActionTaskReference() {
    return prospectCampaignProcedureExecuteActionTaskReference;
  }

  public void setProspectCampaignProcedureExecuteActionTaskReference(String prospectCampaignProcedureExecuteActionTaskReference) {
    this.prospectCampaignProcedureExecuteActionTaskReference = prospectCampaignProcedureExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return prospectCampaignProcedureExecuteActionTaskRecord
  **/

  public Object getProspectCampaignProcedureExecuteActionTaskRecord() {
    return prospectCampaignProcedureExecuteActionTaskRecord;
  }

  public void setProspectCampaignProcedureExecuteActionTaskRecord(Object prospectCampaignProcedureExecuteActionTaskRecord) {
    this.prospectCampaignProcedureExecuteActionTaskRecord = prospectCampaignProcedureExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

