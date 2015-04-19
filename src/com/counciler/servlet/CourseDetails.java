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

import com.counciler.beans.Course;
import com.counciler.utils.*;


@WebServlet("/courseDetails")
public class CourseDetails extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		CouncilerUtils util = new CouncilerUtilsImpl();
		List<Course> courses = util.getAllCourses();
		
		HttpSession session = request.getSession();
		session.setAttribute("courses",courses);
		RequestDispatcher rd = request.getRequestDispatcher("courseDetails.jsp");
		rd.forward(request, response);
		
	}

	

}
