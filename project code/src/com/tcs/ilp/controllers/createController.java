package com.tcs.ilp.controllers;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tcs.ilp.daos.patientDao;
/**
 * Servlet implementation class createController
 */
@WebServlet("/createController")
public class createController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public createController() {
        super();
        // TODO Auto-generated constructor stub
    }
int ssnpatient,p_idp,agep,i=0;
String p_namep,dojp,room_typep,addressp,city,state,status;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		 ssnpatient=Integer.parseInt(request.getParameter("ssn"));
		 p_idp=Integer.parseInt(request.getParameter("patient_id"));
		 p_namep=request.getParameter("patient_name");
		 addressp=request.getParameter("address");

		 agep=Integer.parseInt(request.getParameter("age"));
		 dojp=request.getParameter("doj");
		 room_typep=request.getParameter("room_type");
		 city=request.getParameter("city");
		 state=request.getParameter("state");
		 status=request.getParameter("status");
		 PrintWriter out=response.getWriter();

		 patientDao ud=new patientDao();
		 i=ud.createPatient(ssnpatient,p_idp,p_namep,addressp,agep,dojp,room_typep,city,state,status);
			
			if(i>0)
			{
				 response.sendRedirect(request.getContextPath()+"/welcome.jsp");
//				System.out.print("Patient inserted successfuly");
//				
//				out.println("<a href='mainlogin.jsp'>click here to go back to main screen</a>");
//				
				
			}
			else
			{
				
				 response.sendRedirect(request.getContextPath()+"/error.jsp");
				//System.out.print("Insert patient again");
				
				//out.println("<a href='mainlogin.jsp'>click here to go back to main screen and create again</a>");
				
			}
			
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
