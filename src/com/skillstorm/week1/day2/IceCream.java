package com.skillstorm.week1.day2;

public class IceCream {

	private String flavor;
	private int numScoops;
	
	public IceCream() {
		this("Vanilla");
	}
	
	public IceCream(String flavor) {
		this(flavor, 1); // Calls line 17 constructor
		this.flavor = flavor;
	}

	public IceCream(String flavor, int numScoops) {
		super(); // Calls the Object constructor
		this.flavor = flavor;
		this.numScoops = numScoops;
	}
	
	public static void main(String[] args) {
		IceCream ic = new IceCream();
	}

}
