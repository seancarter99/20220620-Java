package com.skillstorm.week1.day3;

public class PrefixPostfix {

	public static int addTwoNums(int x, int y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		// Prefix looks like ++i
		// Postfix looks like i++
		
		int a = 5;
		int b = ++a; // Adds 1 to a, then assigns the value to b
		int c = a++; // Assigns of value of a to c, then adds 1 to a
//		System.out.println(b);
		
		int sum = addTwoNums(a++, a++);
//		System.out.println(sum);
//		System.out.println(a);
		
		// for (int i = 1; i <= 10; i++)
		for (int i = 0; i++ < 10; ) {
//			System.out.println(i);
		}
		
		// Short-circuiting
		
		int val = 10;
		val *= 2; // val = val * 2;
		
		// && and || short-circuits
		// & and | runs both halves regardless
		if (validator(val++) | validator(++val)) {
//			val;
		}
		System.out.println(val);
	}
	
	public static boolean validator(int num) {
		if (num == 10) {
			throw new IllegalArgumentException();
		}
		return true;
	}

}
