package com.skillstorm.week1.day4;

import java.util.Deque;
import java.util.LinkedList;

public class StackPractice {

	public static void main(String[] args) {
		// Stacks are First-In, Last-Out
		// Last-In, First-Out (LIFO)
		
		LinkedList<String> words = new LinkedList<>();
		words.push("Wikipedia");
		words.push("George Washington");
		words.push("Continental Army");
		words.push("Great Britain"); // Add to top
		words.add("Google"); // Add to bottom 
		System.out.println(words);
		System.out.println(words.peek()); // peeks top
		System.out.println(words.peekLast()); // peeks bottom
	}

}
