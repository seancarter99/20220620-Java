package com.skillstorm.week1.day2;

// Public class name must match the file
// Only one public class per file
public class Rectangle extends Shape implements Polygon {
	private double length;
	private double width;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle (double length) { // Act as a Square constructor
		this(length, length); // reuse the logic from the other constructor
	}
	
	public Rectangle(double length, double width) {
		setLength(length); // reuse the setter logic
		setWidth(width); // reuse the setter logic
	}
	
	public Rectangle(double length, double width, String color) {
		super(color);
		setLength(length); // reuse the setter logic
		setWidth(width); // reuse the setter logic
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	public double calcArea() {
		return length * width;
	}
	
	public double calcPerimeter() {
		return (2 * length) + (2 * width);
	}
	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(5.0, 10.0);
		System.out.println("Area of the rectangle is: " + rect.calcArea());
		System.out.println("Perimeter of the rectangle is: " + rect.calcPerimeter());
		
		rect.setLength(10.0);
		System.out.println("Area of the rectangle is: " + rect.calcArea());
		System.out.println("Perimeter of the rectangle is: " + rect.calcPerimeter());
	}
}
