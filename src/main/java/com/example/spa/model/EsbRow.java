package com.example.spa.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EsbRow {
	@JsonProperty("TransactionID")
	private String transactionId;

	@JsonProperty("CandidateID")
	private String candidateId;

	@JsonProperty("AppID")
	private String appId;

	@JsonProperty("ReqClient")
	private String reqClient;

	@JsonProperty("ProviderName")
	private String providerName;

	@JsonProperty("RespCode")
	private String respCode;

	@JsonProperty("RespMessage")
	private String respMessage;

	@JsonProperty("GlobalStartTime")
	private String globalStartTime;

	@JsonProperty("GlobalEndTime")
	private String globalEndTime;

	public String getTransactionID() {
		return transactionId;
	}

	public void setTransactionID(String v) {
		this.transactionId = v;
	}

	public String getCandidateID() {
		return candidateId;
	}

	public void setCandidateID(String v) {
		this.candidateId = v;
	}

	public String getAppID() {
		return appId;
	}

	public void setAppID(String v) {
		this.appId = v;
	}

	public String getReqClient() {
		return reqClient;
	}

	public void setReqClient(String v) {
		this.reqClient = v;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String v) {
		this.providerName = v;
	}

	public String getRespCode() {
		return respCode;
	}

	public void setRespCode(String v) {
		this.respCode = v;
	}

	public String getRespMessage() {
		return respMessage;
	}

	public void setRespMessage(String v) {
		this.respMessage = v;
	}

	public String getGlobalStartTime() {
		return globalStartTime;
	}

	public void setGlobalStartTime(String v) {
		this.globalStartTime = v;
	}

	public String getGlobalEndTime() {
		return globalEndTime;
	}

	public void setGlobalEndTime(String v) {
		this.globalEndTime = v;
	}
}
