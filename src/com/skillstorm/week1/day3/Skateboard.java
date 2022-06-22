package com.skillstorm.week1.day3;

public class Skateboard implements Driveable {

	@Override
	public void drive() {
		System.out.println("Skate skate");
	}

	@Override
	public void drive(int numMiles) {
		System.out.println("Skate skate for " + numMiles + " miles");		
	}
}
