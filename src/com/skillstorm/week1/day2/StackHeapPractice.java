package com.skillstorm.week1.day2;

import java.util.ArrayList;

public class StackHeapPractice {
	
	public static int addTwoNums(int x, int y) {
		return x + y;
	}
	
	public static void printNum(int num) {
		System.out.println(num);
	}
	
	public static void printNumSquared(int num) {
		printNum(num * num);
	}
	
	public static void changeArray(int[] nums) {
		int[] newArray = {3, 2, 1};
		nums = newArray;
	}
	
	public static int[] createArray() {
		int[] nums = {1, 2, 3};
		return nums;
	}
	
	public static void main(String[] args) {
//		int x = 2;
//		int y = 3;
//		int sum = addTwoNums(x, y);
//		printNum(sum);
//		printNumSquared(sum);
		
		int[] myNums = createArray();
		changeArray(myNums);
		myNums = null;
		System.gc(); // Is used just to clean up any leftover bits from the Heap
		System.out.println(myNums);
		
		String word1 = "Hello";
		String word2 = new String("World");
		word2 = word2.intern();
		String word3 = "World";
		
		
		if (word2 == word3) {
			System.out.println("The strings are equal!");
		} else {
			System.out.println("The strings are not equal!");
		}
		
		word3 += "!"; // World!
		
		System.out.println(word2);
		
		String reversedWord = "aloH";
		
		StringBuilder sb = new StringBuilder(reversedWord);
		String actualWord = "" + sb.reverse();
		
		System.out.println(actualWord);
		ArrayList<Shape> shapes = new ArrayList<>();
		shapes.add(new Circle());
		shapes.add(new Rectangle());
		System.out.println(shapes);
	}

	
	public static boolean compareTwoStrings(String word1, String word2) {
		if (word1 == null) {
			if (word2 == null) {
				return true;
			}
			return false;
		}
		
		return word1.equals(word2);
	}
}
