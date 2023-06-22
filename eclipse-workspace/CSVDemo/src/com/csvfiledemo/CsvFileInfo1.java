package com.csvfiledemo;

public class CsvFileInfo1 {
	//declaring variables
	private String brandName;
	private String modelName;
	private double cost;
	private String screenSize;
	private String BatteryLife;
	private String storageSpace;
	private int cameraPixels;
	
	//creates constructor
	public CsvFileInfo1(String brandName, String modelName, double cost, String screenSize, String batteryLife,
			String storageSpace, int cameraPixels) {

		this.brandName = brandName;
		this.modelName = modelName;
		this.cost = cost;
		this.screenSize = screenSize;
		this.BatteryLife = batteryLife;
		this.storageSpace = storageSpace;
		this.cameraPixels = cameraPixels;
	}

	//getters and setters
	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}

	public String getBatteryLife() {
		return BatteryLife;
	}

	public void setBatteryLife(String batteryLife) {
		BatteryLife = batteryLife;
	}

	public String getStorageSpace() {
		return storageSpace;
	}

	public void setStorageSpace(String storageSpace) {
		this.storageSpace = storageSpace;
	}

	public int getCameraPixels() {
		return cameraPixels;
	}

	public void setCameraPixels(int cameraPixels) {
		this.cameraPixels = cameraPixels;
	}

	@Override
	public String toString() {
		return "CsvFileInfo1 [brandName=" + brandName + ", modelName=" + modelName + ", cost=" + cost + ", screenSize="
				+ screenSize + ", BatteryLife=" + BatteryLife + ", storageSpace=" + storageSpace + ", cameraPixels="
				+ cameraPixels + "]\n";
	}
	
	

}
