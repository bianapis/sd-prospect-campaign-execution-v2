package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProspectCampaignProcedureInitiateInputModelProspectCampaignProcedureInstanceRecordDateType;
import org.bian.dto.CRProspectCampaignProcedureInitiateInputModelProspectCampaignProcedureInstanceRecordProspectCampaignConsumablesInventory;
import org.bian.dto.CRProspectCampaignProcedureRetrieveOutputModelProspectCampaignProcedureInstanceRecordProspectCampaignProcedureResult;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignProcedureRetrieveOutputModelProspectCampaignProcedureInstanceRecord
 */
public class CRProspectCampaignProcedureRetrieveOutputModelProspectCampaignProcedureInstanceRecord   {
  private String prospectCampaignType = null;

  private String prospectCampaignDescription = null;

  private String employeeBusinessUnitReference = null;

  private String prospectCampaignProcedureSetup = null;

  private String prospectCampaignProcedureVersionNumber = null;

  private String prospectCampaignSchedule = null;

  private CRProspectCampaignProcedureInitiateInputModelProspectCampaignProcedureInstanceRecordProspectCampaignConsumablesInventory prospectCampaignConsumablesInventory = null;

  private CRProspectCampaignProcedureInitiateInputModelProspectCampaignProcedureInstanceRecordDateType dateType = null;

  private CRProspectCampaignProcedureRetrieveOutputModelProspectCampaignProcedureInstanceRecordProspectCampaignProcedureResult prospectCampaignProcedureResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type or category of prospect campaign (e.g. acquisition, product discount incentive) 
   * @return prospectCampaignType
  **/

  public String getProspectCampaignType() {
    return prospectCampaignType;
  }

  public void setProspectCampaignType(String prospectCampaignType) {
    this.prospectCampaignType = prospectCampaignType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A description of the campaign that clarifies the intended context/use of the campaign, the mechanisms employed and the intended/anticipated response/impact 
   * @return prospectCampaignDescription
  **/

  public String getProspectCampaignDescription() {
    return prospectCampaignDescription;
  }

  public void setProspectCampaignDescription(String prospectCampaignDescription) {
    this.prospectCampaignDescription = prospectCampaignDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the business unit responsible for the campaign execution 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the deployment set-up/configuration of the campaign for reference 
   * @return prospectCampaignProcedureSetup
  **/

  public String getProspectCampaignProcedureSetup() {
    return prospectCampaignProcedureSetup;
  }

  public void setProspectCampaignProcedureSetup(String prospectCampaignProcedureSetup) {
    this.prospectCampaignProcedureSetup = prospectCampaignProcedureSetup;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The prospect campaign version number used in the event 
   * @return prospectCampaignProcedureVersionNumber
  **/

  public String getProspectCampaignProcedureVersionNumber() {
    return prospectCampaignProcedureVersionNumber;
  }

  public void setProspectCampaignProcedureVersionNumber(String prospectCampaignProcedureVersionNumber) {
    this.prospectCampaignProcedureVersionNumber = prospectCampaignProcedureVersionNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The campaign processing schedule, covering prospect list selection/verification, execution, follow-up and analysis activities. Note this can be an ongoing campaign where worksteps continue in parallel 
   * @return prospectCampaignSchedule
  **/

  public String getProspectCampaignSchedule() {
    return prospectCampaignSchedule;
  }

  public void setProspectCampaignSchedule(String prospectCampaignSchedule) {
    this.prospectCampaignSchedule = prospectCampaignSchedule;
  }


  /**
   * Get prospectCampaignConsumablesInventory
   * @return prospectCampaignConsumablesInventory
  **/

  public CRProspectCampaignProcedureInitiateInputModelProspectCampaignProcedureInstanceRecordProspectCampaignConsumablesInventory getProspectCampaignConsumablesInventory() {
    return prospectCampaignConsumablesInventory;
  }

  public void setProspectCampaignConsumablesInventory(CRProspectCampaignProcedureInitiateInputModelProspectCampaignProcedureInstanceRecordProspectCampaignConsumablesInventory prospectCampaignConsumablesInventory) {
    this.prospectCampaignConsumablesInventory = prospectCampaignConsumablesInventory;
  }


  /**
   * Get dateType
   * @return dateType
  **/

  public CRProspectCampaignProcedureInitiateInputModelProspectCampaignProcedureInstanceRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(CRProspectCampaignProcedureInitiateInputModelProspectCampaignProcedureInstanceRecordDateType dateType) {
    this.dateType = dateType;
  }


  /**
   * Get prospectCampaignProcedureResult
   * @return prospectCampaignProcedureResult
  **/

  public CRProspectCampaignProcedureRetrieveOutputModelProspectCampaignProcedureInstanceRecordProspectCampaignProcedureResult getProspectCampaignProcedureResult() {
    return prospectCampaignProcedureResult;
  }

  public void setProspectCampaignProcedureResult(CRProspectCampaignProcedureRetrieveOutputModelProspectCampaignProcedureInstanceRecordProspectCampaignProcedureResult prospectCampaignProcedureResult) {
    this.prospectCampaignProcedureResult = prospectCampaignProcedureResult;
  }


}

