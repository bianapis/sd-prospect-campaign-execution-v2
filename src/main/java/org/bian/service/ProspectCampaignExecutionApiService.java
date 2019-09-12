/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ProspectCampaignExecutionApiService {

	SDProspectCampaignExecutionActivateOutputModel activate(SDProspectCampaignExecutionActivateInputModel request);
	
	SDProspectCampaignExecutionConfigureOutputModel configure(String sdReferenceId, SDProspectCampaignExecutionConfigureInputModel request);
	
	CRProspectCampaignProcedureControlOutputModel control(String sdReferenceId, String crReferenceId, CRProspectCampaignProcedureControlInputModel request);
	
	BQCandidateSelectionExchangeOutputModel exchangeCandidateselection(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCandidateSelectionExchangeInputModel request);
	
	CRProspectCampaignProcedureExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRProspectCampaignProcedureExchangeInputModel request);
	
	CRProspectCampaignProcedureExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRProspectCampaignProcedureExecuteInputModel request);
	
	SDProspectCampaignExecutionFeedbackOutputModel feedback(String sdReferenceId, SDProspectCampaignExecutionFeedbackInputModel request);
	
	CRProspectCampaignProcedureInitiateOutputModel initiate(String sdReferenceId, CRProspectCampaignProcedureInitiateInputModel request);
	
	BQAnalysisInitiateOutputModel initiateAnalysis(String sdReferenceId, String crReferenceId, BQAnalysisInitiateInputModel request);
	
	BQExecutionInitiateOutputModel initiateExecution(String sdReferenceId, String crReferenceId, BQExecutionInitiateInputModel request);
	
	BQAnalysisRequestOutputModel requestAnalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAnalysisRequestInputModel request);
	
	BQExecutionRequestOutputModel requestExecution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQExecutionRequestInputModel request);
	
	CRProspectCampaignProcedureRequestOutputModel request(String sdReferenceId, String crReferenceId, CRProspectCampaignProcedureRequestInputModel request);
	
	CRProspectCampaignProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQAnalysisRetrieveOutputModel retrieveAnalysis(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQCandidateSelectionRetrieveOutputModel retrieveCandidateselection(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQExecutionRetrieveOutputModel retrieveExecution(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDProspectCampaignExecutionRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRProspectCampaignProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRProspectCampaignProcedureUpdateInputModel request);
	
	BQAnalysisUpdateOutputModel updateAnalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAnalysisUpdateInputModel request);
	
	BQCandidateSelectionUpdateOutputModel updateCandidateselection(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCandidateSelectionUpdateInputModel request);
	
	BQExecutionUpdateOutputModel updateExecution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQExecutionUpdateInputModel request);
	
}
