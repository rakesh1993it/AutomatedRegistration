package com.counciler.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.counciler.beans.*;
import com.counciler.utils.*;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String un = request.getParameter("uname");
		String up = request.getParameter("upass");
		
		CouncilerUtils util = new CouncilerUtilsImpl();
		 Counciler counciler= util.login(un,up);
		if(counciler != null){
			HttpSession session = request.getSession();
			session.setAttribute("counciler", counciler);
			RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);
		}else{
			RequestDispatcher rd = request.getRequestDispatcher("failure.jsp");
			rd.forward(request, response);
		}
	}
}
