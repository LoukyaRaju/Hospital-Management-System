package com.tcs.ilp.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tcs.ilp.daos.patientDao;
import com.tcs.ilp.models.patientM;

/**
 * Servlet implementation class deletepatient
 */
@WebServlet("/deletepatient")
public class deletepatient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deletepatient() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		patientDao dao=new patientDao();
		int id=Integer.parseInt((String)request.getParameter("patientId"));
		 HttpSession session = request.getSession(true);
			List<patientM> m=dao.getDelDetails(id);
		    session.setAttribute("patient_id", id);
		    session.setAttribute("patientlist", m);

		   
			   System.out.println(id);
		    response.sendRedirect(request.getContextPath()+"/delete.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
