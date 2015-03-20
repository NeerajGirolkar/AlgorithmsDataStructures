package com.neeraj.datastructures.lists;

import java.util.Arrays;
import java.util.logging.Logger;

public class ArrayList {
	public static final Logger LOGGER = Logger.getLogger(ArrayList.class.getName());
	public static final int INITIAL_CAPACITY = 10;
	private int[] container;
	private int currentIndex;
	private int currentCapacity;
	
	public ArrayList(){
		LOGGER.info("Initializing ArrayList...");
		this.container = new int[INITIAL_CAPACITY];
		this.currentCapacity = INITIAL_CAPACITY;
		this.currentIndex = 0;
		LOGGER.info("Initial capacity of ArrayList is: " + currentCapacity);
	}
	
	public String print(){
		return Arrays.toString(container);
	}
	
	public void resizeArrayList(){
		LOGGER.info("Resizing ArrayList...");
		LOGGER.info("Old capacity of ArrayList is: " + currentCapacity);

		int[] tempArray = container;
		
		currentCapacity = currentCapacity * 2;
		container = new int[currentCapacity];
		
		int oldLength = tempArray.length;
		for(int i = 0; i <= oldLength - 1; i++){
			container[i] = tempArray[i];
		}
		tempArray = null;
		LOGGER.info("New capacity of ArrayList is: " + currentCapacity);
	}
	
	public boolean contains(int num){
		for(int element : container){
			if(element == num){
				return true;
			}
		}
		return false;
	}
	
	public int size(){
		return currentIndex;
	}
	
	public void ensureCapacity(){
		if(currentIndex == currentCapacity){
			LOGGER.info("Maximum capacity of ArrayList reached");
			resizeArrayList();
		}
	}
	
	public void add(int num){
		ensureCapacity();
		if(!contains(num)){
			LOGGER.info("Adding " + num + " to ArrayList...");
			container[currentIndex] = num;
			currentIndex++;
		}
	}
	
	public void add(int index, int num){
		if(index == currentIndex + 1){
			add(num);
		}
		if(index <= currentIndex){
			ensureCapacity();
			if(!contains(num)){
				LOGGER.info("Adding " + num + " to ArrayList...");
				int i = size();
				while(i >= index){
					container[i + 1] = container[i];
					i--;
				}
				container[index] = num;
				currentIndex++;
			}
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}
}