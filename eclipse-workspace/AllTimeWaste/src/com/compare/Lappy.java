package com.compare;

public class Lappy {

	private String brand;
	private int ram;
	private double price;
	
	//constructor
	public Lappy(String brand, int ram, double price) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}
	
	//getters and setters
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	//display
	@Override
	public String toString() {
		return "Lappy [brand=" + brand + ", ram=" + ram + ", price=" + price + "]";
	}
	
	
}
