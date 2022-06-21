package com.skillstorm.week1.day2;

// Working with Shapes
public class ShapeDriver {
	
	
	// Static functions can only call other static functions
	// This is known as runtime polymorphism
	// Compile time polymorhpism is method overloading
	public static void printArea(Shape shape) {
		// I specify the param as a Shape is so that I can take ANY shape
		// Java knows at runtime what Shape this shape variable actually is, and will call its own version of calcArea
		System.out.println("The area of the shape provided is: " + shape.calcArea());
	}
	
	public static void calcPerimeter(Polygon polygon) {
		System.out.println("The perimeter of the polygon provided is: " + polygon.calcPerimeter());
	}
	
	public static void calcCircumference(Shape shape) {
		// I can check at runtime what the actual shape is
		if (shape instanceof Circle) { // If the shape is a circle
			Circle circle = (Circle) shape; // Only cast if I know it to be a circle
			System.out.println("The circumference of the shape provided is: " + circle.calcCircumference());
		} else {
			System.out.println("Not a circle");
		}
	}

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(5.0, 10.0, "Blue");
		System.out.println("The area of the rectangle is: " + rect.calcArea());
		System.out.println("The perimeter of the rectangle is: " + rect.calcPerimeter());
		System.out.println("The color of the rectangle is: " + rect.getColor());
		
		Triangle triangle = new Triangle(10.0, 15.0, "Yellow");
		System.out.println("The area of the triangle is: " + triangle.calcArea());
		System.out.println("The perimeter of the triangle is: " + triangle.calcPerimeter());
		System.out.println("The color of the triangle is: " + triangle.getColor());
		
		
		Circle circle = new Circle(5.0, "Green");
		System.out.println();
		
		// Since they're both Shapes, I can call them both Shapes
		printArea(rect);
		printArea(triangle);
		printArea(circle);
		
		calcPerimeter(triangle);
		calcPerimeter(rect);
		
		System.out.println();
		
		calcCircumference(circle);
		calcCircumference(triangle); // Throws a ClassCastException since I tried to treat a Triangle as a Circle
	}

}
