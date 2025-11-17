package com.bridge;

public abstract class IVehicle {
	
	protected IEngine engine;

	public IVehicle(IEngine engine) {
		super();
		this.engine = engine;
	}

	public abstract void Refill();
}
