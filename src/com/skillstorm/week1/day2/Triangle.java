package com.skillstorm.week1.day2;

public class Triangle extends Shape implements Polygon {

	private double base;
	private double height;

	public Triangle() {
		super("Red");
	}
	
	public Triangle(double base, double height) {
		this(base, height, "Red");
	}
	
	public Triangle(double base, double height, String color) {
		super(color);
		setBase(base);
		setHeight(height);
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double calcArea() {
		return 0.5 * base * height;
	}

	@Override
	public double calcPerimeter() {
		return height + base + base;
	}
	
	public double calcCircumference() {
		return 0.0;
	}
}
