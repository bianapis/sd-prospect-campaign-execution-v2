package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQExecutionRequestInputModelExecutionInstanceRecord;
import org.bian.dto.CRProspectCampaignProcedureRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQExecutionRequestInputModel
 */
public class BQExecutionRequestInputModel   {
  private String prospectCampaignProcedureInstanceReference = null;

  private String executionInstanceReference = null;

  private BQExecutionRequestInputModelExecutionInstanceRecord executionInstanceRecord = null;

  private Object executionRequestActionTaskRecord = null;

  private CRProspectCampaignProcedureRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Prospect Campaign Procedure instance 
   * @return prospectCampaignProcedureInstanceReference
  **/

  public String getProspectCampaignProcedureInstanceReference() {
    return prospectCampaignProcedureInstanceReference;
  }

  public void setProspectCampaignProcedureInstanceReference(String prospectCampaignProcedureInstanceReference) {
    this.prospectCampaignProcedureInstanceReference = prospectCampaignProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Execution instance 
   * @return executionInstanceReference
  **/

  public String getExecutionInstanceReference() {
    return executionInstanceReference;
  }

  public void setExecutionInstanceReference(String executionInstanceReference) {
    this.executionInstanceReference = executionInstanceReference;
  }


  /**
   * Get executionInstanceRecord
   * @return executionInstanceRecord
  **/

  public BQExecutionRequestInputModelExecutionInstanceRecord getExecutionInstanceRecord() {
    return executionInstanceRecord;
  }

  public void setExecutionInstanceRecord(BQExecutionRequestInputModelExecutionInstanceRecord executionInstanceRecord) {
    this.executionInstanceRecord = executionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return executionRequestActionTaskRecord
  **/

  public Object getExecutionRequestActionTaskRecord() {
    return executionRequestActionTaskRecord;
  }

  public void setExecutionRequestActionTaskRecord(Object executionRequestActionTaskRecord) {
    this.executionRequestActionTaskRecord = executionRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRProspectCampaignProcedureRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRProspectCampaignProcedureRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

