package com.training.demo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet({ "/MyServlet", "/dynamic", "/fun" })
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//				response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter writer=response.getWriter();
		writer.print("<html>");
		writer.print("<head><title>MyServlet</title></head>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("Welcome to Servlet API");
		final String url=request.getRequestURL().toString();
		writer.print("Welcome to Servlet API: "+url+"<br/>");
		writer.print("<a href='index.html'>Home</a>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
	}

}
