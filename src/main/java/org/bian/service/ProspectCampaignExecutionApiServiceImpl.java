/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ProspectCampaignExecutionApiServiceImpl implements ProspectCampaignExecutionApiService {

	public SDProspectCampaignExecutionActivateOutputModel activate(SDProspectCampaignExecutionActivateInputModel request){
		return JsonReader.read("activate-SDProspectCampaignExecutionActivateOutputModel.json",new TypeReference<SDProspectCampaignExecutionActivateOutputModel>(){});
	}
	
	public SDProspectCampaignExecutionConfigureOutputModel configure(String sdReferenceId, SDProspectCampaignExecutionConfigureInputModel request){
		return JsonReader.read("configure-SDProspectCampaignExecutionConfigureOutputModel.json",new TypeReference<SDProspectCampaignExecutionConfigureOutputModel>(){});
	}
	
	public CRProspectCampaignProcedureControlOutputModel control(String sdReferenceId, String crReferenceId, CRProspectCampaignProcedureControlInputModel request){
		return JsonReader.read("control-CRProspectCampaignProcedureControlOutputModel.json",new TypeReference<CRProspectCampaignProcedureControlOutputModel>(){});
	}
	
	public BQCandidateSelectionExchangeOutputModel exchangeCandidateselection(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCandidateSelectionExchangeInputModel request){
		return JsonReader.read("exchange-BQCandidateSelectionExchangeOutputModel.json",new TypeReference<BQCandidateSelectionExchangeOutputModel>(){});
	}
	
	public CRProspectCampaignProcedureExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRProspectCampaignProcedureExchangeInputModel request){
		return JsonReader.read("exchange-CRProspectCampaignProcedureExchangeOutputModel.json",new TypeReference<CRProspectCampaignProcedureExchangeOutputModel>(){});
	}
	
	public CRProspectCampaignProcedureExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRProspectCampaignProcedureExecuteInputModel request){
		return JsonReader.read("execute-CRProspectCampaignProcedureExecuteOutputModel.json",new TypeReference<CRProspectCampaignProcedureExecuteOutputModel>(){});
	}
	
	public SDProspectCampaignExecutionFeedbackOutputModel feedback(String sdReferenceId, SDProspectCampaignExecutionFeedbackInputModel request){
		return JsonReader.read("feedback-SDProspectCampaignExecutionFeedbackOutputModel.json",new TypeReference<SDProspectCampaignExecutionFeedbackOutputModel>(){});
	}
	
	public CRProspectCampaignProcedureInitiateOutputModel initiate(String sdReferenceId, CRProspectCampaignProcedureInitiateInputModel request){
		return JsonReader.read("initiate-CRProspectCampaignProcedureInitiateOutputModel.json",new TypeReference<CRProspectCampaignProcedureInitiateOutputModel>(){});
	}
	
	public BQAnalysisInitiateOutputModel initiateAnalysis(String sdReferenceId, String crReferenceId, BQAnalysisInitiateInputModel request){
		return JsonReader.read("initiate-BQAnalysisInitiateOutputModel.json",new TypeReference<BQAnalysisInitiateOutputModel>(){});
	}
	
	public BQExecutionInitiateOutputModel initiateExecution(String sdReferenceId, String crReferenceId, BQExecutionInitiateInputModel request){
		return JsonReader.read("initiate-BQExecutionInitiateOutputModel.json",new TypeReference<BQExecutionInitiateOutputModel>(){});
	}
	
	public BQAnalysisRequestOutputModel requestAnalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAnalysisRequestInputModel request){
		return JsonReader.read("request-BQAnalysisRequestOutputModel.json",new TypeReference<BQAnalysisRequestOutputModel>(){});
	}
	
	public BQExecutionRequestOutputModel requestExecution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQExecutionRequestInputModel request){
		return JsonReader.read("request-BQExecutionRequestOutputModel.json",new TypeReference<BQExecutionRequestOutputModel>(){});
	}
	
	public CRProspectCampaignProcedureRequestOutputModel request(String sdReferenceId, String crReferenceId, CRProspectCampaignProcedureRequestInputModel request){
		return JsonReader.read("request-CRProspectCampaignProcedureRequestOutputModel.json",new TypeReference<CRProspectCampaignProcedureRequestOutputModel>(){});
	}
	
	public CRProspectCampaignProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRProspectCampaignProcedureRetrieveOutputModel.json",new TypeReference<CRProspectCampaignProcedureRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQAnalysisRetrieveOutputModel retrieveAnalysis(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAnalysisRetrieveOutputModel.json",new TypeReference<BQAnalysisRetrieveOutputModel>(){});
	}
	
	public BQCandidateSelectionRetrieveOutputModel retrieveCandidateselection(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCandidateSelectionRetrieveOutputModel.json",new TypeReference<BQCandidateSelectionRetrieveOutputModel>(){});
	}
	
	public BQExecutionRetrieveOutputModel retrieveExecution(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQExecutionRetrieveOutputModel.json",new TypeReference<BQExecutionRetrieveOutputModel>(){});
	}
	
	public SDProspectCampaignExecutionRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDProspectCampaignExecutionRetrieveOutputModel.json",new TypeReference<SDProspectCampaignExecutionRetrieveOutputModel>(){});
	}
	
	public CRProspectCampaignProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRProspectCampaignProcedureUpdateInputModel request){
		return JsonReader.read("update-CRProspectCampaignProcedureUpdateOutputModel.json",new TypeReference<CRProspectCampaignProcedureUpdateOutputModel>(){});
	}
	
	public BQAnalysisUpdateOutputModel updateAnalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAnalysisUpdateInputModel request){
		return JsonReader.read("update-BQAnalysisUpdateOutputModel.json",new TypeReference<BQAnalysisUpdateOutputModel>(){});
	}
	
	public BQCandidateSelectionUpdateOutputModel updateCandidateselection(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCandidateSelectionUpdateInputModel request){
		return JsonReader.read("update-BQCandidateSelectionUpdateOutputModel.json",new TypeReference<BQCandidateSelectionUpdateOutputModel>(){});
	}
	
	public BQExecutionUpdateOutputModel updateExecution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQExecutionUpdateInputModel request){
		return JsonReader.read("update-BQExecutionUpdateOutputModel.json",new TypeReference<BQExecutionUpdateOutputModel>(){});
	}
	
}
