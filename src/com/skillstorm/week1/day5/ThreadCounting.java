package com.skillstorm.week1.day5;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadCounting {

	// Volatile makes the value accessible to all threads
	// A light weight synchronization tool that doesn't block
	// If it doesn't block, I need to ensure that it's most up to date value
	// If I volatile, it will be (at the cost of a slight performance hit)
	private volatile static int count = 0;
	
	// All methods mutating/reading are atomic by default
	private static AtomicInteger atomicCount = new AtomicInteger(0);
	
	// This locks the entire object
	// I can't call any other static synchronized methods on the ThreadCounting class
	// till this is done
	public static void increment() {
		// This looks like one step
		// It's actually 3
		// 1. Read the value
		// 2. Increment the value
		// 3. Write the value to memory
		count++; // This needs to be atomic
		atomicCount.incrementAndGet(); // ++atomicCount or atomicCount++
	}
	
	public static void main(String[] args) throws InterruptedException {
		MyThread t1 = new MyThread(10000000);
		MyThread t2 = new MyThread(10000000);
		
		// 2000 should be the total count by the end
		
		t1.start();
		t2.start();
		
//		Thread.sleep(100);
		// This isn't synchronized, it might not be the most up to date count
		System.out.println("Current count is " + count);
		
		try {
			// Main thread will wait until thread1 and thread2 finsih before resuming
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			
		}
		System.out.println("The total count by the end is: " + count);
		System.out.println("The total atomic count by the end is: " + atomicCount.get());
		
	}

}

class MyThread extends Thread {
	
	private int loopAmount;
	
	public MyThread(int loopAmount) {
		this.loopAmount = loopAmount;
	}
	
	// This will be called when executing the thread
	@Override
	public void run() {
		for (int i = 0; i < loopAmount; i++ ) {
			ThreadCounting.increment();
		}
	}
}