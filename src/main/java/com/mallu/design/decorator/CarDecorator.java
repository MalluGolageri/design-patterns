package com.mallu.design.decorator;

public class CarDecorator implements Car{

	protected Car car;
	public CarDecorator(Car car) {
		this.car=car;
	}
	
	@Override
	public void assemble() {
		//System.out.println("car decorator");
		this.car.assemble();		
	}

}
