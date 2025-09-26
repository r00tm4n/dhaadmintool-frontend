package com.example.spa.model;
public class EsbRow {
  private String transactionID;
  private String candidateID;
  private String appID;
  private String reqClient;
  private String providerName;
  private String respCode;
  private String respMessage;
  private String globalStartTime;
  private String globalEndTime;
  public String getTransactionID(){return transactionID;} public void setTransactionID(String v){this.transactionID=v;}
  public String getCandidateID(){return candidateID;} public void setCandidateID(String v){this.candidateID=v;}
  public String getAppID(){return appID;} public void setAppID(String v){this.appID=v;}
  public String getReqClient(){return reqClient;} public void setReqClient(String v){this.reqClient=v;}
  public String getProviderName(){return providerName;} public void setProviderName(String v){this.providerName=v;}
  public String getRespCode(){return respCode;} public void setRespCode(String v){this.respCode=v;}
  public String getRespMessage(){return respMessage;} public void setRespMessage(String v){this.respMessage=v;}
  public String getGlobalStartTime(){return globalStartTime;} public void setGlobalStartTime(String v){this.globalStartTime=v;}
  public String getGlobalEndTime(){return globalEndTime;} public void setGlobalEndTime(String v){this.globalEndTime=v;}
}
