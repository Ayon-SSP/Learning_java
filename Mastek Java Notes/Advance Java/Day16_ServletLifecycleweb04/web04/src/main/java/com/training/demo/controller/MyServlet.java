package com.training.demo.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */

public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	public MyServlet() {
		super();
	
	}
	
	@Override
	public void init() {
		log("init(): ");
	}
//	/**
//	 * @see Servlet#init(ServletConfig)
//	 */
//	@Override
//	public void init(ServletConfig config) throws ServletException {
//		if(config==null) {
//			log("config="+config);
//		}
//		log("init(ServletConfig config): ");
//	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		log("destroy(): ");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		log("service(): called");
//		if(request.getMethod().equalsIgnoreCase("GET")) {
//			doGet(request, response);
//		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		log("doGet(HttpServletRequest request, HttpServletResponse response): ");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
