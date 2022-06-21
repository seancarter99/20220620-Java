package com.skillstorm.week1.day2;

public class Circle extends Shape {

	private double radius;
	
	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public Circle(double radius, String color) {
		super(color);
		setRadius(radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return Math.pow(radius, 2) * Math.PI; // pi * r^2
//		return radius * radius * Math.PI;
	}
	
	public double calcCircumference() {
		return 2 * radius * Math.PI;
	}

}
