package com.example.spa.model;

import java.util.List;

public class PersonResponse {
	private String idnOrPcn;
	private String portraitBase64;
	private List<String> fingerprintsBase64;
	private List<DemoRow> demo;
	private List<WorkflowRow> workflow;

	public String getIdnOrPcn() {
		return idnOrPcn;
	}

	public void setIdnOrPcn(String v) {
		this.idnOrPcn = v;
	}

	public String getPortraitBase64() {
		return portraitBase64;
	}

	public void setPortraitBase64(String v) {
		this.portraitBase64 = v;
	}

	public List<String> getFingerprintsBase64() {
		return fingerprintsBase64;
	}

	public void setFingerprintsBase64(List<String> v) {
		this.fingerprintsBase64 = v;
	}

	public List<DemoRow> getDemo() {
		return demo;
	}

	public void setDemo(List<DemoRow> v) {
		this.demo = v;
	}

	public List<WorkflowRow> getWorkflow() {
		return workflow;
	}

	public void setWorkflow(List<WorkflowRow> v) {
		this.workflow = v;
	}
}
