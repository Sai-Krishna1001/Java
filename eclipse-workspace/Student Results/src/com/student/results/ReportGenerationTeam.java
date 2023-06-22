package com.student.results;

public class ReportGenerationTeam {

	private String topperName;
	private int passMark = 36;
	private String passedStudents[];
	private String FailedStudents[];
	private static int ps,fs;
	private StudentMarks[] marks;
	EvaluationAndGradingTeam EGT;
	
	public ReportGenerationTeam() {
		EGT = new EvaluationAndGradingTeam();
		this.marks = EGT.getMarks();
		passedStudents = new String[EGT.getNoOfStudents()];
		FailedStudents = new String[EGT.getNoOfStudents()];
	}
	public void findTopper()
	{
		int maxMarks = 0;
		int index = 0;
		for (int i = 0; i < EGT.getNoOfStudents(); i++) {
			if(EGT.getTotalMarks()[i] > maxMarks)
			{
				maxMarks = EGT.getTotalMarks()[i];
				index = i;
			}
		}
		this.topperName = this.marks[index].getSname();
	}
	
	public void checkPassOrFail()
	{
		for (int i = 0; i < EGT.getNoOfStudents(); i++) {
			boolean x = (passMark >= marks[i].getChemistry()) && (passMark >= marks[i].getEnglish()) && 
					(passMark >= marks[i].getMaths()) && (passMark >= marks[i].getPhysics());
			if(x) {
				passedStudents[ps++] = marks[i].getSname();
			}
			else
			{
				FailedStudents[fs++] = marks[i].getSname();
			}
		}
		System.out.println("maths: " + marks[0].getMaths());
	}

	public String getTopperName() {
		return topperName;
	}

	public void setTopperName(String topperName) {
		this.topperName = topperName;
	}

	public static int getPs() {
		return ps;
	}

	public static void setPs(int ps) {
		ReportGenerationTeam.ps = ps;
	}

	public static int getFs() {
		return fs;
	}

	public static void setFs(int fs) {
		ReportGenerationTeam.fs = fs;
	}

	public void getPassedStudents() {
		for(String sn : passedStudents) {System.out.println(sn);}
	}

	public void getFailedStudents() {
		for(String sn : FailedStudents) {System.out.println(sn);}
		
	}
	
}
