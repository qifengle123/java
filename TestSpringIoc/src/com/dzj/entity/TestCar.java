package com.dzj.entity;

public class TestCar {
	public static void main(String[] args) {
		int size = 3;
		Tire tire = new Tire(size);
		Bottom bottom = new Bottom(tire);
		Framwork framwork = new Framwork(bottom);
		Car car = new Car(framwork);
		car.run();
	}
}
