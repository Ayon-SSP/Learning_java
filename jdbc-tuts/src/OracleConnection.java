import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OracleConnection {

    public static void main(String[] args) {
        String connectionUrl = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "system";
        String password = "321654";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection(connectionUrl, username, password);
            // now create a table and insert some data table naem newtable with 2 columns id and name

            // create table
            Statement st = conn.createStatement();
            



            System.out.println("Connection established successfully!");
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}