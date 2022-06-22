package com.skillstorm.week1.day3;

public class Bicycle implements Driveable {

	@Override
	public void drive() {
		System.out.println("Ding ding");
	}

	@Override
	public void drive(int numMiles) {
		System.out.println("Ding ding for " + numMiles + " miles");
	}

}
