package com.training.demo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GreetingServlet
 */

@WebServlet(
		urlPatterns ={"/greeting"},
		initParams = {
				@WebInitParam(name="servlet_initparam",value="GreetingServlet")
				})
public class GreetingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try(PrintWriter out=response.getWriter()){
			out.append("Served at:GreetingServlet.doGet() ").append(request.getContextPath());
			ServletContext context=getServletContext();
			String message=context.getInitParameter("Message");
			out.append("<br/>Context.inintparameter Message= "+message);
			String servlet_initparam= getInitParameter("servlet_initparam");
			
			out.append("<br/>servlet.getInintparameter servlet_initparam= "+servlet_initparam);
		}catch(Exception e) {
			e.printStackTrace();
		}
			
	}

	@Override
	public void init() {
		log("GreetingServlet.init(): ");
	}

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		log("GreetingServlet.init(ServletConfig): ");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		log("GreetingServlet.destroy(): ");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		log("GreetingServlet.service(): called");
		if(request.getMethod().equalsIgnoreCase("GET")) {
			doGet(request, response);
		}
//		response.getWriter().append("Served at:service() ").append(request.getContextPath());
	}

}
