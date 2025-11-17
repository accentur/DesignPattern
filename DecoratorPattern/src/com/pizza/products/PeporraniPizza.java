package com.pizza.products;

public class PeporraniPizza extends PizzzaDecorator {

	PeporraniPizza(IPizza pizza) {
		super(pizza);
		
	}
	@Override
    public void prepare() {
		
		_pizza.prepare();
		System.out.println("Adding Peporani");
	}

}
