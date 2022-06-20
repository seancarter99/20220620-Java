package com.skillstorm.week1.day1;

// So since a Golden Retriever IS-A Dog, I should have it inherit from Dog
public class GoldenRetriever extends Dog {
	// Extending a class causes all public and protected properties to be inherited by the new class
	
	// Constructors should "generally" be public
	public GoldenRetriever() {
		super(); // This invokes the no-arg constructor of the parent class
	}
	
	public GoldenRetriever(String name, short age, String owner) {
		// How to a sibling constructor
		// Adding this() prevents a call to super()
		this(name, age, owner, "Golden Retriever"); // Constructor chaining
	}
	
	public GoldenRetriever(String name, short age, String owner, String breed) {
		// How to call a parent constructor
		super(name, age, owner, breed);
	}
	
	// If I want, I can "override" the behavior of a parent method by giving it the same method definition + name
	@Override // Annotation that ensures the method is actually an override. If not, it won't compile
	public void speak() {
		// Another application of super is having a overridden function call its original definition
		super.speak(); // Invoke the Dog version of speak()
		System.out.println("I am a Golden Retriever!");
	}
	
	public static void main(String[] args) {
		GoldenRetriever levi = new GoldenRetriever("Levi", (short) 1, "Sean");
		System.out.println(levi.getBreed()); // CTL + / To comment
		levi.speak();
		Dog dougTheDog = new Dog("Doug", (short) 10, "Sam", "Pitbull");
		dougTheDog.speak();
	}
}