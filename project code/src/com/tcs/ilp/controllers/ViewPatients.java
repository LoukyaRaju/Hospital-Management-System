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
 * Servlet implementation class ViewPatients
 */
@WebServlet("/ViewPatients")
public class ViewPatients extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewPatients() {
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
		String s="admitted";
		List<patientM> patientsList=dao.getAllPatients(s);
		 HttpSession session = request.getSession(true);
		    
		    session.setAttribute("patientsList", patientsList);
		   
			//   System.out.println("uuuuuuuuuuuuuuuu");
		    response.sendRedirect(request.getContextPath()+"/viewallpatients.jsp");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
