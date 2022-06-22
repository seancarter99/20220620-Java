package com.skillstorm.week1.day3;

public class Varargs {

	// Varargs stands for variable number of arguments
	// Varargs get condensed into an array of that type automatically
	// Varargs must be the final parameter of a function
	public static void vargs(String... words) {
		for (String word : words) {
			System.out.println(word);
		}
	}
	
	// main method can have varargs
	public static void main(String... args) {
		vargs("Hello","my", "name", "is", "Sean"); // I can call the function with 0-infinity arguments
	}

}
