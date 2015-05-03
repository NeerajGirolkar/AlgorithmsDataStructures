package com.neeraj.datastructures.stack;

import java.util.NoSuchElementException;

/**
 * @author Neeraj
 * 
 * Complexity of stack implemented using fixed size array:
 * 		- push()	O(1)
 * 		- pop()		O(1)
 * 		- peek()	O(1)
 * 		- search()	O(n)
 *
 */
public class ArrayBasedStack implements Stack {
	private Object[] array;
	private int size;
	
	/* Constructor - Initialize a new array with fixed capacity */
	public ArrayBasedStack(int capacity) {
		array = new Object[capacity];
	}

	
	/* 1) Check if the array is full. If full, then throw stack overflow.
	   2) If not full, then add the element to the TOS */
	@Override
	public void push(Object item) {
		if(array.length == size) {
			throw new IllegalStateException("Stack Overflow!");
		}
		array[size++] = item;
	}

	/* 1) Check if the array is empty. If empty, then throw underflow error.
	   2) If not, then remove and return the element at TOS.
	   3) Make the current index of array point to NULL */
	@Override
	public Object pop() {
		if(size == 0) {
			throw new NoSuchElementException("Stack Underflow!");
		}
		Object obj = array[size - 1];
		array[--size] = null;
		return obj;
	}

	/* 1) Check if the array is empty. If empty, then throw underflow error.
	   2) If not, then remove and return the element at TOS */
	@Override
	public Object peek() {
		if(array.length == 0) {
			throw new NoSuchElementException("Stack Underflow!");
		}
		return array[size - 1];
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}
}
