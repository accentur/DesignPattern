package com.test.program;

import com.pizza.waiter.OrderTaker;

//Products => Factory Products Provider => Client Program => Main Program

public class MainApp {

	public static void main(String[] args) {

		OrderTaker waiter = new OrderTaker("NON VEG");

		waiter.getPizza().eat();
		waiter.getBurger().eat();
	}

}
