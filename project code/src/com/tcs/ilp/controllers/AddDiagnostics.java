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
import com.tcs.ilp.models.Diagnostics;

/**
 * Servlet implementation class AddDiagnostics
 */
@WebServlet("/AddDiagnostics")
public class AddDiagnostics extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddDiagnostics() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		List<Diagnostics> d=new ArrayList<>();
		DiagnosticsDAO dao=new DiagnosticsDAO();
		HttpSession session=request.getSession(true);
		int patId=(int)(session.getAttribute("patientId"));
		int DiagId=Integer.parseInt(request.getParameter("DiagId"));
		//int charge=Integer.parseInt(request.getParameter("charge"));
		int i=dao.addDiagnostics(patId,DiagId);
		d=dao.getDiagInfo(patId);
		session.setAttribute("diagInfo", d);
//		if(i>0)
//		{
			 response.sendRedirect(request.getContextPath()+"/addedDiag.jsp");
			   
		//}
//		else
//		{
//			 response.sendRedirect(request.getContextPath()+"/error.jsp");
//			   
//		}
//		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
