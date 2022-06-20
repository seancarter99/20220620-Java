package com.skillstorm.week1.day1;

// Classes are blueprints for creating objects
// Classes outline the behaviors and properties of a real world object
// Objects are specific "instances" of our classes

/*
 * 4 Pillars of OOP
 * 
 * 1. Encapsulation
 *    - The process of data hiding in order to protect certain values. Typically via getters/setters
 * 2. Inheritance
 *    - Creating child classes that inherit the properties of parent classes. Helps for code reuse
 */

// If not extends keyword is found on a class, the class will extend Object
// As such, EVERYTHING in Java is an Object
public class Dog extends Object { // unnecessary extends, but it works

	/*
	 * Access modifiers
	 * 
	 * public - Accessible ANYWHERE
	 * private - Accessible only within the class definition itself
	 * protected - Accessible anywhere within the same package OR any class that inherits from another
	 * default (package private) - Accessible anywhere within the same package
	 * 
	 * Least access -------------- Most access
	 * private -> default -> protected -> public
	 */
	
	// To fully encapsulate a class, standard convention says to make the field private and create a public getter/setter
	
	private String name;
	private short age; // A dog has an age property of type short
	private String owner;
	private String breed;
	private static int dogPopulation;
	
	// Add a static, readonly method so that it's available for all dogs and can't be changed
	// Constant variables should be public static final in Java
	// Final on a variable means that once a value is assigned, it cannot be reassigned a new value
	public final static String SCIENTIFIC_NAME = "Canis lupus familiaris";
	
	// Static properties are shared between ALL dog objects
	// Static does NOT belong to the object, but rather the class
	
	// If I don't a constructor for a class, Java will provide one for me
	// This is known as a "default constructor". It takes no arguments
	Dog() { // This is essentially a "default constructor" IN EVERYTHING BUT NAME
		dogPopulation++;
	}
	
	// Defining my own constructor
	// Constructors are good for initializing values when creating an object
	Dog(String name, short age, String owner, String breed) {
		// Use this keyword to assign properties to the dog
		// this refers to the dog that I just created
		this.name = name;
		this.age = age;
		this.owner = owner;
		this.breed = breed;
		dogPopulation++;
	}
	
	// Overloaded constructor without breed as a parameter
	Dog(String name, short age, String owner) {
		super(); // Calls Object's no arg constructor
		this.name = name;
		this.age = age;
		this.owner = owner;
		dogPopulation++;
	}
	
	// Syntax for getter: get + the variable name with the first letter capitalized
	// public, returns a String, no parameters for this method
	public String getName() {
		return this.name; // Return the name of the dog
	}
	
	// Syntax for setter: set + the variable name with the first letter capitalized
	// public, void, setName, parameter will be a String representing the new dog name
	public void setName(String newName) { // Changes the name of a given dog
		// I want to prevent an empty string being set to my dog's name
		if (newName != "") { // if newName is NOT equal to an empty string
			// If the boolean condition is true, execute the code in the curly braces
			this.name = newName; // Only change the name, if the name is not empty
		}
	}
	
	public short getAge() {
		return age;
	}

	public void setAge(short age) {
		this.age = age;
	}

	public String getOwner() {
		return owner;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public static int getDogPopulation() {
		return dogPopulation;
	}

	public static void setDogPopulation(int dogPopulation) {
		Dog.dogPopulation = dogPopulation;
	}
	
	public void speak() {
		System.out.println("Bark! (My name is " + this.name + ")");
	}

	public static void main(String[] args) {
		System.out.println("Total Dog Population before dog creation: " + dogPopulation);
		Dog levi = new Dog("Levi", (short) 1, "Sean"); // invokes the Dog constructor of String, short, String
		System.out.println(levi.name);
		Dog lucy = new Dog("Lucy", (short) 7, "Sean");
		System.out.println("Lucy Name: " + lucy.name);
		System.out.println("Levi Name: " + levi.name);
		
		System.out.println("Total Dog Population after dog creation: " + dogPopulation);
		
//		Dog.SCIENTIFIC_NAME = "hacker"; // Can't change due to final
		System.out.println(Dog.SCIENTIFIC_NAME);
		
		levi.speak();
		lucy.speak();
		
	}
}
