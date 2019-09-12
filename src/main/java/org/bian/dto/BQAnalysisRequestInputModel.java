package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProspectCampaignProcedureRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQAnalysisRequestInputModel
 */
public class BQAnalysisRequestInputModel   {
  private String prospectCampaignProcedureInstanceReference = null;

  private String analysisInstanceReference = null;

  private Object analysisRequestActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Analysis instance 
   * @return analysisInstanceReference
  **/

  public String getAnalysisInstanceReference() {
    return analysisInstanceReference;
  }

  public void setAnalysisInstanceReference(String analysisInstanceReference) {
    this.analysisInstanceReference = analysisInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return analysisRequestActionTaskRecord
  **/

  public Object getAnalysisRequestActionTaskRecord() {
    return analysisRequestActionTaskRecord;
  }

  public void setAnalysisRequestActionTaskRecord(Object analysisRequestActionTaskRecord) {
    this.analysisRequestActionTaskRecord = analysisRequestActionTaskRecord;
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

