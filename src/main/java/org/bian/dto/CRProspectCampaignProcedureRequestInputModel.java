package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProspectCampaignProcedureRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignProcedureRequestInputModel
 */
public class CRProspectCampaignProcedureRequestInputModel   {
  private String prospectCampaignExecutionServicingSessionReference = null;

  private String prospectCampaignProcedureInstanceReference = null;

  private Object prospectCampaignProcedureRequestActionTaskRecord = null;

  private CRProspectCampaignProcedureRequestInputModelRequestRecordType requestRecordType = null;


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

