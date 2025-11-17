package com.pizza.waiter;

import com.pizza.products.IBurger;
import com.pizza.products.IPizza;
import com.pizza.products.provider.ICheff;
import com.pizza.products.provider.NonVegCheff;
import com.pizza.products.provider.VegCheff;

public class OrderTaker {

	private ICheff foodFactory;

	public OrderTaker(String preference) {

		if (preference == "VEG") {

			foodFactory = new VegCheff();
		} else {

			foodFactory = new NonVegCheff();

		}
	}

	public IPizza getPizza() {

		return foodFactory.preparePizza();
	}

	public IBurger getBurger() {

		return foodFactory.prepareBurger();
	}
}
