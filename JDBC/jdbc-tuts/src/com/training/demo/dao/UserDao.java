package com.training.demo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.training.demo.util.DBConnection;

import com.training.demo.model.User;

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
    public User create(User t) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean update(int id, User t) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean delete(int id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public User findOne(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<User> findAll() throws SQLException {

        Connection connection = dbConnection.getConnection();
        Statement selectStatement = connection.createStatement();

        final String sqlQuery = "select * from users";
        ResultSet resultSet = selectStatement.executeQuery(sqlQuery);

        while (resultSet.next()) {
            // using column names
            // User user = new User(resultSet.getInt("userId"),
            // resultSet.getString("userName"),resultSet.getString("email"));
            // using column position in result
            User user = new User(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3));
            // System.out.println(user);
            users.add(user);

        }
        if (users.isEmpty())
            return null;
        return users;
    }

}
