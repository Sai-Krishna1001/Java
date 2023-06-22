package java.jdbc;

import java.sql.*;

public class MySQLDriver {

	public static void main(String[] args) {
		
		// try-with-resource statement to close resources automatically 
		
		
		
		// 1. get database connection
		String cs = "jdbc:mysql://localhost:3306/company";
		try(Connection connection = DriverManager.getConnection(cs,"root","root");
				
				// 2. create statement
				Statement statement = connection.createStatement();
				
				//3. execute statement
				ResultSet resultSet = statement.executeQuery("select * from department;");
			)	
		{	
			// 4. process result
			while(resultSet.next())
			{
				int deptcode = resultSet.getInt(1);
				String deptname = resultSet.getString(2);
				String location = resultSet.getString(3);
				
				System.out.println(deptcode + ", " + deptname + ", " + location);
			}
			
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
