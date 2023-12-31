package usermanagement.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtils {
	
	private static final String jdbcURL = "jdbc:mysql://localhost:3306/jdbc_demo?useSSL=false";
	private static final String jdbcUsername = "root";
	private static final String jdbcPassword = "sql@123";
	
	public static Connection getConnection()
	{
		
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
	

	public static void printSQLException(SQLException ex) {
		for(Throwable e : ex) {
			if(e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " +  e.getMessage());
				Throwable t = ex.getCause();
				while(t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}
	}
}
