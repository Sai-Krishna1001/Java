package com.Employee;

public class EmpData1 {

	private String code;
	private String desig;
	private int da;
	
	//constructor with fields
	public EmpData1(String code, String desig, int da) {
		super();
		this.code = code;
		this.desig = desig;
		this.da = da;
	}

	//getters and setters
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public int getDa() {
		return da;
	}

	public void setDa(int da) {
		this.da = da;
	}

	//display data
	@Override
	public String toString() {
		return "EmpData1 [code=" + code + ", desig=" + desig + ", da=" + da + "]";
	}
	
	
	
	
}
