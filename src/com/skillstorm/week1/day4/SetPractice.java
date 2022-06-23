package com.skillstorm.week1.day4;

import java.util.HashSet;
import java.util.TreeMap;

public class SetPractice {

	public static void main(String[] args) {
		// Sets are a culmination of items that contain no duplicates
		
		// HashSet
		
		/*
		 * Ordered Collection:
		 * - Collections that have order (could be insertion order)
		 * - Stack, Queue, List
		 * 
		 * Sorted Collection:
		 * - Ordered collection, but the items are sorted upon entry
		 * 
		 * Unordered Collection:
		 * - There's no order, elements are just added
		 */
		
		
		// Hashing
		// Hashing provides for "O(1)" lookup times
		// Not actually O(1), but it's pretty close to it
		
		HashSet<Vehicle> vehicleSet = new HashSet<>();
		// make, model, year, color
		Vehicle vehicle1 = new Vehicle("Telsa", "Y", 2022, "Hot Red");
		Vehicle vehicle2 = new Vehicle("Volkswagen", "Jetta", 2016, "White");
		Vehicle vehicle3 = new Vehicle("Porsche", "Taycan", 2022, "Black");
		Vehicle vehicle4 = new Vehicle("Chrysller", "Turbine", 1964, "#B00B69");
		Vehicle vehicle5 = new Vehicle("Chrysller", "Turbine", 1964, "#B00B69");
		
		vehicleSet.add(vehicle1);
		vehicleSet.add(vehicle2);
		vehicleSet.add(vehicle3);
		vehicleSet.add(vehicle4);
//		vehicleSet.add(vehicle5);
		System.out.println(vehicleSet.size());
		
//		vehicleSet
		
		System.out.println(vehicleSet.contains(vehicle5));
		
		vehicleSet.remove(vehicle5);
		
		System.out.println(vehicleSet.size());
		
	}

}
