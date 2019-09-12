package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProspectCampaignProcedureInitiateInputModelProspectCampaignProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignProcedureInitiateInputModel
 */
public class CRProspectCampaignProcedureInitiateInputModel   {
  private String prospectCampaignExecutionServicingSessionReference = null;

  private Object prospectCampaignProcedureInitiateActionRecord = null;

  private String prospectCampaignProcedureInstanceStatus = null;

  private CRProspectCampaignProcedureInitiateInputModelProspectCampaignProcedureInstanceRecord prospectCampaignProcedureInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return prospectCampaignProcedureInitiateActionRecord
  **/

  public Object getProspectCampaignProcedureInitiateActionRecord() {
    return prospectCampaignProcedureInitiateActionRecord;
  }

  public void setProspectCampaignProcedureInitiateActionRecord(Object prospectCampaignProcedureInitiateActionRecord) {
    this.prospectCampaignProcedureInitiateActionRecord = prospectCampaignProcedureInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Prospect Campaign Procedure instance (e.g. initialised, pending, active) 
   * @return prospectCampaignProcedureInstanceStatus
  **/

  public String getProspectCampaignProcedureInstanceStatus() {
    return prospectCampaignProcedureInstanceStatus;
  }

  public void setProspectCampaignProcedureInstanceStatus(String prospectCampaignProcedureInstanceStatus) {
    this.prospectCampaignProcedureInstanceStatus = prospectCampaignProcedureInstanceStatus;
  }


  /**
   * Get prospectCampaignProcedureInstanceRecord
   * @return prospectCampaignProcedureInstanceRecord
  **/

  public CRProspectCampaignProcedureInitiateInputModelProspectCampaignProcedureInstanceRecord getProspectCampaignProcedureInstanceRecord() {
    return prospectCampaignProcedureInstanceRecord;
  }

  public void setProspectCampaignProcedureInstanceRecord(CRProspectCampaignProcedureInitiateInputModelProspectCampaignProcedureInstanceRecord prospectCampaignProcedureInstanceRecord) {
    this.prospectCampaignProcedureInstanceRecord = prospectCampaignProcedureInstanceRecord;
  }


}

