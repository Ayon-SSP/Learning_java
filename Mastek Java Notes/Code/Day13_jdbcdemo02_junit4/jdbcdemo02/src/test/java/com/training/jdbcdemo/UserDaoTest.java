package com.training.jdbcdemo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
// import static org.junit.Assert.assertFalse;

import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.training.demo.model.User;
import com.training.jdbcdemo.dao.UserDao;
import com.training.jdbcdemo.util.DBConnection;

public class UserDaoTest {

	private static UserDao dao;
	
	@BeforeClass
	public static void beforeClass() {
		dao=new UserDao(DBConnection.getDbConnnection());
	}
	
	@Test
	public void testFindOneUserDao() {
		try {
//			UserDao dao=new UserDao(DBConnection.getDbConnnection());
			assertNotNull(dao.findOne(2));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Ignore
	@Test
	public void testDeleteUserDao() {
		try {
			// assertFalse(dao.delete(23));
			assertTrue(dao.delete(23));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testUpdateUserDao() {
		try {
			assertTrue(dao.update(3,new User(3,"Ankit Verma","ankit.verma@example.com")));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void testCreateUserDao() {
		try {
			assertNotNull(dao.create(new User(0,"John Doe","john.doe@example.com")));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
