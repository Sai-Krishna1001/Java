package bms;
 
import java.sql.Connection;
import java.sql.DriverManager;
// Global connection Class
public class Connect {
    static Connection con; // Global Connection Object
    public static Connection getConnection()
    {
        try {
            
            
            String mysqlJDBCDriver = "com.mysql.cj.jdbc.Driver"; //jdbc driver
            String url = "jdbc:mysql://localhost:3306/bank"; //mysql url
            String user = "root";        //mysql username
            String pass = "sql@123";  //mysql passcode
            
            Class.forName(mysqlJDBCDriver);
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Database Connected!");
        }
        catch (Exception e) {
            System.out.println("Connection Failed!");
        }
        return con;
    }
}