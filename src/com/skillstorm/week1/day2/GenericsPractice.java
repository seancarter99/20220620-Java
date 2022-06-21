package com.skillstorm.week1.day2;

// I can use generics to allow runtime determination of the type
// Generics only allow non-primitives
class MyList<T> { // T stands for Type
	
	T[] arr;
	
	public void print(T item) {
		System.out.println(item);
	}
	
}

class GenericsTwoTypes<K, V> {
	K key;
	V value;
}

public class GenericsPractice {

	public static void main(String[] args) {
		MyList<Shape> list = new MyList<Shape>();
		list.print(new Rectangle());
		list.print(new Circle());
		
		MyList<Integer> intList = new MyList<>();
		
		GenericsTwoTypes<Integer, IceCream> gtt = new GenericsTwoTypes<>();
	}

}
