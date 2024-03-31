package com.training.demo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GreetingServlet
 */
@WebServlet("/greet")
public class GreetingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try(PrintWriter writer=response.getWriter()){
			final String userName=request.getParameter("userName").trim();
			if(userName!=null && userName.length()>0) {
				writer.println("<h1>Weclome "+userName+" length"+userName.length()+"</h1>");
			}else {
				writer.println("<h1>Weclome Guest</h1>");
			}
			
		}catch(Exception exception) {
			exception.printStackTrace();
		}
	}

}
