package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQExecutionInitiateInputModelExecutionInstanceRecord;
import org.bian.dto.BQExecutionInitiateInputModelProspectCampaignProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQExecutionInitiateInputModel
 */
public class BQExecutionInitiateInputModel   {
  private BQExecutionInitiateInputModelProspectCampaignProcedureInstanceRecord prospectCampaignProcedureInstanceRecord = null;

  private String prospectCampaignProcedureInstanceReference = null;

  private Object executionInitiateActionRecord = null;

  private BQExecutionInitiateInputModelExecutionInstanceRecord executionInstanceRecord = null;


  /**
   * Get prospectCampaignProcedureInstanceRecord
   * @return prospectCampaignProcedureInstanceRecord
  **/

  public BQExecutionInitiateInputModelProspectCampaignProcedureInstanceRecord getProspectCampaignProcedureInstanceRecord() {
    return prospectCampaignProcedureInstanceRecord;
  }

  public void setProspectCampaignProcedureInstanceRecord(BQExecutionInitiateInputModelProspectCampaignProcedureInstanceRecord prospectCampaignProcedureInstanceRecord) {
    this.prospectCampaignProcedureInstanceRecord = prospectCampaignProcedureInstanceRecord;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return executionInitiateActionRecord
  **/

  public Object getExecutionInitiateActionRecord() {
    return executionInitiateActionRecord;
  }

  public void setExecutionInitiateActionRecord(Object executionInitiateActionRecord) {
    this.executionInitiateActionRecord = executionInitiateActionRecord;
  }


  /**
   * Get executionInstanceRecord
   * @return executionInstanceRecord
  **/

  public BQExecutionInitiateInputModelExecutionInstanceRecord getExecutionInstanceRecord() {
    return executionInstanceRecord;
  }

  public void setExecutionInstanceRecord(BQExecutionInitiateInputModelExecutionInstanceRecord executionInstanceRecord) {
    this.executionInstanceRecord = executionInstanceRecord;
  }


}

