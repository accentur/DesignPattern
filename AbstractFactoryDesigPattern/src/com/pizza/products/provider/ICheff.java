package com.pizza.products.provider;

import com.pizza.products.IBurger;
import com.pizza.products.IPizza;

// Cheff will prepare the products.
public interface ICheff {

	public IPizza preparePizza();
	public IBurger prepareBurger();

}
