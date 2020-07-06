package com.tcs.ilp.models;

public class Medicine {

	private int medi_id;

	private String medi_name;
	private int medi_quant;

	private int medi_rate;

	public Medicine() {
		
	}
	public Medicine(int medi_id, String medi_name, int medi_quant, int medi_rate) {
		super();
		this.medi_id = medi_id;
		this.medi_name = medi_name;
		this.medi_quant = medi_quant;
		this.medi_rate = medi_rate;
	}

	public int getMedi_id() {
		return medi_id;
	}

	public void setMedi_id(int medi_id) {
		this.medi_id = medi_id;
	}

	public String getMedi_name() {
		return medi_name;
	}

	public void setMedi_name(String medi_name) {
		this.medi_name = medi_name;
	}

	public int getMedi_quant() {
		return medi_quant;
	}

	public void setMedi_quant(int medi_quant) {
		this.medi_quant = medi_quant;
	}

	public int getMedi_rate() {
		return medi_rate;
	}

	public void setMedi_rate(int medi_rate) {
		this.medi_rate = medi_rate;
	}

	@Override
	public String toString() {
		return "Medicine [medi_id=" + medi_id + ", medi_name=" + medi_name + ", medi_quant=" + medi_quant
				+ ", medi_rate=" + medi_rate + "]";
	}
	
	
	
}
