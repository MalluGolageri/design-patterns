package com.mallu.design.decorator;

public class DecoratorTest {

	public static void main(String[] args) {		
		Car car=new SportsCar(new BasicCar());
		car.assemble();
	}
}
