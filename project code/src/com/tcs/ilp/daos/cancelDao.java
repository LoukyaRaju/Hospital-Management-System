package com.tcs.ilp.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.tcs.ilp.models.patientM;

public class cancelDao {
	private Connection con;
	private PreparedStatement pst;
	private ResultSet rs;
	private List<patientM> patient;
	public cancelDao() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			this.con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/hms2","root","tiger123");
			
		}
		catch(Exception e) {
			
			System.out.println(e);
			
		}
		
       }
	
	public int cancelpatient(String status,int patient_id)
	{
		int i=0;
		try {
			System.out.println(patient_id);
			this.pst = this.con.prepareStatement("UPDATE patient set status=? where patient_id=?");
			
			this.pst.setString(1,status);			
			this.pst.setInt(2,patient_id);			

			i = this.pst.executeUpdate();
}
catch(Exception e) {
	System.out.println(patient_id);
	System.out.println(e);
}

return i;
}

}
