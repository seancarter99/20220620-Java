package com.skillstorm.week1.day4;

public class VehicleBuilder {
	private String make;
	private String model;
	private int year;
	private String color = "White";
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}
	public String getColor() {
		return color;
	}
	
	public VehicleBuilder make(String make) {
		this.make = make; // Add make to this
		return this; // Return this
		
		// Returning this allows us to chain
	}
	
	public VehicleBuilder model(String model) {
		this.model = model;
		return this;
	}
	
	public VehicleBuilder year(int year) {
		this.year = year;
		return this;
	}
	
	public VehicleBuilder color(String color) {
		this.color = color;
		return this;
	}
	
	public Vehicle build() {
		if (isValid()) {
			return new Vehicle(this);
		}
		throw new IllegalArgumentException("Invalid Vehicle");
	}
	
	// Validator for individual properties
	// Limit null values or empty values
	// Non-negative
	private boolean isValid() {
		if (color == null || color.isEmpty()) {
			return false;
		}
		if (model == null || model.isEmpty()) {
			return false;
		}
		if (year < 0) {
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
//		Vehicle vehicle = new Vehicle("Volkswagen", "Jetta", 2016, "White");
		VehicleBuilder builder = new VehicleBuilder();
		Vehicle vehicle = builder.color("Black").model("Jetta").make("Volkswagen").year(1).build();
//		vehicle.setColor("Blue");
		System.out.println(vehicle);
	}
}
