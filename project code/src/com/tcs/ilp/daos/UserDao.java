package com.tcs.ilp.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao {
	
	 private Connection con;
		
		private PreparedStatement pst;
		
		private ResultSet rs;
		
		public UserDao(){
			try {
				
Class.forName("com.mysql.jdbc.Driver");
				
				this.con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/hms2","root","tiger123");
				
			}
			catch(Exception e) {
				
				System.out.println(e);
				
			}

			
		}
		
	     public int validateUser(String username,String password)
	     {
	    	 int c=0;
	    	try {
	    	  this.pst = this.con.prepareStatement("SELECT * from login");
				
			
			
				this.rs = pst.executeQuery();
				
				while(rs.next()){
					
					if(rs.getString(1).equals(username) && rs.getString(2).equals(password))
					{
					
						c=1;break;
						
					}
					
				
				}
	    	}
	    	catch(Exception e) {
	    		System.out.println(e);
	    	}
				
				return c;
	     }


}
