package com.pizza.products;

public class MainApp {
	public static void main(String [] args) {

		IPizza pizza = new BasePizza();
		PeporraniPizza pepPizza = new PeporraniPizza(pizza);
		
		CapsicumPizza cap=new CapsicumPizza(pepPizza);
		cap.prepare();

	}

}
