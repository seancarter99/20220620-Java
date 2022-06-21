package com.skillstorm.week1.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayPracitce {

	public static void main(String[] args) {
		// An array is simply a contiguous block of memory that houses a collection of data
		// It is fixed size (once we define the size, that's it)
		// Arrays are 0 indexed
		
		// Declare an array
		// Arrays can hold both primitives and non-primitives
		int[] numbers; // an array of ints
		// Define the array
		numbers = new int[10]; // Creates an array of integers of size 10 (holds 10 ints)
		
		// Access or mutate values at a given index
		numbers[0] = 1;
		numbers[4] = 20;
		
		// Arrays have random access for all elements
		// Means that lookups and writes to individual indices are lightning fast
		int[] biggerNums = new int[15];
		
		Shape[] shapes = new Shape[5];
		shapes[0] = new Rectangle();
		shapes[1] = new Circle();
		shapes[2] = new Triangle();
		
		// Similar to Python/JS
		Object[] objs = new Object[5];
		objs[0] = "";
		objs[1] = false;
		objs[2] = new Triangle();
		objs[3] = new IceCream();
		objs[4] = numbers;
		
		Object[] words = new Object[2];
		words[1] = false;
		System.out.println(words[1]);
		
		
		// Iterating through an array
		// Loops
		/*
		 * While loops
		 * For loops
		 * do-while loops
		 * Enhanced for loops
		 * 
		 * Iterator (Not actually a loop)
		 */
		
		// While loop
		
		
		// While the condition is met, execute the code in the {}
//		while (true) { // This loops forever
//			System.out.println("Looping");
//		}
		
//		int num = 2;
//		while (num != 2) { // This will never run
//			System.out.println("I will never print");
//		}
		
		// We need a counter to keep track of the current index of the array
		int index = 0;
		while (index < numbers.length) { // Loops so long as the index is less the array length
			System.out.println(numbers[index]);
			// This moves us to the next value, without it we loop forever
			index++; // index += 1 or index = index + 1
		}
		
		// For loop
		// Loops meant for iterating for a set amount of intervals
		// 1. Loop index
		// 2. Condition
		// 3. Incrementor
		System.out.println();
		for (int i = 0; i < objs.length; i++) { // i being short for index
			System.out.println(objs[i]);
		}
		
		// Do-While
		// Do-While loops always run at least once
		// Seldom used
		System.out.println();
		index = 0;
		do {
			System.out.println(numbers[index]);
			index++;
		} while (index < numbers.length);
		
		// Enhanced For Loop or For-Each
		// Only use if you do not need the index
		// If you want iterate backwards, you cannot use a for-each loop
		// For each object called obj inside the array objs
		for (Object obj : objs) {
			System.out.println(obj);
		}
		
		// Iterator
		// Basically a loop that can execution paused
		// Parse some items, do something else, resume parsing items where you left off
		List<Object> objsList = Arrays.asList(objs); // Turn into a list
		Iterator<Object> objItr = objsList.iterator();
		
		
//		objsList.add("Hello!");
		Object item1 = objItr.next();
//		objItr.remove();
		Object item2 = objItr.next();
		Object item3 = objItr.next();
		System.out.println("Item 1: " + item1);
		System.out.println("Item 2: " + item2);
		System.out.println("Item 3: " + item3);
		Object item4 = objItr.next();
		Object item5 = objItr.next();
		
		System.out.println("Item 4: " + item4);
		System.out.println("Item 5: " + item5);
		
		
		ArrayList<Object> nums = new ArrayList<>();
		nums.add("Hello!");
		Iterator<Object> numsItr = nums.iterator();
		
		numsItr.next();
//		numsItr.remove();
		
		System.out.println(nums);
		
		
		// Nested loops
		// Loop in a loop
		for (int lapCount = 0; lapCount < 2; lapCount++) {
			for (int pushUpCount = 0; pushUpCount < 5; pushUpCount++) {
				System.out.println("Push Up Number: " + pushUpCount);
			}
			System.out.println("\nFinished Push Ups\n");
			
			for (int sitUpCount = 0; sitUpCount < 10; sitUpCount++) {
				System.out.println("Sit Up Number: " + sitUpCount);
			}
			System.out.println("\nFinished Sit Ups\n");
			
			System.out.println("Finished Lap!\n");
		}
		
		// If we have a 2D array, nested loops are very useful
		// 2D arrays are just an array of arrays
		// Great for matrices or grid systems
		// Think of it as rows and columns
		int[][] twoDArray = new int[3][5];
		twoDArray[0][1] = 1;
		
		int[][] another2DArray = { {0, 1}, {20, 6}, {3, -6, 12} };
		
		// Standard for loop
		// named for loop
		// Used to specify which loop to break/continue
		// break exits loop
		// continue goes back to top of loop
		outer: for (int i = 0; i < another2DArray.length; i++) {
			inner: for (int j = 0; j < another2DArray[i].length; j++) {
				System.out.println(another2DArray[i][j]);
				break inner;
			}
		}
		
		System.out.println("Finished loop");
		
		// Enhanced for loop
		for (int[] arr : another2DArray) {
			for (int num : arr) {
				System.out.println(num);
			}
		}
	}

}
