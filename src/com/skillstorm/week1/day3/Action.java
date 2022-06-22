package com.skillstorm.week1.day3;

/*
 * FunctionalInterfaces are interfaces with EXACTLY one abstract method
 * 
 * If an interface is a functional interface, we can use lambdas with it
 * Lambdas allow us just to define the function itself, but it's type is still the interface
 * 
 * @FunctionalInterface annotation is similar to @Override in that it's just a compiler
 * guarantee that the interface IS a functional interface
 */
@FunctionalInterface
public interface Action<T> {

	void act(T item);
	
	public static void performSomeAction(Action<Integer> action, int num) {
		action.act(num);
	}
	
	public static void main(String[] args) {
		
		DoSomething<Integer> something = new DoSomething<>();
		performSomeAction(something, 10);
		performSomeAction((num) -> System.out.println(num * 2), 20);
		
		// Anonymous Class
//		Action a = new Action() {
//
//			@Override
//			public void act(Object item) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//		};
	}
}

class DoSomething<T> implements Action<T> {

	@Override
	public void act(T item) {
		System.out.println(item);
	}
	
}