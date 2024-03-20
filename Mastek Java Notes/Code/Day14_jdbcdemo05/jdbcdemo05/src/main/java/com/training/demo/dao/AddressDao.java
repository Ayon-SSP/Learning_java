package com.training.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.training.demo.model.Address;
import com.training.demo.util.DBConnection;

public class AddressDao implements IDao<Address> {

	private DBConnection dbConnection;
	private final static List<Address> addressList = new ArrayList<>();

	public AddressDao(DBConnection dbConnection) {
		super();
		this.dbConnection = dbConnection;
	}

	@Override
	public List<Address> findALL() throws SQLException {
		Connection connection = dbConnection.getConnection();
		final Statement statement = connection.createStatement();
		final String sqlQuery = "select id,street,city,zipcode,student_id from address";
		final ResultSet resultSet = statement.executeQuery(sqlQuery);

		while (resultSet.next()) {
			Address address = new Address();
			address.setId(resultSet.getInt("id"));
			address.setStreet(resultSet.getString("street"));
			address.setCity(resultSet.getString("city"));
			address.setZipcode(resultSet.getString("zipcode"));
			int student_id = resultSet.getInt("student_id");
			addressList.add(address);

		}
		return addressList;
	}

	@Override
	public Address findOne(int id) throws Exception {
		Connection connection = dbConnection.getConnection();
		final String sqlQuery = "select id,street,city,zipcode,student_id from address where id=?";
		final PreparedStatement statement = connection.prepareStatement(sqlQuery);
		statement.setInt(1, id);
		final ResultSet resultSet = statement.executeQuery();
		Address address = new Address();
		if (resultSet.next()) {
			address.setId(resultSet.getInt("id"));
			address.setStreet(resultSet.getString("street"));
			address.setCity(resultSet.getString("city"));
			address.setZipcode(resultSet.getString("zipcode"));	

		}
		return address;

	}

	public Address findOneByStudentId(int student_id) throws Exception{
		Connection connection = dbConnection.getConnection();
		final String sqlQuery = "select id,street,city,zipcode from address where student_id=?";
		final PreparedStatement statement = connection.prepareStatement(sqlQuery);
		statement.setInt(1, student_id);
		final ResultSet resultSet = statement.executeQuery();
		Address address = new Address();
		if (resultSet.next()) {
			address.setId(resultSet.getInt("id"));
			address.setStreet(resultSet.getString("street"));
			address.setCity(resultSet.getString("city"));
			address.setZipcode(resultSet.getString("zipcode"));	

		}
		return address;
		
	}
}
