package com.tcs.ilp.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tcs.ilp.daos.MedicineDao;

/**
 * Servlet implementation class AddMedicine
 */
@WebServlet("/AddMedicine")
public class AddMedicine extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddMedicine() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//String MedName=request.getParameter("MedicineName");
		int MedId=Integer.parseInt(request.getParameter("MedicineId"));
		
		int quantity=Integer.parseInt(request.getParameter("medquantity"));
		HttpSession session=request.getSession();
		session.setAttribute("medicineId",MedId);
		
		session.setAttribute("medicineQuantity",quantity);
		
		
		MedicineDao dao=new MedicineDao();
		int no=dao.checkAvailability(MedId);
		System.out.println(quantity);
		if(no<quantity)
		{
			response.sendRedirect(request.getContextPath()+"/notavailable.jsp");
			
		}
		else
		{
			response.sendRedirect(request.getContextPath()+"/available.jsp");
			
			
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
