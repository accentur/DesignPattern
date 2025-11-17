package com.bridge;

public class Bike  extends IVehicle{

	public Bike(IEngine engine) {
		super(engine);
	}

	@Override
	public void Refill() {
		
		System.out.println("Bike"+engine.Refill());
		
	}

}
