package com.builder.Product;

public interface IphoneBuilder {

	CellPhone GetPhone();

	IphoneBuilder setOs(String os);

	IphoneBuilder setProcessor(String processor);

	IphoneBuilder setBattery(int battery);

	IphoneBuilder setCamera(int camera);

}