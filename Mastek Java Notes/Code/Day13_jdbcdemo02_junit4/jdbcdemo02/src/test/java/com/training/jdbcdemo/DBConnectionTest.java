package com.training.jdbcdemo;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import com.training.jdbcdemo.util.DBConnection;

public class DBConnectionTest {

	@Test
	public void testDBConnectioObjectCreated() {
		assertNotNull(DBConnection.getDbConnnection());
	}
	@Test
	public void testConnectionIsOpen() {
		try {
			assertNotNull(DBConnection.getDbConnnection().getConnection());
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
//Explain you how Junit Test shows failed test	
//	@Test
//	public void testConnectionIsClosed() {
//		try {
//			Connection connection=DBConnnection.getDbConnnection().getConnection();
//			connection.close();
//			assertNull(connection);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
}
