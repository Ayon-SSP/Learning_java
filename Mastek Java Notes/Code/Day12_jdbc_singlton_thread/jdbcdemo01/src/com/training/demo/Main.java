package com.training.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import com.training.demo.dao.DBConnection;
import com.training.demo.dao.UserDao;
import com.training.demo.model.User;

public class Main {

	public static void main(String[] args) {
//		sampleConnection();
		try {
			DBConnection dbConnection=DBConnection.getDbConnection();
			UserDao userDao=new UserDao(dbConnection);
			List<User> users=userDao.findAll();
			users.stream().forEach(System.out::println);
		} catch (SQLException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void sampleConnection() {
		final String url="jdbc:oracle:thin:@localhost:1521:xe";
		final String username="dj		";
		final String password="root";
		System.out.println("JDBC API demo");
		
		try {
			Connection connection=DriverManager.getConnection(url,username,password);
			if(connection.isClosed()) {
				System.out.println("Not Connected");
			}else {
				System.out.println("Connected");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
