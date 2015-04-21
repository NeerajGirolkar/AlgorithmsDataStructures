package com.neeraj.datastructures.stack;

import java.util.NoSuchElementException;

public class ArrayBasedStack implements Stack {
	private Object[] array;
	private int size;
	
	public ArrayBasedStack(int capacity) {
		array = new Object[capacity];
	}

	@Override
	public void push(Object item) {
		if(array.length == size) {
			throw new IllegalStateException("Stack Overflow!");
		}
		array[size++] = item;
	}

	@Override
	public Object pop() {
		if(size == 0) {
			throw new NoSuchElementException("No items present in stack");
		}
		Object obj = array[size - 1];
		array[--size] = null;
		return obj;
	}

	@Override
	public Object peek() {
		if(array.length == 0) {
			throw new NoSuchElementException("No items present in stack");
		}
		return array[size - 1];
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return array.length == 0;
	}
}
