package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignProcedureInitiateInputModelProspectCampaignProcedureInstanceRecordProspectCampaignConsumablesInventory
 */
public class CRProspectCampaignProcedureInitiateInputModelProspectCampaignProcedureInstanceRecordProspectCampaignConsumablesInventory   {
  private String prospectCampaignConsumableType = null;

  private String prospectCampaignConsumableHolding = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of consumable item associated with the campaign (e.g. gift, brochure) 
   * @return prospectCampaignConsumableType
  **/

  public String getProspectCampaignConsumableType() {
    return prospectCampaignConsumableType;
  }

  public void setProspectCampaignConsumableType(String prospectCampaignConsumableType) {
    this.prospectCampaignConsumableType = prospectCampaignConsumableType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The tracked inventory of the consumable item 
   * @return prospectCampaignConsumableHolding
  **/

  public String getProspectCampaignConsumableHolding() {
    return prospectCampaignConsumableHolding;
  }

  public void setProspectCampaignConsumableHolding(String prospectCampaignConsumableHolding) {
    this.prospectCampaignConsumableHolding = prospectCampaignConsumableHolding;
  }


}

