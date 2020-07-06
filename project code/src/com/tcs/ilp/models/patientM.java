package com.tcs.ilp.models;
public class patientM {
	
	private int ssn;
	private int patient_id;
	private String patient_name;
	private String address;
	private int age;
	private String doj;
	private String room_type;
	private String city;
	private String state;
	private String Status;
	
	public patientM()
	{
		
	}
	
	
	
	@Override
	public String toString() {
		return "patientM [ssn=" + ssn + ", patient_id=" + patient_id + ", patient_name=" + patient_name + ", address="
				+ address + ", age=" + age + ", doj=" + doj + ", room_type=" + room_type + ", city=" + city + ", state="
				+ state + ", Status=" + Status + "]";
	}



	public patientM(int ssn, int patient_id, String patient_name, String address, int age, String doj, String room_type,
			String city, String state, String status) {
		super();
		this.ssn = ssn;
		this.patient_id = patient_id;
		this.patient_name = patient_name;
		this.address = address;
		this.age = age;
		this.doj = doj;
		this.room_type = room_type;
		this.city = city;
		this.state = state;
		Status = status;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getStatus() {
		return Status;
	}



	public void setStatus(String status) {
		Status = status;
	}



	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public int getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getRoom_type() {
		return room_type;
	}
	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}
	
	

}
