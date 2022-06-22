package com.skillstorm.week1.day3;

import java.util.PriorityQueue;

import com.skillstorm.week1.day2.IceCream;

public class QueuePractice {

	public static void main(String[] args) {
		/*
		 * Queues behave like a line at a Target
		 * 
		 * They're First-In, First-Out (FIFO)
		 *  - If I'm the first person in line, I'm also the first out of it
		 *  
		 * Adding to a queue, new items go to the back of it
		 */
		
		// PriorityQueue
		// It uses the "natural ordering" of the individual elements
		// If something isn't Comparable OR no Comparator is provided, then the
		// PriorityQueue throws an exception
		
//		PriorityQueue<IceCream> prioQ = new PriorityQueue<>();
//		prioQ.add(new IceCream()); // Throws ClassCastException
		
		PriorityQueue<Student> students = new PriorityQueue<>();
		students.add(new Student("Mark", 24, 75.0f)); // adds to queue
		students.add(new Student("Albert", 21, 30.0f));
		students.add(new Student("Zoe", 18, 92.0f));
		students.add(new Student("Matt", 30, 86.0f));
		students.add(new Student("Aaron", 30, 86.0f));
		
		System.out.println(students.peek()); // Checks the next in line
		
		students.poll(); // Remove the front of the PriorityQueue
		System.out.println(students.peek());
		
		students.poll(); // Remove the front of the PriorityQueue
		System.out.println(students.peek());
		students.poll(); // Remove the front of the PriorityQueue
		students.add(new Student("Aaron", 30, 86.0f));
		System.out.println(students.peek());
		students.poll(); // Remove the front of the PriorityQueue
		System.out.println(students.peek());
		students.poll(); // Remove the front of the PriorityQueue
		System.out.println(students.peek());
		
		PriorityQueue<Student> prioQ = new PriorityQueue<>(new StudentAgeComparator());
	}
}
