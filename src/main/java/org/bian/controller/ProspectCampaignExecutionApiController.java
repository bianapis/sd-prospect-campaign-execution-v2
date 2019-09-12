/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Process;

@BianRestController
public class ProspectCampaignExecutionApiController {

	@Autowired
	ProspectCampaignExecutionApiService service;
	
	@Process.Activate
	public BianResponse<SDProspectCampaignExecutionActivateOutputModel> activate(@RequestBody BianRequest<SDProspectCampaignExecutionActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Process.Configure
	public BianResponse<SDProspectCampaignExecutionConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDProspectCampaignExecutionConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Process.Control
	public BianResponse<CRProspectCampaignProcedureControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRProspectCampaignProcedureControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("candidateselection")
	@Process.Exchange
	public BianResponse<BQCandidateSelectionExchangeOutputModel> exchangeCandidateselection(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCandidateSelectionExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeCandidateselection(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Process.Exchange
	public BianResponse<CRProspectCampaignProcedureExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRProspectCampaignProcedureExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Process.Execute
	public BianResponse<CRProspectCampaignProcedureExecuteOutputModel> execute(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRProspectCampaignProcedureExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.execute(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Process.Feedback
	public BianResponse<SDProspectCampaignExecutionFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDProspectCampaignExecutionFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Process.Initiate
	public BianResponse<CRProspectCampaignProcedureInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRProspectCampaignProcedureInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("analysis")
	@Process.Initiate
	public BianResponse<BQAnalysisInitiateOutputModel> initiateAnalysis(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQAnalysisInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateAnalysis(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("execution")
	@Process.Initiate
	public BianResponse<BQExecutionInitiateOutputModel> initiateExecution(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQExecutionInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateExecution(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("analysis")
	@Process.Request
	public BianResponse<BQAnalysisRequestOutputModel> requestAnalysis(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAnalysisRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestAnalysis(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("execution")
	@Process.Request
	public BianResponse<BQExecutionRequestOutputModel> requestExecution(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQExecutionRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestExecution(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Process.Request
	public BianResponse<CRProspectCampaignProcedureRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRProspectCampaignProcedureRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Process.Retrieve
	public BianResponse<CRProspectCampaignProcedureRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Process.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Process.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Process.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@BQ("analysis")
	@Process.Retrieve
	public BianResponse<BQAnalysisRetrieveOutputModel> retrieveAnalysis(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAnalysis(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("candidateselection")
	@Process.Retrieve
	public BianResponse<BQCandidateSelectionRetrieveOutputModel> retrieveCandidateselection(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCandidateselection(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("execution")
	@Process.Retrieve
	public BianResponse<BQExecutionRetrieveOutputModel> retrieveExecution(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveExecution(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Process.RetrieveSD
	public BianResponse<SDProspectCampaignExecutionRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Process.Update
	public BianResponse<CRProspectCampaignProcedureUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRProspectCampaignProcedureUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("analysis")
	@Process.Update
	public BianResponse<BQAnalysisUpdateOutputModel> updateAnalysis(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAnalysisUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateAnalysis(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("candidateselection")
	@Process.Update
	public BianResponse<BQCandidateSelectionUpdateOutputModel> updateCandidateselection(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCandidateSelectionUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateCandidateselection(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("execution")
	@Process.Update
	public BianResponse<BQExecutionUpdateOutputModel> updateExecution(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQExecutionUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateExecution(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
