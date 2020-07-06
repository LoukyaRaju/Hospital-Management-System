package com.tcs.ilp.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tcs.ilp.daos.DiagnosticsDAO;
import com.tcs.ilp.daos.patientDao;
import com.tcs.ilp.models.Diagnostics;
import com.tcs.ilp.models.patientM;

/**
 * Servlet implementation class GetDiagnostics
 */
@WebServlet("/GetDiagnostics")
public class GetDiagnostics extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetDiagnostics() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		List<patientM> patient;
		DiagnosticsDAO dao=new DiagnosticsDAO();
		patientDao pdao=new patientDao();
		int patId=Integer.parseInt((String)request.getParameter("patientId"));
		System.out.println(patId);
		patient=pdao.getPatientDetails(patId);
		List<Diagnostics> d=new ArrayList<>();
		d=dao.getDiagInfo(patId);
		
		
		 HttpSession session = request.getSession(true);
		 session.setAttribute("diagInformation", d);
		 //   String username=(String) session.getAttribute("name");
			   session.setAttribute("patientId", patId);
		    session.setAttribute("patientList", patient);
		   // session.setAttribute("cartSize",dao.findCartSize(username));
			 
		    response.sendRedirect(request.getContextPath()+"/view_diag.jsp");
		    
			
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
