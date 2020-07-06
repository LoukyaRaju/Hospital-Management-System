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
import com.tcs.ilp.daos.MedicineDao;
import com.tcs.ilp.daos.finalbillDao;
import com.tcs.ilp.models.Diagnostics;
import com.tcs.ilp.models.Medicine;
import com.tcs.ilp.models.patientM;

/**
 * Servlet implementation class finalbill
 */
@WebServlet("/finalbill")
public class finalbill extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public finalbill() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method sList<patientM> patient;
		DiagnosticsDAO dao=new DiagnosticsDAO();
		finalbillDao pdao=new finalbillDao();
		int patId=Integer.parseInt((String)request.getParameter("patientId"));
		System.out.println(patId);
		List<patientM> patient=new ArrayList<>();
		patient=pdao.getPatientDetails(patId);
		List<Diagnostics> d=new ArrayList<>();
		d=dao.getDiagInfo(patId);
		//patient=pdao.getchangeDetails(patId);
		
		 HttpSession session = request.getSession(true);
		 session.setAttribute("diagInformation", d);
		 //   String username=(String) session.getAttribute("name");
			   session.setAttribute("patientId", patId);
		    session.setAttribute("patientList", patient);
		   // session.setAttribute("cartSize",dao.findCartSize(username));
			 MedicineDao mdao=new MedicineDao();
		    List<Medicine> dm=new ArrayList<>();
			dm=mdao.getMedicineInfo(patId);
			
			
			// HttpSession session = request.getSession(true);
			session.setAttribute("MedInformation", dm);

		    
		    
		    response.sendRedirect(request.getContextPath()+"/fbill.jsp");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
