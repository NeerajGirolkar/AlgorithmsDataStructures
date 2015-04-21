package com.neeraj.datastructures.stack;

public interface Stack {

	public void push(Object item);
	
	public Object pop();
	
	public Object peek();
	
	public int size();
	
	public boolean isEmpty();
	
}