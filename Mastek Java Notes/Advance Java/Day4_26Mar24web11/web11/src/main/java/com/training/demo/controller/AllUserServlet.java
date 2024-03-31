package com.training.demo.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.demo.dao.DBConnection;
import com.training.demo.dao.UserDao;
import com.training.demo.model.User;

/**
 * Servlet implementation class AllUserServlet
 */
@WebServlet("/all_users")
public class AllUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDao userDao;

	public AllUserServlet() {
		super();
		this.userDao = new UserDao(DBConnection.getDBConnection());
		System.out.println(this.userDao);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		log("Logger" + getServletName());
		String errorMessage = "";
		RequestDispatcher rd = null;
		try {
			final List<User> users = userDao.findAll();

			rd = request.getRequestDispatcher("user-list.jsp");
			request.setAttribute("users", users);
			request.setAttribute("users", users);
			rd.forward(request, response);
		} catch (SQLException e) {
			errorMessage = e.getMessage();
			request.setAttribute("error", errorMessage);
			rd = request.getRequestDispatcher("user-list.jsp");
			rd.forward(request, response);
		}

	}

}
