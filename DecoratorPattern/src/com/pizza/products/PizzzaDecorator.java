package com.pizza.products;

public abstract class PizzzaDecorator  implements  IPizza{
	
	protected IPizza _pizza;
	
	PizzzaDecorator(IPizza pizza){
		
		this._pizza=pizza;
	}
	
	public void prepare() {
		
		_pizza.prepare();
	}

}
