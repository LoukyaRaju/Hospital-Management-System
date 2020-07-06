package com.tcs.ilp.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.tcs.ilp.models.Diagnostics;
import com.tcs.ilp.models.Medicine;

public class MedicineDao {
	
private Connection con;
	
	private PreparedStatement pst;
	
	private ResultSet rs;
	
	private List<Diagnostics> products;
	
	
	public MedicineDao() {
		
			try {
				
Class.forName("com.mysql.jdbc.Driver");
				
				this.con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/hms2","root","tiger123");
					
			}
			catch(Exception e) {
				
				System.out.println(e);
				
			}
	
	}

	public List<Medicine> getMedicineInfo(int patId) {
		// TODO Auto-generated method stub
		List<Medicine> d= new ArrayList<>();
		try {
			
			this.pst = this.con.prepareStatement("select m.medicine_id,m.medicine_name,t.quantity,m.rate from medicines m inner join trackingmed t on m.medicine_id=t.medicine_id and t.patient_id=?"); 
			this.pst.setInt(1,patId);
			this.rs = this.pst.executeQuery();
			while (rs.next()) {
				d.add(new Medicine(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4))) ;
			}
		} 
		catch(Exception e) {
			
			System.out.println(e);
		}

		return d;
	}

	public int checkAvailability(int medId) {
		// TODO Auto-generated method stub
		int q=0;
try {
			
			this.pst = this.con.prepareStatement("select * from medicines where medicine_Id=?"); 
			this.pst.setInt(1,medId);
			this.rs = this.pst.executeQuery();
			while (rs.next()) {
				q=rs.getInt("quantity");
			}
		} 
		catch(Exception e) {
			
			System.out.println(e);
		}

		
		return q;
	}

	public int addMedicine(int patId, int medId, int quant) {
		// TODO Auto-generated method stub
		int i=0;
		try {
			
			this.pst = this.con.prepareStatement("INSERT into trackingmed VALUES(?,?,?)");
			
			this.pst.setInt(1,patId);
			this.pst.setInt(2,medId);
			this.pst.setInt(3,quant);
			
					i = this.pst.executeUpdate();
					this.pst = this.con.prepareStatement("update medicines set quantity=quantity-'"+quant+"'  where medicine_id=?");
					
					this.pst.setInt(1,medId);
					  this.pst.executeUpdate();
						
		   
		}
		catch(Exception e) {
			
			System.out.println(e);
		}

		return i;

	}

		

}
