package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignProcedureUpdateOutputModel
 */
public class CRProspectCampaignProcedureUpdateOutputModel   {
  private String prospectCampaignProcedureUpdateActionTaskReference = null;

  private Object prospectCampaignProcedureUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return prospectCampaignProcedureUpdateActionTaskReference
  **/

  public String getProspectCampaignProcedureUpdateActionTaskReference() {
    return prospectCampaignProcedureUpdateActionTaskReference;
  }

  public void setProspectCampaignProcedureUpdateActionTaskReference(String prospectCampaignProcedureUpdateActionTaskReference) {
    this.prospectCampaignProcedureUpdateActionTaskReference = prospectCampaignProcedureUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return prospectCampaignProcedureUpdateActionTaskRecord
  **/

  public Object getProspectCampaignProcedureUpdateActionTaskRecord() {
    return prospectCampaignProcedureUpdateActionTaskRecord;
  }

  public void setProspectCampaignProcedureUpdateActionTaskRecord(Object prospectCampaignProcedureUpdateActionTaskRecord) {
    this.prospectCampaignProcedureUpdateActionTaskRecord = prospectCampaignProcedureUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

