package com.training.demo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddBookServlet
 */
@WebServlet("/add")
public class AddBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		final int bookId=Integer.parseInt(request.getParameter("bookId").trim());
		final String bookName=request.getParameter("bookName").trim();
		final String authorName=request.getParameter("authorName").trim();
		try(PrintWriter out=response.getWriter()){
			out.println("Book Id"+bookId);
			out.println("Book Name"+bookName);
			out.println("Book Author"+authorName);
			
		}catch(Exception e) {e.printStackTrace();}
		
	}

}
