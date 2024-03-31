package com.training.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static DBConnection dbConnection;
	private final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String userName = "dj";
	private final String password = "root";
	private Connection connection ;
	
	public static DBConnection getDBConnection() {
		if(dbConnection==null) {
			synchronized(DBConnection.class){
				if(dbConnection == null) {
					dbConnection=new DBConnection();
					return dbConnection;
				}
			}
		}
		return dbConnection;
	}
	public Connection getConnection() throws SQLException {
		if(connection==null) {
			connection = DriverManager.getConnection(url, userName, password);
			if(!connection.isClosed()) {
				return connection;
			}
		}
		return connection;
	}
	public boolean closeConnection() throws SQLException {
		if(connection!=null) {
			connection.close();
		}
		return connection.isClosed();
	}
}
