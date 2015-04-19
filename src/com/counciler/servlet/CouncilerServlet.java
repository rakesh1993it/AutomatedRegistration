package com.counciler.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.counciler.beans.Counciler;

@WebServlet("/Counciler")
public class CouncilerServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Counciler counciler= (Counciler)request.getAttribute("c");
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		out.print("Welcome"+counciler.getCu_username());
		out.close();
	
	}

}
