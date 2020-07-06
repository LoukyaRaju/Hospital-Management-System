package com.tcs.ilp.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.tcs.ilp.models.Diagnostics;
import com.tcs.ilp.models.patientM;

public class DiagnosticsDAO {
	
private Connection con;
	
	private PreparedStatement pst;
	
	private ResultSet rs;
	
	private List<Diagnostics> products;
	
	
	public DiagnosticsDAO() {
		
			try {
				
Class.forName("com.mysql.jdbc.Driver");
				
				this.con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/hms2","root","tiger123");
					
			}
			catch(Exception e) {
				
				System.out.println(e);
				
			}
	
	}

public int addDiagnostics(int patId,int DiagId)
{
	int i=0;
	try {
		
		this.pst = this.con.prepareStatement("INSERT into testdiag VALUES(?,?)");
		
		this.pst.setInt(1,patId);
		this.pst.setInt(2,DiagId);
	
				i = this.pst.executeUpdate();
	}
	catch(Exception e) {
		
		System.out.println(e);
	}

	return i;
}

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
