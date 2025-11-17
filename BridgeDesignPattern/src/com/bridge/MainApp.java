package com.bridge;

public class MainApp {

	public static void main(String[] args) {

		IEngine imple = new PetrolEngine();
		IVehicle vehicle = new Bike(imple);
		vehicle.Refill();
	}

}
