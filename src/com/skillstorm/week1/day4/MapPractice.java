package com.skillstorm.week1.day4;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class MapPractice {

	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle("Telsa", "Y", 2022, "Hot Red");
		Vehicle vehicle2 = new Vehicle("Volkswagen", "Jetta", 2016, "White");
		Vehicle vehicle3 = new Vehicle("Porsche", "Taycan", 2022, "Black");
		Vehicle vehicle4 = new Vehicle("Chrysller", "Turbine", 1964, "#B00B69");
		
		// Maps are just key value pairs where the key is used to refer to the value
		// Think of it like a locker combo, the key is combination, the value is the stuff inside
		
		// Lot Number, List<Vehicle>
		HashMap<Integer, List<Vehicle>> vehicleMap = new HashMap<>(); 
		vehicleMap.put(1, new LinkedList<Vehicle>());
		vehicleMap.put(2, new LinkedList<Vehicle>());
		vehicleMap.put(3, new LinkedList<Vehicle>());
		
		//1.  Retrieve the lot
		//2.  Add the car to the lot
		
		List<Vehicle> lot = vehicleMap.get(1);
		lot.add(vehicle1);
		
		System.out.println(vehicleMap.get(2));
		
		// Chaining
		vehicleMap.get(3).add(vehicle3);
		vehicleMap.get(3).add(vehicle2);
		System.out.println(vehicleMap.get(3));
		System.out.println(vehicleMap.get(1));
		
		HashMap<Vehicle, String> vehicleOwnerMap = new HashMap<>();
		vehicleOwnerMap.put(vehicle1, "Steven");
		vehicleOwnerMap.put(vehicle2, "Sean");
		vehicleOwnerMap.put(vehicle3, "Joe");
		vehicleOwnerMap.put(new Vehicle(), "Sean");
		
		System.out.println(vehicleOwnerMap.get(vehicle1));
	}

}
