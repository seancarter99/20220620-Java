package com.skillstorm.week1.day4;

public interface Superhero {

	void activateSuperpower();
	
	void stateName();
	
	public static void main(String[] args) {
		SuperheroFactory factory = new SuperheroFactory();
		Superhero supe = factory.createSuperHero("green_lantern");
		supe.activateSuperpower();
		supe.stateName();
		
		System.out.println(SuperheroFactory.AnotherClass.x);
	}
}

class Batman implements Superhero {

	@Override
	public void activateSuperpower() {
		System.out.println("I'm rich");
	}

	@Override
	public void stateName() {
		System.out.println("I'm Batman");
	}
	
}

@Deprecated
class GreenLantern implements Superhero {

	@Override
	public void activateSuperpower() {
		System.out.println("My will is unbreakable");
	}

	@Override
	public void stateName() {
		System.out.println("My name is Hal Jordan");
	}
	
}

class GreenLantern2 implements Superhero {

	@Override
	public void activateSuperpower() {
		System.out.println("I'm charismatic");
	}

	@Override
	public void stateName() {
		System.out.println("My name is Ryan Reynolds");
	}
	
	
}