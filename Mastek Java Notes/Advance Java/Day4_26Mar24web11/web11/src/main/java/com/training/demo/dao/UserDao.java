package com.training.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.training.demo.model.User;

public class UserDao implements IDao<User> {

	private DBConnection dbConnection;

	private static final String INSERT_USERS_SQL = "INSERT INTO users" + "  (name, email, country) VALUES (?, ?, ?)";
	private static final String SELECT_USER_BY_ID = "select id,name,email,country from users where id =?";
	private static final String SELECT_ALL_USERS = "select * from users";
	private static final String DELETE_USERS_SQL = "delete from users where id = ?;";
	private static final String UPDATE_USERS_SQL = "update users set name = ?,email= ?, country =? where id = ?;";

	public UserDao(DBConnection dbConnection) {
		super();
		this.dbConnection = dbConnection;
	}

	@Override
	public List<User> findAll() throws SQLException {
		System.out.println("Find All Called");
		final List<User> users = new ArrayList<>();
		final Connection connection = dbConnection.getConnection();
		if (!connection.isClosed()) {
			final Statement statement = connection.createStatement();
			final ResultSet resultSet = statement.executeQuery(SELECT_ALL_USERS);
			while (resultSet.next()) {
				System.out.println("while() called");
				User user = new User();
				user.setId(resultSet.getInt("id"));
				user.setName(resultSet.getString("name"));
				user.setEmail(resultSet.getString("email"));
				user.setCountry(resultSet.getString("country"));
				users.add(user);
				System.out.println("while() ended");
			}
		}

//		resultSet.close();
//		statement.close();
////		connection.close();
		System.out.println(users);
		System.out.println("Find All ended");
		return users;
	}

	@Override
	public User findOne(int id) throws SQLException {
		final User user = new User();
		final Connection connection = dbConnection.getConnection();
		final PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);
		preparedStatement.setInt(1, id);
		final ResultSet resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			user.setId(resultSet.getInt("id"));
			user.setName(resultSet.getString("name"));
			user.setEmail(resultSet.getString("email"));
			user.setCountry(resultSet.getString("country"));
		}

		return user;
	}

	@Override
	public boolean create(User t) {

		return false;
	}

	@Override
	public boolean update(int id, User t) {

		return false;
	}

	@Override
	public boolean delete(int id) {

		return false;
	}

}
