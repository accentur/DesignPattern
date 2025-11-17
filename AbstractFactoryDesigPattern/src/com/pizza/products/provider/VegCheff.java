package com.pizza.products.provider;

import com.pizza.products.IBurger;
import com.pizza.products.IPizza;
import com.pizza.products.VegBurger;
import com.pizza.products.VegPizza;

public class VegCheff implements ICheff {

	@Override
	public IPizza preparePizza() {

		return new VegPizza();
	}

	@Override
	public IBurger prepareBurger() {
		
		return new VegBurger();
	}

}
