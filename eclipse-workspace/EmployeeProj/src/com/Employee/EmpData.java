package com.Employee;

import java.util.Date;

public class EmpData {

	private int eno;
	private String ename;
	private int basic;
	private int hra;
	private String desig;
	private String date;
	
	//constructor with fields
	public EmpData(int eno, String ename, int basic, int hra, String desig, String date) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.basic = basic;
		this.hra = hra;
		this.desig = desig;
		this.date = date;
	}
	
	//display data
	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getBasic() {
		return basic;
	}

	public void setBasic(int basic) {
		this.basic = basic;
	}

	public int getHra() {
		return hra;
	}

	public void setHra(int hra) {
		this.hra = hra;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "EmpData [eno=" + eno + ", ename=" + ename + ", basic=" + basic + ", hra=" + hra + ", desig=" + desig
				+ ", date=" + date + "]";
	}
	
	

}	
	
