package com.training.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.training.demo.model.Student;
import com.training.demo.util.DBConnection;

import oracle.net.aso.s;

public class StudentDao implements IDao<Student> {

	private DBConnection dbConnection;
	private AddressDao addressDao;
	private List<Student> students = new ArrayList<>();

	public StudentDao(DBConnection dbConnection) {
		super();
		this.dbConnection = dbConnection;
		this.addressDao = new AddressDao(dbConnection);
	}

	@Override
	public List<Student> findALL() throws Exception {
		Connection connection = dbConnection.getConnection();
		final Statement statement = connection.createStatement();
		final String sqlQuery = "select id,name,age from student";
		final ResultSet resultSet = statement.executeQuery(sqlQuery);
		while (resultSet.next()) {
			Student student = new Student();
			int student_id = resultSet.getInt("id");
			student.setId(student_id);
			student.setName(resultSet.getString("name"));
			student.setAge(resultSet.getInt("age"));
			student.setAddress(addressDao.findOneByStudentId(student_id));
			students.add(student);
		}
		
		return students;
	}

	@Override
	public Student findOne(int id) throws Exception {
		Connection connect =dbConnection.getConnection();
		String sqlQuery="select * from student where id=?";
		PreparedStatement preparedStatement=connect.prepareStatement(sqlQuery);
		preparedStatement.setInt(1, id);
		ResultSet resultSet=preparedStatement.executeQuery();
		Student student=new Student();
		if(resultSet.next()) {
			
			student.setId(id);
			student.setName(resultSet.getString("name"));
			student.setAge(resultSet.getInt("age"));
			student.setAddress(addressDao.findOneByStudentId(id));			
		}
		
		return student;
	}

}
