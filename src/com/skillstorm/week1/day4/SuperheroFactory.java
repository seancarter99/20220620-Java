package com.skillstorm.week1.day4;

// Factory Design pattern is a way to manage the creation of objects
// Instead of say new Whatever() everywhere in the codebase, you instead leverage the factory

// Factory design pattern allows for decoupling so that I can get back a Superhero, but it doesn't
// matter which one I get back
public class SuperheroFactory {

	static class AnotherClass {
		static int x = 10;
	}
	
	public static Superhero createSuperHero() {
		return new GreenLantern2(); // Create the default hero
	}
	
	public static Superhero createSuperHero(String name) {
		if (name == null) {
			return createSuperHero(); // Prevents me from changing in two places at once
		}
		
		// Based on the name, match the case
		switch(name.toUpperCase()) {
			case "SUPERMAN":
				return Superman.getInstance();
			case "BATMAN":
				return new Batman();
			case "GREENLANTERN":
			case "GREEN LANTERN":
			case "GREEN_LANTERN":
				return new GreenLantern2();
			default: // else statement, no matches found
				return createSuperHero();
		}
	}
	
	
	public static void main(String[] args) {
		Superhero supe = createSuperHero("green_lantern");
		supe.activateSuperpower();
		supe.stateName();
		
		System.out.println(SuperheroFactory.AnotherClass.x);
	}
}
