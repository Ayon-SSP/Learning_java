package com.training.demo;

import java.util.List;

import com.training.demo.dao.StudentDao;
import com.training.demo.model.Student;
import com.training.demo.util.DBConnection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    		try {
				DBConnection dbConnection=DBConnection.getDbConnnection();
				StudentDao studentDao=new StudentDao(dbConnection);
				List<Student> students=studentDao.findALL();
//				System.out.println(students);
				students.stream().forEach(System.out::println);
				System.out.println("Find student with id 3"); 
				
				System.out.println(studentDao.findOne(3));
				dbConnection.closeConnection();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
    }
}
