package com.routeplanner;

public class Route {

	//declaring variables
	private String FromAddress;
	private String ToAddress;
	private int distance;
	private String travelTime;
	private String airFare;
	
	//creates constructor
	public Route(String fromAddress, String toAddress, int distance, String travelTime, String airFare) {
		FromAddress = fromAddress;
		ToAddress = toAddress;
		this.distance = distance;
		this.travelTime = travelTime;
		this.airFare = airFare;
	}

	//getters and setters
	public String getFromAddress() {
		return FromAddress;
	}

	public void setFromAddress(String fromAddress) {
		FromAddress = fromAddress;
	}

	public String getToAddress() {
		return ToAddress;
	}

	public void setToAddress(String toAddress) {
		ToAddress = toAddress;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public String getTravelTime() {
		return travelTime;
	}

	public void setTravelTime(String travelTime) {
		this.travelTime = travelTime;
	}

	public String getAirFare() {
		return airFare;
	}

	public void setAirFare(String airFare) {
		this.airFare = airFare;
	}

	@Override
	public String toString() {
		return "Route [FromAddress=" + FromAddress + ", ToAddress=" + ToAddress + ", distance=" + distance
				+ ", travelTime=" + travelTime + ", airFare=" + airFare + "]\n";
	}
	
	
	
}
