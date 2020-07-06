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

import com.tcs.ilp.daos.MedicineDao;
import com.tcs.ilp.daos.patientDao;
import com.tcs.ilp.models.Medicine;
import com.tcs.ilp.models.patientM;

/**
 * Servlet implementation class GetMedicines
 */
@WebServlet("/GetMedicines")
public class GetMedicines extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetMedicines() {
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
		MedicineDao dao=new MedicineDao();
		patientDao pdao=new patientDao();
		int patId=Integer.parseInt((String)request.getParameter("patientId"));
		System.out.println(patId);
		patient=pdao.getPatientDetails(patId);
		List<Medicine> d=new ArrayList<>();
		d=dao.getMedicineInfo(patId);
		
		
		 HttpSession session = request.getSession(true);
		session.setAttribute("MedicineInformation", d);
		List<Integer> quants=new ArrayList<>();
		 //   String username=(String) session.getAttribute("name");
			   session.setAttribute("patientId", patId);
		    session.setAttribute("patientList", patient);
		//  session.setAttribute("quantList", quants);
			  
			 
		    response.sendRedirect(request.getContextPath()+"/view_medicines.jsp");
		    
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
