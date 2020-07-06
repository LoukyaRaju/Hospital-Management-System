package com.tcs.ilp.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.tcs.ilp.models.Diagnostics;
import com.tcs.ilp.models.patientM;

public class finalbillDao {
private Connection con;
	
	private PreparedStatement pst;
	
	private ResultSet rs;
	
	private List<Diagnostics> products;
	
	
	public finalbillDao() {
		
			try {
				
Class.forName("com.mysql.jdbc.Driver");
				
				this.con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/hms2","root","tiger123");
				
			}
			catch(Exception e) {
				
				System.out.println(e);
				
			}
	
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
			
			System.out.println(e);
		}

		
		return users;
	}
	
/*	public List<patientM> getchangeDetails(int patId) {
		// TODO Auto-generated method stub
		
		List<patientM> users = new ArrayList<>();
		try {
		
			this.pst = this.con.prepareStatement("update patient set status=discharged where patient_id=?"); 
			
			this.rs = this.pst.executeQuery();
			
			
		} 
		catch(Exception e) {
			
			System.out.println(e);
		}

		
		return users;
	}*/
	
	public List<Diagnostics> getDiagInfo(int diagId) {
		// TODO Auto-generated method stub
		List<Diagnostics> d= new ArrayList<>();
		try {
			
			this.pst = this.con.prepareStatement("select * from diagnostics d inner join testdiag t on t.diagId=d.TestId where t.patientId=?"); 
			this.pst.setInt(1, diagId);
			this.rs = this.pst.executeQuery();
			while (rs.next()) {
				d.add(new Diagnostics(rs.getInt(1),rs.getString(2),rs.getInt(3))) ;
			}
		} 
		catch(Exception e) {
			
			System.out.println(e);
		}

		return d;
	
	}
}
