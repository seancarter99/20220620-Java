package com.skillstorm.week1.day3;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//public class MyLinkedList<T> implements List<T> {
//
//	Node<T> head;
//	Node<T> tail;
//	int currSize;
//	
//	@Override
//	public int size() {
//		// TODO Auto-generated method stub
//		return currSize;
//	}
//	@Override
//	public boolean isEmpty() {
//		// TODO Auto-generated method stub
//		return false;
//	}
//	@Override
//	public boolean contains(Object o) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//	@Override
//	public Iterator<T> iterator() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public Object[] toArray() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public <T> T[] toArray(T[] a) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public boolean add(T e) {
//		if (tail == null) {
//			Node<T> node = new Node<>(e);
//			tail = node;
//			if (head == null) {
//				head = node;
//			}
//		} else {
//			Node<T> newTail = new Node<>(e);
//			tail.setNext(newTail);
//			tail = newTail;
//		}
//		currSize++;
//		return false;
//	}
//	@Override
//	public String toString() {
//		return "MyLinkedList [head=" + head + ", tail=" + tail + ", currSize=" + currSize + "]";
//	}
//	@Override
//	public boolean remove(Object o) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//	@Override
//	public boolean containsAll(Collection<?> c) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//	@Override
//	public boolean addAll(Collection<? extends T> c) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//	@Override
//	public boolean addAll(int index, Collection<? extends T> c) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//	@Override
//	public boolean removeAll(Collection<?> c) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//	@Override
//	public boolean retainAll(Collection<?> c) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//	@Override
//	public void clear() {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public T get(int index) {
//		if (index > currSize) {
//			throw new IllegalArgumentException("Cannot access element beyond the size of the linked list");
//		}
//	}
//	@Override
//	public T set(int index, T element) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public void add(int index, T element) {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public T remove(int index) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public int indexOf(Object o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	@Override
//	public int lastIndexOf(Object o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	@Override
//	public ListIterator<T> listIterator() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public ListIterator<T> listIterator(int index) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public List<T> subList(int fromIndex, int toIndex) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
//	public static void main(String[] args) {
//		MyLinkedList<Integer> mll = new MyLinkedList<>();
//		mll.add(1);
//		System.out.println(mll);
//	}
//	
//}
//
//class Node<T> {
//	private T value;
//	private Node<T> next;
//	private Node<T> prev;
//	
//	public Node() {
//		
//	}
//	
//	public Node(T value) {
//		this.value = value;
//	}
//	
//	public Node(T value, Node<T> next, Node<T> prev) {
//		this.value = value;
//		this.next = next;
//		this.prev = prev;
//	}
//
//	public T getValue() {
//		return value;
//	}
//
//	public void setValue(T value) {
//		this.value = value;
//	}
//
//	public Node<T> getNext() {
//		return next;
//	}
//
//	public void setNext(Node<T> next) {
//		this.next = next;
//	}
//
//	public Node<T> getPrev() {
//		return prev;
//	}
//
//	public void setPrev(Node<T> prev) {
//		this.prev = prev;
//	}
//
//	@Override
//	public String toString() {
//		return "Node [value=" + value + ", next=" + next + ", prev=" + prev + "]";
//	}
//	
//	
//}