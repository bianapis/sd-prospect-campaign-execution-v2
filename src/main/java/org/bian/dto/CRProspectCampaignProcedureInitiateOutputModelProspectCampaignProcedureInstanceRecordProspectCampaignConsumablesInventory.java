package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignProcedureInitiateOutputModelProspectCampaignProcedureInstanceRecordProspectCampaignConsumablesInventory
 */
public class CRProspectCampaignProcedureInitiateOutputModelProspectCampaignProcedureInstanceRecordProspectCampaignConsumablesInventory   {
  private String prospectCampaignConsumableHolding = null;


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

