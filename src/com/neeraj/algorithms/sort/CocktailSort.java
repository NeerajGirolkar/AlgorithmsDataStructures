package com.neeraj.algorithms.sort;

public class CocktailSort {
	public int[] sort(int[] numbers){
		int length = numbers.length;
		boolean sorted;
		do{
			sorted = false;
			for(int i = 0; i <= length - 2; i++){
				if(numbers[i] > numbers[i + 1]){
					int temp = numbers[i];
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = temp;
					sorted = true;
				}
			}
			if(!sorted){
				break;
			}
			sorted = false;
			for(int i = length - 2; i >= 0; i--){
				if(numbers[i] > numbers[i + 1]){
					int temp = numbers[i];
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = temp;
					sorted = true;
				}
			}
		} while(sorted);
		return numbers;
	}
}