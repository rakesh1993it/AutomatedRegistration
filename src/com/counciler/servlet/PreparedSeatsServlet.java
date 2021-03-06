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

import com.counciler.beans.Course;
import com.counciler.utils.CouncilerUtils;
import com.counciler.utils.CouncilerUtilsImpl;


@WebServlet("/Seats")
public class PreparedSeatsServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CouncilerUtils u = new CouncilerUtilsImpl();
		List<Course> cs = u.getAllCourses();
		HttpSession session = request.getSession();
		session.setAttribute("courses", cs);
		RequestDispatcher rd = request.getRequestDispatcher("IncreseCapacity.jsp");
		rd.forward(request, response);
	}

}
