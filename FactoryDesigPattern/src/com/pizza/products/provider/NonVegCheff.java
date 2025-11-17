package com.pizza.products.provider;

import com.pizza.products.IPizza;
import com.pizza.products.NonVegPizza;

public class NonVegCheff implements ICheff {

	@Override
	public IPizza preparePizza() {

		return new NonVegPizza();
	}

}
