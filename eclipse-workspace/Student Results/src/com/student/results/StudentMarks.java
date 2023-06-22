package com.student.results;

public class StudentMarks {
	
	private String sname;
	private int rollno;
	private int maths, physics, chemistry, english;
	

	// getters and setters
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getPhysics() {
		return physics;
	}
	public void setPhysics(int physics) {
		this.physics = physics;
	}
	public int getChemistry() {
		return chemistry;
	}
	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	
	//display 
	@Override
	public String toString() {
		return "StudentMarks [sname=" + sname + ", rollno=" + rollno + ", maths=" + maths + ", physics=" + physics
				+ ", chemistry=" + chemistry + ", english=" + english + "]";
	}
	
	

}
