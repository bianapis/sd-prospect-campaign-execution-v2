package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProspectCampaignProcedureExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignProcedureExecuteInputModel
 */
public class CRProspectCampaignProcedureExecuteInputModel   {
  private String prospectCampaignExecutionServicingSessionReference = null;

  private String prospectCampaignProcedureInstanceReference = null;

  private Object prospectCampaignProcedureExecuteActionTaskRecord = null;

  private CRProspectCampaignProcedureExecuteInputModelExecuteRecordType executeRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return prospectCampaignExecutionServicingSessionReference
  **/

  public String getProspectCampaignExecutionServicingSessionReference() {
    return prospectCampaignExecutionServicingSessionReference;
  }

  public void setProspectCampaignExecutionServicingSessionReference(String prospectCampaignExecutionServicingSessionReference) {
    this.prospectCampaignExecutionServicingSessionReference = prospectCampaignExecutionServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Prospect Campaign Procedure instance 
   * @return prospectCampaignProcedureInstanceReference
  **/

  public String getProspectCampaignProcedureInstanceReference() {
    return prospectCampaignProcedureInstanceReference;
  }

  public void setProspectCampaignProcedureInstanceReference(String prospectCampaignProcedureInstanceReference) {
    this.prospectCampaignProcedureInstanceReference = prospectCampaignProcedureInstanceReference;
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
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRProspectCampaignProcedureExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRProspectCampaignProcedureExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

