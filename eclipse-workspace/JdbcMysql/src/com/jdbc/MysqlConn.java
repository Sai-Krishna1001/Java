package com.jdbc;

import java.sql.*;

// Java Database connectivity
/*
1. import --> java.sql
2. load and register the driver --> com.mysql.jdbc.Driver
3. create connection 
4. create a statement
5. execute the query
6. process the results
7. close the connection

*/



public class MysqlConn {

	public static void main(String[] args) throws Exception{
		
		String url = "jdbc:mysql://localhost:3306/company";
		String uname = "root";
		String passw = "sql@123";
		
		int dc = 90;
		String dn = "production ";
		String loc = "chennai";
		String query = "insert into department values(?,?,?);";
		//Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,passw);
		
		PreparedStatement stmt = con.prepareStatement(query);
		stmt.setInt(1, dc);
		stmt.setString(2, dn);
		stmt.setString(3, loc);
		
		int count = stmt.executeUpdate();
		
		System.out.println("No.Of rows affected = " + count);
		
		stmt.close();
		con.close();
	}

}
