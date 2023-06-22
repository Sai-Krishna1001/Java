package com.electricity;

public class BillDetails {

	public String userName;
	public int meterNo;
	public String month;
	public double units;
	public double totalBill;
	public String status;
	
	// create parameterized and non-parameterized constructors
	public BillDetails() {
		
	}
	
	public BillDetails(String userName, int meterNo, String month, double units, double totalBill, String status) {
		
		this.userName = userName;
		this.meterNo = meterNo;
		this.month = month;
		this.units = units;
		this.totalBill = totalBill;
		this.status = status;
	}
	
	// getters and setters

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getMeterNo() {
		return meterNo;
	}

	public void setMeterNo(int meterNo) {
		this.meterNo = meterNo;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public double getUnits() {
		return units;
	}

	public void setUnits(double units) {
		this.units = units;
	}

	public double getTotalBill() {
		return totalBill;
	}

	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
