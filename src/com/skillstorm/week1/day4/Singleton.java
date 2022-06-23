package com.skillstorm.week1.day4;

public class Singleton {

	// Having some control over a global entity
	// When I want ONLY one copy of something to exist, I should look to use Singleton
	
	// Very useful with threading, since all threads will access the same data
	// You just need to take extra precautions when state is involved
	
	// Eagerly creating the instance (as soon as possible)
	private static Singleton instance;
	
	private int count = 0; // stateful
	
	private Singleton() {
		
	}
	
	public void increment() {
		this.count++;
	}
	
	public void decrement() {
		this.count--;
	}
	
	public int getCount() {
		return this.count;
	}
	
	// For private fields, we need public getters to retrieve that value
	public static Singleton getInstance() {
		// Lazily initialized instance
		if (instance == null) {
			instance = new Singleton(); // Gets created upon the first request for the object
		}
		return instance; // Yield the instance we created
	}
}
