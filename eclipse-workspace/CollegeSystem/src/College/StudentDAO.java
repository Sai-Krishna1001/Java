package College;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDAO {

	Connection conn;
	// we are going to create a method connect() for database connection
	public void connect() throws SQLException {
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","sql@123");
			System.out.println(" Database Connected!!");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
//		catch(ClassNotFoundException e) {
//			e.printStackTrace();
//		}
	}
	
	// now we are going to create a method which is going to make entry in the database
	public void addStudent(Student s) {
		PreparedStatement pst;	// we used preparedStatement here because we have to insert value in database dynamically from user
								
		String query = "insert into student values(?,?,?,?)";// we have 4 columns then in query we specify 4 ? marks
		try {
			pst = conn.prepareStatement(query);
			
			pst.setInt(1, s.sid);
			pst.setString(2, s.sname);
			pst.setString(3, s.sdept);
			pst.setString(4, s.scoll);
			pst.executeUpdate(); // executeUpdate is used to commit the changes in DB
			pst.close();
			System.out.println("Successfully!! inserted");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//create a method to fetch valued from database
	public void getAllStudents() {
		Student s = new Student();
		String query = "select * from student";
		Statement st;
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				s.sid = rs.getInt(1);
				s.sname = rs.getString(2);
				s.sdept = rs.getString(3);
				s.scoll = rs.getString(4);
				System.out.println(s.sid + ", " + s.sname + ", " + s.sdept + ", " + s.scoll);
			}
			System.out.println("Successfully!! fetched all the students");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// create a method where we pass student id and get corresponding student data
	public Student getOneStudent(int std_id) throws SQLException {
		Student s = new Student();
		String query = "Select * from Student where sid = " + std_id;
		Statement st;
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			rs.next(); // rs.next() because initially pointer is pointing to column name when we next() method point goes to 1st row
			s.sid = rs.getInt(1);
			s.sname = rs.getString(2);
			s.sdept = rs.getString(3);
			s.scoll = rs.getString(4);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return s;
		
	}
}
