package com.skillstorm.week1.day4;

//There's only one Superman
public class Superman implements Superhero {
	
	private static Superman superman = new Superman();
	
	private Superman() {
		
	}
	
	public static Superman getInstance() {
		return superman;
	}

	@Override
	public void activateSuperpower() {
		System.out.println("Flies and shoots lasers");
	}

	@Override
	public void stateName() {
		System.out.println("My name is Superman");
	}
	
}
