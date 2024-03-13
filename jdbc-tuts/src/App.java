import java.sql.*;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) throws Exception {
		// import package
		/*load and register driver
		 * create connection
		 * create statement
		 * execute stmt
		 * process result
		 * close connection
		 * 
		 */
				
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String name = "system";
		String password = "321654";
		Scanner sc = new Scanner(System.in);
		
		Connection con = DriverManager.getConnection(url, name, password);

        // create table
        Statement st = con.createStatement();
        // st.execute("create table dept8(deptno number, dname varchar2(20), loc varchar2(20))");
        // System.out.println("Table created");

        // insert data
        // PreparedStatement ps = con.prepareStatement("insert into dept8 values(?,?,?)");
        // ps.setInt(1, 10);
        // ps.setString(2, "IT");
        // ps.setString(3, "Pune");
        // ps.executeUpdate();
        // System.out.println("Data inserted");

        // // update data
        // ps = con.prepareStatement("update dept8 set loc=? where deptno=?");
        // ps.setString(1, "Mumbai");
        // ps.setInt(2, 10);
        // ps.executeUpdate();
        // System.out.println("Data updated");
        
        // display data
        // ResultSet rs = st.executeQuery("select * from whoami");
        ResultSet rs = st.executeQuery("select * from dept8");
        while(rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
        }
		
		con.close();
		// ps.close();
        st.close();
        sc.close();
	}
}