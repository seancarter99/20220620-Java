package com.skillstorm.week1.day4;

public class SingletonDriver {

	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		Singleton anotherInstance = Singleton.getInstance();
		
		instance.increment();
		System.out.println(anotherInstance.getCount());
		
		System.out.println(instance);
		System.out.println(anotherInstance);
		System.out.println(instance == anotherInstance); // true because they're the same address
	}

}
