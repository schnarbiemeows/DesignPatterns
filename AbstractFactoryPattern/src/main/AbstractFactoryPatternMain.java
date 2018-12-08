package main;

import classes.Car;
import classes.CarFactory;

public class AbstractFactoryPatternMain {

	/*
	 * AbstractFactory pattern involves a double layer of the Factory pattern, in this case
	 * a factory for the location, and a Factory for the car type
	 */
	public static void main(String[] args) {
		
		Car myNewCar = new CarFactory().orderCar("US","mini");
		if(myNewCar!=null) {
			System.out.println(myNewCar.getCarType());
		}
		myNewCar = new CarFactory().orderCar("Germany","jallopy");
		if(myNewCar!=null) {
			System.out.println(myNewCar.getCarType());
		}
	}

}
