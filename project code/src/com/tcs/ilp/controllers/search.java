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
 * Servlet implementation class search
 */
@WebServlet("/search")
public class search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public search() {
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
		int id=Integer.parseInt(request.getParameter("patientId"));
		List<patientM> m=dao.getPatientDetails(id);
		 HttpSession session = request.getSession(true);
		    
//		 if(m.equals(null))
//			 System.out.print("no recors");
//		 else {
		    session.setAttribute("patient", m);
		   
			//   System.out.println("uuuuuuuuuuuuuuuu");
		    response.sendRedirect(request.getContextPath()+"/viewpatient.jsp");
		
		// }
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
