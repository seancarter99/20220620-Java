package com.skillstorm.week1.day5;

import com.skillstorm.week1.day4.Superman;

public class EndangeredCitizen implements Runnable {

	private String name;
	
	public EndangeredCitizen() {
		
	}
	
	public EndangeredCitizen(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Run is the method that will run while the thread is executing
	// Once run finishes, the thread stops
	@Override
	public void run() {
		// I want all of these to occur together
		// This is known as an "atomic" operation
		// Taking multiple actions and having them act as a single, atomic unit
		// We do this via mutexes (Locks)
		Superman superman = Superman.getInstance();
//		while (true) {
			// Lock Superman so that until he's done saving, he's occupied
			// Everything in the synchronized block is atomic
			System.out.println(name + " needs saving!");
			synchronized (superman) { // Locks Superman so that no one can use it
				// Superman is helping
				System.out.println(name + " is being saved by Superman!");
				// I want to wait 3 seconds to emulate the saving process
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(name + " was saved by Superman!");
				try {
					Thread.sleep(2000); // Simulate Superman flying off
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
//			}
		} // Exiting this relinquishes the lock on superman so that other threads use him
	}
	
	public static void main(String[] args) {
		// Look to use threading for each of these citizens
		// So that they all operate individually
		
		// You can make a thread by having a class extend Thread
		// OR implement Runnable
		EndangeredCitizen c1 = new EndangeredCitizen("Fred");
		EndangeredCitizen c2 = new EndangeredCitizen("Velma");
		EndangeredCitizen c3 = new EndangeredCitizen("Shaggy");
		
		// We need a thread object to start
		// These threads are in the NEW state (AKA created, but not yet started)
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		Thread t3 = new Thread(c3);
		
		t1.start(); // Calls run() of the Runnable object (c1)
//		System.out.println("Thread 1 Started!");
		t2.start();
		t3.start();
		
		try {
			// Main thread waits for other threads
			t1.join(1000); // I will wait for the thread one finish before continuing
			System.out.println("I give up on waiting for thread 1");
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Main Thread finished!");
	}

}
