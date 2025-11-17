package com.builder.Product;

public class CellPhone {
	private String brand;
	private String os;
	private String processor;
	private int battery;

	private int camera;

	public CellPhone(String os, String processor, int battery, int camera, String brand) {
		super();
		this.os = os;
		this.processor = processor;
		this.battery = battery;
		this.camera = camera;
		this.brand=brand;
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	@Override
	public String toString() {
		return "CellPhone [brand=" + brand + ", os=" + os + ", processor=" + processor + ", battery=" + battery
				+ ", camera=" + camera + "]";
	}



	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	public int getCamera() {
		return camera;
	}

	public void setCamera(int camera) {
		this.camera = camera;
	}


}
