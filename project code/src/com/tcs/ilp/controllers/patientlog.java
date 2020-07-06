package com.tcs.ilp.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tcs.ilp.daos.patientDao;
import com.tcs.ilp.models.patientM;


/**
 * Servlet implementation class patientlog
 */
@WebServlet("/patientlog")
public class patientlog extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public patientlog() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//int flag=0;
		int patientid=Integer.parseInt((String)request.getParameter("Id"));
		//int patientid = Integer.parseInt(request.getParameter("Id"));
		patientDao pd=new patientDao();
		javax.servlet.http.HttpSession session=request.getSession(true);
		List<patientM> alldetails= pd.getPatientDetails(patientid);
		session.setAttribute("patientdetails",alldetails);
		//session.setAttribute("patid", patientid);
		//session.setAttribute("f",flag);
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
