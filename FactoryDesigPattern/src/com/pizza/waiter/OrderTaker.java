package com.pizza.waiter;

import com.pizza.products.IPizza;
import com.pizza.products.provider.ICheff;
import com.pizza.products.provider.NonVegCheff;
import com.pizza.products.provider.VegCheff;

public class OrderTaker {

	public IPizza getPizza(String type) {

		ICheff cheff;
		switch (type) {

		case "Veg":

			cheff = new VegCheff();
			break;

		default:
			cheff = new NonVegCheff();
			break;

		}

		return cheff.preparePizza();
	}

}
