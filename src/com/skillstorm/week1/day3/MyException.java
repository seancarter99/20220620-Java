package com.skillstorm.week1.day3;

public class MyException extends Exception {

	// This is just by Java when serializing your exception and sending it over the wire
	private static final long serialVersionUID = 8593510886612795719L;

	public MyException() {
		// Creating a default MyException object using Exception's default
		super();
	}
	
	public MyException(String message) {
		super(message); // Exception class knows what to do with this message
	}
	
	// If I wanted my own toString
//	@Override
//	public String toString() {
//		return super.getMessage();
//	} CTL + /
	
	public static void main(String[] args) {
		MyException me = new MyException("Something went wrong");
		System.out.println(me);
	
	}
}
