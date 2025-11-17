package com.builder.director;

import com.builder.Product.Apple;
import com.builder.Product.CellPhone;
import com.builder.Product.Samsung;

public class Director {

	public CellPhone getSamsung() {

		return new Samsung().setBattery(23).GetPhone();
	}

	public CellPhone getApple() {

		return new Apple().setBattery(23).GetPhone();
	}

}
