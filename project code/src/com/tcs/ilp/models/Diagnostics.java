package com.tcs.ilp.models;

public class Diagnostics {
	
	private int diagosticTestId;
	private String diagnosticTestName;
	private int charge;
	@Override
	public String toString() {
		return "Diagnostics [diagosticTestId=" + diagosticTestId + ", diagnosticTestName=" + diagnosticTestName
				+ ", charge=" + charge + "]";
	}
	public int getDiagosticTestId() {
		return diagosticTestId;
	}
	public void setDiagosticTestId(int diagosticTestId) {
		this.diagosticTestId = diagosticTestId;
	}
	public String getDiagnosticTestName() {
		return diagnosticTestName;
	}
	public void setDiagnosticTestName(String diagnosticTestName) {
		this.diagnosticTestName = diagnosticTestName;
	}
	public int getCharge() {
		return charge;
	}
	public void setCharge(int charge) {
		this.charge = charge;
	}
	public Diagnostics(int diagosticTestId, String diagnosticTestName, int charge) {
		super();
		this.diagosticTestId = diagosticTestId;
		this.diagnosticTestName = diagnosticTestName;
		this.charge = charge;
	}
	public Diagnostics() {
		
	}

}
