package com.skillstorm.week1.day3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;

import com.skillstorm.week1.day2.Circle;
import com.skillstorm.week1.day2.IceCream;
import com.skillstorm.week1.day2.Shape;

public class ListPractice {
	
	public static void main(String[] args) {
		
		int[] nums = {7, 1, 23, -23, 0};
//		nums[5] = 100;
		
		/*
		 * ArrayLists are a wrapper around arrays and they allow for easier resizing
		 * 
		 * Under the hood, they use generics to allow any non-primitive and they
		 * possess a generic array T[] to store our data
		 * 
		 * But it also contains methods that help it behave like a list
		 * A list is just a list of items (similar to an array)
		 * 
		 * If the array is at max capacity and we attempt to add a new item,
		 * ArrayList will automatically create the new array that is 50% larger in size
		 * and copy all the old items to the new
		 */
		
		int[] numsCopy = new int[10];
		for (int i = 0; i < nums.length; i++) {
			numsCopy[i] = nums[i];
		}
		nums = null;
		System.gc();
		
		List<Integer> listNums = new LinkedList<>();
		listNums.add(1);
//		listNums.remove();
		/*
		 * Collections API
		 * 
		 * List interface provides us the ability to perform list operations such as
		 * 
		 * add(Object o) - add an item
		 * add(Object o, int index) - add item at an index
		 * remove(Object o)
		 * indexOf(Object o) - Returns index of the first given object that matches
		 * isEmpty() - Returns true if the list is empty, false otherwise
		 */
		
		GroceryList<Shape> shapeGroceryList = new GroceryList<>();
		shapeGroceryList.add(new Circle());
		
		/*
		 * ArrayList vs LinkedList
		 * 
		 * ArrayList Pros:
		 * - O(1) Access times for both read and write
		 * - Takes up less memory than an LinkedList (Not by much)
		 * 
		 * ArrayList Cons:
		 * - You need to know the index of the item, if you don't lookup is O(n)
		 * - Adding to the front is O(n)
		 * - Adding to the back can be constant time, but if a resize is needed, that's O(n)
		 * - Resizing can result in a lot of dead space
		 *   - If do your planning, you can avoid this
		 * 
		 * LinkedList Pros:
		 * - Adding to the front is O(1)
		 * - Adding to the back is O(1) (In a doubly linked list (both head and tail))
		 * - LinkedList is more "memory efficient" due to being non-contiguous
		 * - Inserting or removing items to the middle is much quicker than an ArrayList 
		 * 
		 * LinkedList Cons:
		 * - Reading/Writing to anywhere that's not the head or the tail
		 * - Accessing a specific index is O(n/2)
		 * - Accessing a specific item is O(n)
		 * 
		 * 
		 * When to use ArrayList:
		 * - Whenever you know the size you're working with
		 * - And the elements don't get reordered often
		 * - If I am often reading to a list, ArrayList is great
		 * 
		 * When to use LinkedList:
		 * - Whenever you're not using an ArrayList, but you need a List
		 */
	}

}


class GroceryList<E> implements List<E> {

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E set(int index, E element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, E element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
	
}