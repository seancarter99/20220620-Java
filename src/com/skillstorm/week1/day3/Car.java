package com.skillstorm.week1.day3;

public class Car implements Driveable {

	@Override
	public void drive() {
		System.out.println("Vroom vroom");
	}

	@Override
	public void drive(int numMiles) {
		System.out.println("Vroom vroom for " + numMiles + " miles");
	}

}

