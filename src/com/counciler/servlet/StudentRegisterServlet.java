package com.counciler.servlet;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.counciler.beans.*;
import com.counciler.utils.*;


@WebServlet("/RegisterStudent")
public class StudentRegisterServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Student student = new Student();
		String S_name= request.getParameter("sname");
		String S_address=request.getParameter("sadd");
		String S_email=request.getParameter("email");
		int S_contact=Integer.parseInt(request.getParameter("cnct_no"));
		int c_id = Integer.parseInt(request.getParameter("c_id"));
		Course c = new Course();
		c.setC_id(c_id);
		student.setCourse(c);
		student.setS_address(S_address);
		student.setS_contact(S_contact);
		student.setS_email(S_email);
		student.setS_name(S_name);
		CouncilerUtils  util = new CouncilerUtilsImpl();
		boolean registered = util.registerStudent(student);
		
		request.setAttribute("registered",registered);
		
		if(registered){
			RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);
		}else{
			response.sendRedirect("registerStudent.jsp ");
		}
		
	}
	}


