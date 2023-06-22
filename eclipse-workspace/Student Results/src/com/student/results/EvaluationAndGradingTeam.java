package com.student.results;

public class EvaluationAndGradingTeam {

	private StudentMarks marks[];
	private int[] totalMarks;
	private int noOfStudents;
	private double classAverageMarks;
	private double mathsAvg;
	private double chemistryAvg;
	private double physicsAvg;
	private double englishAvg;
	private static int count;
	
	public void intialize(int noOfStudents) {
		marks = new StudentMarks[noOfStudents];
		this.noOfStudents = noOfStudents;
		totalMarks = new int[noOfStudents];
	}
	public void calculateTotalMarks() {
		for (int i = 0; i < this.noOfStudents; i++) {
			this.totalMarks[i] = this.marks[i].getChemistry() + this.marks[i].getEnglish() + 
					this.marks[i].getMaths() + this.marks[i].getPhysics();
		}
	}
	public void calculateClassAverageMarks()
	{
		int classTotalMarks = 0;
		for (int i = 0; i < this.noOfStudents; i++) {
			classTotalMarks += this.totalMarks[i];
			
		}
		this.classAverageMarks = classTotalMarks/this.noOfStudents;
	}
	
	public void calculateSubjectAverageMarks()
	{
		int maths = 0, chemistry = 0, physics = 0, english = 0;
		for (int i = 0; i < this.noOfStudents; i++) {
			maths += this.marks[i].getMaths();
			chemistry += this.marks[i].getChemistry();
			physics += this.marks[i].getPhysics();
			english += this.marks[i].getEnglish();
		}
		
		this.chemistryAvg = chemistry/this.noOfStudents;
		this.mathsAvg = maths/this.noOfStudents;
		this.physicsAvg = physics/this.noOfStudents;
		this.englishAvg = english/this.noOfStudents;
	}
	public void add(StudentMarks sm) {
		this.marks[count++] = sm;
	}
	
	
	public int getNoOfStudents() {
		return noOfStudents;
	}
	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}
	public double getClassAverageMarks() {
		return classAverageMarks;
	}
	public void setClassAverageMarks(double classAverageMarks) {
		this.classAverageMarks = classAverageMarks;
	}
	public double getMathsAvg() {
		return mathsAvg;
	}
	public void setMathsAvg(double mathsAvg) {
		this.mathsAvg = mathsAvg;
	}
	public double getChemistryAvg() {
		return chemistryAvg;
	}
	public void setChemistryAvg(double chemistryAvg) {
		this.chemistryAvg = chemistryAvg;
	}
	public double getPhysicsAvg() {
		return physicsAvg;
	}
	public void setPhysicsAvg(double physicsAvg) {
		this.physicsAvg = physicsAvg;
	}
	public double getEnglishAvg() {
		return englishAvg;
	}
	public void setEnglishAvg(double englishAvg) {
		this.englishAvg = englishAvg;
	}
	public StudentMarks[] getMarks() {
		return marks;
	}
	public void setMarks(StudentMarks[] marks) {
		this.marks = marks;
	}
	public int[] getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int[] totalMarks) {
		this.totalMarks = totalMarks;
	}
	
	
}
