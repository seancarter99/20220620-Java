package com.skillstorm.week1.day3;

// Anything that implements Driveable will have the ability to be "driven" 
public interface Driveable {
	
	public void drive();
	
	public void drive(int numMiles);
	
	
	// You can have static methods in an interface so I can put main here if I want
	public static void main(String[] args) {
		Driveable[] methodsOfTransport = new Driveable[4];
		methodsOfTransport[0] = new Car();
		methodsOfTransport[1] = new Skateboard();
		methodsOfTransport[2] = new Bicycle();
		methodsOfTransport[3] = new Drone();
		
		for (Driveable transport : methodsOfTransport) {
			transport.drive(6);
		}
	}
}
