package com.pizza.products;

public class CapsicumPizza  extends PizzzaDecorator{
	

	CapsicumPizza(IPizza pizza) {
		super(pizza);
		
	}
	@Override
    public void prepare() {
		
		_pizza.prepare();
		System.out.println("Adding Capcisum");
	}

}
