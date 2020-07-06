package com.tcs.ilp.daos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.tcs.ilp.models.patientM;
public class patientDao {
	private Connection con;
	private PreparedStatement pst;
	private ResultSet rs;
	private List<patientM> patient;
	public patientDao() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			this.con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/hms2","root","tiger123");
			
		}
		catch(Exception e) {
			
			System.out.println(e);
			
		}
		
       }
	
		public int createPatient(int ssn, int patient_id, String patient_name, String address, int age, String doj,
			String room_type,String city,String state,String status)
		{
			int i=0;
			try {
				
				this.pst = this.con.prepareStatement("INSERT into patient VALUES(?,?,?,?,?,?,?,?,?,?)");
				
				this.pst.setInt(1,ssn);
				this.pst.setInt(2,patient_id);
				this.pst.setString(3, patient_name);
				this.pst.setString(4, address);
				this.pst.setInt(5,age);
				this.pst.setString(6, doj);
				this.pst.setString(7, room_type);
				this.pst.setString(8, city);
				this.pst.setString(9, state);
				this.pst.setString(10, status);

				i = this.pst.executeUpdate();
			}
			catch(Exception e) {
				
				System.out.println(e);
			}
			return i;
		}
		
		public int updatePatient(int ssn, int patient_id, String patient_name, String address, int age, String doj,
				String room_type,String city,String state,String status)
			{
				int i=0;
				try {
					
					this.pst = this.con.prepareStatement("UPDATE patient set ssn=?,patient_name=?,address=?,age=?,doj=?,room_type=?,city=?,state=?,status=? where patient_id=?");
					
					this.pst.setInt(1,ssn);
					this.pst.setString(2,patient_name);
					//this.pst.setString(3, patient_name);
					this.pst.setString(3, address);
					this.pst.setInt(4,age);
					this.pst.setString(5, doj);
					this.pst.setString(6, room_type);
					this.pst.setString(7, city);
					this.pst.setString(8, state);
					this.pst.setString(9, status);
					this.pst.setInt(10,patient_id);
					
					i = this.pst.executeUpdate();
				}
				catch(Exception e) {
					
					System.out.println(e);
				}
				return i;
			}
		public int deletePatient(int id)
		{
			  int i=0;
			  
				try {
					
					this.pst = this.con.prepareStatement("delete from patient where patient_id=? ");
					
					this.pst.setInt(1,id);
					
					i = this.pst.executeUpdate();
					
					
					
				}
				catch(Exception e) {
					
					System.out.println(e);
				}
				
				
				return i;
				
			}
public List<patientM> getAllPatients(String s) {

	
	List<patientM> users = new ArrayList<>();
	try {
	
		this.pst = this.con.prepareStatement("select * from patient "); 
		//System.out.println(this.pst);
		// Step 3: Execute the query or update query
		//this.pst.setString(1,s);
		this.rs = this.pst.executeQuery();

		// Step 4: Process the ResultSet object.
		while (rs.next()) {
//			int id = rs.getInt("id");
//			String name = rs.getString("name");
//			String email = rs.getString("email");
//			String country = rs.getString("country");
			users.add(new patientM(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10)));
		}
	} 
	catch(Exception e) {
		
		System.out.println(e);
	}
	return users;
	
}

		
		public List<patientM> getPatientDetails(int patId) {
			// TODO Auto-generated method stub
			
			List<patientM> users = new ArrayList<>();
			try {
			
				this.pst = this.con.prepareStatement("select * from patient where patient_id=?"); 
				this.pst.setInt(1, patId);
				this.rs = this.pst.executeQuery();
				while (rs.next()) {
					users.add(new patientM(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10)));
				}
			} 
			catch(Exception e) {
				System.out.println(patId);
				System.out.println(e);
			}

			
			return users;
		}

		public List<patientM> getDelDetails(int patId) {
			// TODO Auto-generated method stub
			
			List<patientM> users = new ArrayList<>();
			try {
			
				this.pst = this.con.prepareStatement("select * from patient where patient_id=?"); 
				this.pst.setInt(1, patId);
				this.rs = this.pst.executeQuery();
				while (rs.next()) {
					users.add(new patientM(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10)));
				}
			} 
			catch(Exception e) {
				System.out.println(patId);
				System.out.println(e);
			}

			
			return users;
		}
	}


