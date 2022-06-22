package com.skillstorm.week1.day3;

public class Drone implements Driveable {

	@Override
	public void drive() {
		System.out.println("Bzz bzz");
	}

	@Override
	public void drive(int numMiles) {
		System.out.println("Bzz bzz for " + numMiles + " miles");
	}

}
