package bms;

import java.sql.Connection;

import java.sql.DriverManager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Connect {
	
	static Logger log = LogManager.getLogger(Connect.class.getName());
    static Connection con;

    // Getting the manager database connection..
    public static Connection cc(){
        try {

            // Loading the driver...
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Getting the connection...
            String url = "jdbc:mysql://localhost:3306/manager";
            String user = "root";
            String pass = "sql@123";
            con = DriverManager.getConnection(url,user,pass);
        }
        catch (Exception e){
            log.info("Connection cannot be established");
        }
        return con;
    }

    // Getting connection for customer database...
    public static Connection cc1(){
        try {

            // Loading the driver...
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Getting the connection...
            String url = "jdbc:mysql://localhost:3306/customer";
            String user = "root";
            String pass = "sql@123";
            con = DriverManager.getConnection(url,user,pass);
        }
        catch (Exception e){
            log.info("Connection cannot be established");
        }
        return con;
    }

}
