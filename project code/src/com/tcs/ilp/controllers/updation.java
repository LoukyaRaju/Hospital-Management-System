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
import com.tcs.ilp.models.Medicine;

/**
 * Servlet implementation class updation
 */
@WebServlet("/updation")
public class updation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session=request.getSession();
		int medId=(Integer)session.getAttribute("medicineId");
		int patId=(Integer)session.getAttribute("patientId");
		
		int quant=(Integer)session.getAttribute("medicineQuantity");
		MedicineDao dao=new MedicineDao();
		int i=dao.addMedicine(patId,medId,quant);
		System.out.println(i);
		List<Medicine> d=new ArrayList<>();
		d=dao.getMedicineInfo(patId);
	
		session.setAttribute("MedicineInfo", d);
		
		 response.sendRedirect(request.getContextPath()+"/addedMedicine.jsp");
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
