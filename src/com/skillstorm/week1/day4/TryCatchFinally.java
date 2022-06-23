package com.skillstorm.week1.day4;

public class TryCatchFinally {

	public static int divideTwoNums(int x, int y) {
		try {
			return x / y;
		} catch (ArithmeticException e) {
			System.out.println("No divide by 0");
		} finally {
			System.out.println("If I always run");
//			return 0; // Since finally always runs, this return takes priority
		}
		return 0;
	}
	
	public static void main(String[] args) {
		// try/catch blocks are used to handle exceptions
		// You can also add finally blocks to the end and these will always run
		
		int quotient = divideTwoNums(100, 2);
		System.out.println(quotient);
		try {
			int x = 5 / 1;
			System.out.println(x);
			System.exit(1); // This kills the process, finally does NOT execute
		} catch (Exception e) {
			System.out.println("An error occured");
		} finally {
			System.out.println("I always run");
		}
	}

}
