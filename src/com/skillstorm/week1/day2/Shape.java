package com.skillstorm.week1.day2;

// Adding the abstract keyword, makes the class abstract
// An abstract class CANNOT be instantiated
// An abstract class is used to represent an idea or what a group of objects is capable of
public abstract class Shape {
	
	private String color; // Shape class manages color, the dimensions are handled by child classes
	
	public Shape() {
		
	}
	
	// These constructors will be called using super()
	public Shape(String color) {
		setColor(color);
	}
	
	// I can define a function body so long as there's no abstract keyword
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	// A shape must be able to do this
	
	// A shape must be able to calculate its area
	// The method body is left up to the child classes to create
	// Any class inheriting from Shape MUST override calcArea()
	public abstract double calcArea(); // No function definition
}
