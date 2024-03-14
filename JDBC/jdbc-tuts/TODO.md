com.training.demo.model.User(userId,userName,email)->JavaBean /Comparable/hashCode/equals/toString()
com.training.demo.dao.UserDao implements IDAO<User>
com.training.demo.dao.IDao<T>
	 create(T t):T 
	 update(int id,T t):boolean
	 delete(int id):boolean
	 findAll():List<T>
	 findOne(int id):T


```java
@Override
	public List<User> findAll() throws SQLException {
		
		Connection connection=dbConnection.getConnection();
		Statement selectStatement=connection.createStatement();
		final String sqlQuery="select * from users";
		ResultSet resultSet=selectStatement.executeQuery(sqlQuery);
		while(resultSet.next()) {
			User user=new User(resultSet.getInt("userId"),resultSet.getString("userName"),resultSet.getString("email"));
			users.add(user);
		}
		if(!users.isEmpty()) {
			return users;
		}
		return null;
	}

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
 
[12:19 PM] Dhanashree Jawle
package com.training.demo.dao;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
//Singleton class at any given point of time only one object exist
// Two way -> Threading ->Synchronization it will allow only one to enter in the block
//1. it has its own object ref variable in it
//2. its default constructor is private
//3. getter method to access the priavate self object
public class DBConnection {
 
	private static DBConnection dbConnection;
 
	private final String url="jdbc:oracle:thin:@localhost:1521:xe";
	private final String username="dj";
	private final String password="root";
	private Connection connection;
	
	private DBConnection() {
		super();	
	}
 
	public static DBConnection getDbConnection() {
		if(dbConnection==null) {
			synchronized (DBConnection.class) {
				if(dbConnection==null) {
					dbConnection=new DBConnection();
				}
			}
		}
		
		return dbConnection;
	}
	
	public Connection getConnection() {
		try {
			connection=DriverManager.getConnection(url,username,password);
			if(!connection.isClosed()) {
				System.out.println("Connected");
				return connection;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
 
[12:19 PM] Dhanashree Jawle
package com.training.demo.dao;
 
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
 
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
 
			User user = new User(resultSet.getInt("userId"), resultSet.getString("userName"),
					resultSet.getString("email"));
			System.out.println(user);
			users.add(user);
 
		}
		if (users.isEmpty())
			return null;
		return users;
	}
 
}
package com.training.demo.dao;
 
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
 
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
 
```