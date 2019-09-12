package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProspectCampaignProcedureInitiateOutputModelProspectCampaignProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignProcedureInitiateOutputModel
 */
public class CRProspectCampaignProcedureInitiateOutputModel   {
  private String prospectCampaignProcedureInstanceReference = null;

  private String prospectCampaignProcedureInitiateActionReference = null;

  private Object prospectCampaignProcedureInitiateActionRecord = null;

  private String prospectCampaignProcedureInstanceStatus = null;

  private CRProspectCampaignProcedureInitiateOutputModelProspectCampaignProcedureInstanceRecord prospectCampaignProcedureInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return prospectCampaignProcedureInitiateActionReference
  **/

  public String getProspectCampaignProcedureInitiateActionReference() {
    return prospectCampaignProcedureInitiateActionReference;
  }

  public void setProspectCampaignProcedureInitiateActionReference(String prospectCampaignProcedureInitiateActionReference) {
    this.prospectCampaignProcedureInitiateActionReference = prospectCampaignProcedureInitiateActionReference;
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

  public CRProspectCampaignProcedureInitiateOutputModelProspectCampaignProcedureInstanceRecord getProspectCampaignProcedureInstanceRecord() {
    return prospectCampaignProcedureInstanceRecord;
  }

  public void setProspectCampaignProcedureInstanceRecord(CRProspectCampaignProcedureInitiateOutputModelProspectCampaignProcedureInstanceRecord prospectCampaignProcedureInstanceRecord) {
    this.prospectCampaignProcedureInstanceRecord = prospectCampaignProcedureInstanceRecord;
  }


}

