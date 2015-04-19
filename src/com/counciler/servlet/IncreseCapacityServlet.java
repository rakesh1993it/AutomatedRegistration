package com.counciler.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.counciler.beans.Course;
import com.counciler.utils.*;

@WebServlet("/IncreseSeat")
public class IncreseCapacityServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Course cs= new Course();
		int C_id = Integer.parseInt(request.getParameter("c_id"));
		int C_no_ofseats = Integer.parseInt(request.getParameter("no_ofseat"));
		//String C_name = request.getParameter("");
		 
		 
		 
		 CouncilerUtils util = new CouncilerUtilsImpl();
		boolean increment = util.incrementCapacity(C_id,C_no_ofseats);
		//HttpSession session = request.getSession();
		 
		 
			if(increment){
				response.getWriter().print("Done...!</br>");
				response.getWriter().print("<a href='home.jsp'>Go To Home Page..!</a>");
				
			}else{
				response.sendRedirect("IncreseCapacity.jsp");
				
			}
		
		
	}

}
