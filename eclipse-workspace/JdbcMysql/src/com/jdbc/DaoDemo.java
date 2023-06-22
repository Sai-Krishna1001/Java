package com.jdbc;

import java.sql.*;
public class DaoDemo {

	public static void main(String[] args) throws SQLException {
		
		StudentDao dao = new StudentDao();
		Student s1 = dao.getStudent(12);
		System.out.println(s1.sname);

	}
}

class StudentDao{
	
	public Student getStudent(int rollno) throws SQLException
	{
		Student s = new Student();
		s.rollno = rollno;
		String url = "jdbc:mysql://localhost/college";
		String uname = "root";
		String pwd = "sql@123";
		String query = "select alpha from t1 where num = " + rollno;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,uname,pwd);
			PreparedStatement stmt = con.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			rs.next();
			String name = rs.getString(2);
			s.sname = name;
			return s;
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return null;
	}
}

class Student
{
	int rollno;
	String sname;
}