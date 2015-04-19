package com.counciler.servlet;

import java.io.IOException;
import java.util.ArrayList;
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

@WebServlet("/Studentview")
public class StudentDetailsServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CouncilerUtils util = new CouncilerUtilsImpl();
		
		List<Student> students = util.getStudents();
		HttpSession session = request.getSession();
	
		session.setAttribute("students",students);
		RequestDispatcher rd = request.getRequestDispatcher("studentDetails.jsp");
		rd.forward(request, response);
		
	}

}
