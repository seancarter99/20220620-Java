package com.skillstorm.week1.day2;


// Interfaces are similar to abstract classes, but they can't have ANY concrete methods (only abstract)
// A class can only extend one other class, but a class can implement multiple interfaces
public interface Polygon {
	
	// Anything that's a Polygon will be able to calculate it's own perimeter
	public double calcPerimeter();
	
	
	// You "can" define concrete methods using default, but in general you should avoid
	// This brings about the problems of multiple inheritance
//	default String getColor() {
//		return "Red";
//	}
}


// Interfaces can extend other interfaces
// Anything implementing this one, must implement any abstract method from the parent and itself
interface MyPolygon extends Polygon {
	
}