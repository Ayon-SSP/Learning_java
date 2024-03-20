package com.training.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.training.demo.model.User;
import com.training.demo.util.DBConnection;

public class UserDao implements IDao<User> {

	private DBConnection dbConnection;
	private List<User> users = new ArrayList<>();
	
	public UserDao() {
		super();
	}

	public UserDao(DBConnection dbConnection) {
		super();
		this.dbConnection = dbConnection;
	}

	@Override
	public User create(User user) {
		
		try {
			Connection connection=dbConnection.getConnection();
			String sqlQuery="insert into users (userName,email) values(?,?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sqlQuery);
			preparedStatement.setString(1, user.getUserName());
			preparedStatement.setString(2, user.getEmail());			
			if(preparedStatement.executeUpdate()<0) {
				user=null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return user;
	}

	@Override
	public boolean update(int id, User t) {
		boolean result=false;
		try {
			Connection connection=dbConnection.getConnection();
			String sqlQuery="update users set userName=?, email=? where userId=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sqlQuery);
			preparedStatement.setString(1, t.getUserName());
			preparedStatement.setString(2, t.getEmail());
			preparedStatement.setInt(3, id);
			if(preparedStatement.executeUpdate()>0) {
				result=true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public boolean delete(int id) {
		boolean result=false;
		try {
			Connection connection=dbConnection.getConnection();
			String sqlQuery="delete from users where userId=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sqlQuery);
			preparedStatement.setInt(1, id);
			if(preparedStatement.executeUpdate()>0) {
				result=true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public User findOne(int id) throws SQLException {
		Connection connection=dbConnection.getConnection();
		final String sqlQuery="select userId,userName,email from users where userId=?";
		PreparedStatement preparedStatement=connection.prepareStatement(sqlQuery); 
		preparedStatement.setInt(1, id);
		ResultSet resultSet=preparedStatement.executeQuery();
		User user=null;
		if(resultSet.next()) {
			user = new User(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3));			
		}
		
		return user;
	}

	@Override
	public List<User> findAll() throws SQLException {

		Connection connection = dbConnection.getConnection();
		Statement selectStatement = connection.createStatement();

		final String sqlQuery = "select * from users";
		ResultSet resultSet = selectStatement.executeQuery(sqlQuery);

		while (resultSet.next()) {
			//using column names
//			User user = new User(resultSet.getInt("userId"), resultSet.getString("userName"),resultSet.getString("email"));
			// using column position in result
			User user = new User(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3));
			System.out.println(user);
			users.add(user);

		}
		if (users.isEmpty())
			return null;
		return users;
	}

}
