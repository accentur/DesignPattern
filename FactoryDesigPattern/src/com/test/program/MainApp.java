package com.test.program;

import com.pizza.products.IPizza;
import com.pizza.waiter.OrderTaker;

//Products => Factory Products Provider => Client Program => Main Program

public class MainApp {

	public static void main(String[] args) {

		OrderTaker waiter = new OrderTaker();
		IPizza pizza = waiter.getPizza("Non Veg");
		pizza.eat();

	}

}
