package com.builder.Product;

public class Samsung implements IphoneBuilder {

	private String brand="Samsung";
	private String os;
	private String processor;
	private int battery;

	private int camera;

	@Override
	public CellPhone GetPhone() {

		return new CellPhone(os, processor, battery, camera,brand);
	}

	@Override
	public IphoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}

	@Override
	public IphoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
		
	}

	@Override
	public IphoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}

	@Override
	public IphoneBuilder setCamera(int camera) {
		this.camera = camera;
		return this;
	}

}
