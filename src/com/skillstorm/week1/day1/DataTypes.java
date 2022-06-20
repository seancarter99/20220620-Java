package com.skillstorm.week1.day1;

public class DataTypes {

	// main + CTL + SPACE. Then ENTER
	public static void main(String[] args) {
		/*
		 * Data Types:
		 * 
		 * Primitives:
		 * - Numeric Data Types
		 *   - int (Integer and the value ranges from -2147483648 to 2147483647)
		 *   - long (Integer -9223372036854775808 to 9223372036854775807)
		 *   - short (Integer -32,768 to 32,767)
		 *   - byte (Integer -128 to 127)
		 *   
		 *   - float (Floating point number. Decimals)
		 *   - double (Also a floating point number, but has double the available space)
		 * - Boolean Data Types
		 *   - boolean (true/false)
		 * - Text Data Types
		 *   - char (A numeric value representing a single character)
		 * 
		 * Non-Primitives:
		 * - String
		 *   - Represents a string of characters. It is a class in Java
		 * - Classes
		 * - Arrays
		 * - BigInteger
		 * - BigDecimal
		 * 
		 * All non-primitives can have null as value. Null is the abscence of a value
		 */
		
		// Declaring a variable
		int x = 2147483647;
		System.out.println(x + 1); // Integer overflow. When exceeding the max size, wrap back around
		
		char a = 65; // 65 is the ASCII code for 'A'
		a = 'A'; // You can define like this. You must use single quotes though
		System.out.println(a);
		
		
		byte b = (byte) 128; // I need to cast for this to work
		// A cast is nothing more than a guarantee to the compiler that this is that type
		System.out.println(b); // 128 overflows to -128
		
		float myFloat = 10.1f;
		int myInt = (int) myFloat; // narrow casting
		System.out.println("The float after narrow casting is: " + myInt); // descriptive print
		
		/*
		 * Narrow Casting:
		 *  Taking a larger data type and casting down to a smaller data type
		 *  We need to explicitly cast the value since data could be lost in the process
		 * 
		 * Wide Casting:
		 *  Taking a smaller data type and casting up to a larger data type
		 *  Since no data will be lost in this process, I do NOT have to explicitly cast
		 */
		
		double myDouble = myFloat; // No need for a cast, it is implicit
		System.out.println("The float after wide casting is: " + myDouble);
		
		DataTypes dt = null;
		
		Dog dog = null; // Since i have a class Dog, I can use it
		dog = new Dog("Levi", (short) 1, "Sean"); // Creates a dog object
		dog.setName("");
		String dogName = dog.getName();
		System.out.println(dogName);
		String owner= dog.getOwner();
	}
}
