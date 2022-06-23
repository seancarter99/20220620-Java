package com.skillstorm.week1.day4;

public class Vehicle {

	private String make;
	private String model;
	private int year;
	private String color;
	private String engineType;
	private int numSeats;
	private int numDoors;
	private int numCupHolders;
	private String vin;
	
	public Vehicle() {
		
	}
	
	public Vehicle(String make, String model, int year, String color) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
	}
	
	public Vehicle(VehicleBuilder builder) {
		this.make = builder.getMake();
		this.model = builder.getModel();
		this.year = builder.getYear();
		this.color = builder.getColor();
	}

	
	// This constructor is awful to call, imagine if it was 5x that size
	// You have to have order be EXACT
	// Builder doesn't require this, you just pick what you need
	public Vehicle(String make, String model, int year, String color, String engineType, int numSeats, int numDoors,
			int numCupHolders, String vin) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
		this.engineType = engineType;
		this.numSeats = numSeats;
		this.numDoors = numDoors;
		this.numCupHolders = numCupHolders;
		this.vin = vin;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", year=" + year + ", color=" + color + "]";
	}

	// Whenever you override hashCode, ALWAYS override equals too
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) // Are the two memory locations equal
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (year != other.year)
			return false;
		return true;
	}
}
