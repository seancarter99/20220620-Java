package com.skillstorm.week1.day3;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class ExceptionPractice {

	// Adding throws can be used to "duck" an exception
	// This just means that whoever calls my function can either handle it or duck themselves
	public static void main(String[] args) throws FileNotFoundException, SQLException {
		// Exceptions are just interrupts that disrupt the flow of a program
		// Errors are a more fatal type of exception, typically can't be recovered from
		
		/*
		 * Exception Examples:
		 * - NullPointerException
		 * - ArrayIndexOutOfBoundsException
		 * - FileNotFoundException
		 * - ClassCastException
		 * - ArithmeticException
		 * - Exception
		 * 
		 * Error Examples:
		 * - StackOverflowError
		 * - OutOfMemoryError
		 */
		
		/*
		 * Two categories of Exceptions
		 * 
		 * Unchecked Exceptions (Runtime Exceptions):
		 * - Java knows about it and you will not receive a compiler error for it
		 * 
		 * 
		 * Checked Exceptions (Compile-time Exceptions):
		 * - Java does NOT know about them, you need to indicate that some method 
		 *   could possible throw a checked exception
		 * - I am forced to handle the exception or mark that it throws said exception
		 * - Custom Exceptions  
		 */
		
		// Handle exceptions using try/catch
		// Order from most specific to least specific
		try {
			// Try code that could throw an exception
//			String s = null;
//			s.toString(); // Throws a null pointer exception
//			System.out.println("This code doesn't run");
			
			// "Fully qualified class name"
			Exception e = new java.lang.NullPointerException();
			throw e; // Manually cause a NullPointerException
		} catch (java.lang.NullPointerException e) {
			System.out.println("Caught NullPointerException");
//			System.err.println(""); // Prints to standard error (An)
			e.printStackTrace();
		} catch (Exception e) { // Recovers from an exception
			// Catch any exception should they occur.
			// This only runs if an exception occurs
			System.out.println("Exception caught! Crisis averted.");
		}
		System.out.println("End of try/catch");
		
//		if () {
//			
//		} else if () {
//			
//		} else if () {
//			
//		} else {
//			
//		}
		
		
		// Examine exceptions in the call stack
		int quotient = divideTwoNums(1, 0);
		System.out.println(quotient);	
		
		System.out.println("Made it to the end!");
		
		try {
			greet("Sally");
		} catch (MyException e) {
			// Prompt them not to choose Fred as a name
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// Prompt them not to pass null
		}
	}

	// If I mark that a function "throws" a checked exception, 
	// whoever calls the function, MUST handle it
	// UncheckedExceptions in the throws declaration are ignored by the compiler
	public static int divideTwoNums(int x, int y) throws FileNotFoundException, SQLException {
		if (y == 0) {
			throw new SQLException();
		}
		
		return x / y;
	}
	
	public static void greet(String name) throws MyException {
		if (name == null) {
			throw new IllegalArgumentException("No null values allowed");
		}
		if (name.equals("Fred")) {
			throw new MyException("No Freds allowed");
		}
		System.out.println("Hello, " + name);
	}
}

class NullPointerException {
	public static void main(String[] args) {
		// I can avoid importing
		com.skillstorm.week1.day2.Polygon p = new com.skillstorm.week1.day2.Rectangle();
	}
}
