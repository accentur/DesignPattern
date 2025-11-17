package com.bridge;

public class Car extends IVehicle {

	public Car(IEngine engine) {
		super(engine);
		
	}

	@Override
	public void Refill() {
		
		System.out.println("Car:"+engine.Refill());
		
	}

}
