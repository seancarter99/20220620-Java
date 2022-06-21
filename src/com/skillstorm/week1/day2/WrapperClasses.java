package com.skillstorm.week1.day2;

public class WrapperClasses {

	public static void main(String[] args) {
		// Wrapper classes are built into Java and serve as a "wrapper" around primitives so that they can be
		// non-primitives
//		MyInteger i = new MyInteger(1);
		
		// There's a few prebuilt classes for all the primitives, and they have added features to them
//		Integer i = new Integer(1); Not the preferred way
		
		// Instead, favor "auto boxing the int"
		Integer i = 1; // Set the wrapper class equal to the Primitive. This will behave the same as up above
		// It's here for ease of use
		
		// There's auto unboxing
		int num = i;
		
		// You can also compare the primitive with the wrapper
		if (i == num) {
			
		}
		
		/*
		 * Places to use Wrapper Classes:
		 * 
		 * 1. If you need a value nullable (optional)
		 * 2. Generics require the wrapper classes
		 *    - Because Lists and other collection do not allow primitives
		 */
		
		Integer num1 = 10;
		int num2 = 20;
		
		System.out.println(num1 + num2); // auto unboxes the values
		
		/*
		 * Wrapper Class List
		 * 
		 * Integer
		 * Double
		 * Float
		 * Character
		 * Boolean
		 * Short
		 * Byte
		 * Void
		 */
	}

}

class MyInteger {
	int num;
	
	MyInteger(int num) {
		this.num = num;
	}
}