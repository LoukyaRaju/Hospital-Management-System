package com.tcs.ilp.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tcs.ilp.daos.UserDao;

/**
 * Servlet implementation class LoginValid
 */
@WebServlet("/LoginValid")
public class LoginValid extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginValid() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		UserDao dao=new UserDao();
		HttpSession session=request.getSession();
		String username=request.getParameter("username");
		session.setAttribute("username", username);
		String password=request.getParameter("password");
		
		int i=dao.validateUser(username, password);
		if(i>0)
		{
			if(username.equals("admin"))
			{
				response.sendRedirect(request.getContextPath()+"/admin.jsp");
			}
			if(username.equals("medicine"))
			{
				response.sendRedirect(request.getContextPath()+"/medicine.jsp");
			}
			if(username.equals("diagnostics"))
			{
				response.sendRedirect(request.getContextPath()+"/Diagnostics.jsp");
			}
           
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
