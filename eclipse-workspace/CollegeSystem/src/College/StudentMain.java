package College;

import java.sql.SQLException;

public class StudentMain {

	public static void main(String[] args) throws SQLException {
		
		StudentDAO sdao = new StudentDAO();
		sdao.connect();
//		Student s = new Student(4,"somesh","MECH","UCEN-JNTUK");
//		sdao.addStudent(s);
		
		//sdao.getAllStudents();
		
		Student s1 = new Student();
		s1 = sdao.getOneStudent(4); // while fetching it is not done like that, 
									// we have to create a object of the student type to store the incoming values
		System.out.println(s1.sid + ", " + s1.sname + ", " + s1.sdept + ", " + s1.scoll);
		System.out.println("Successfully!! get the data based on the StudentID");
		

	}

}
