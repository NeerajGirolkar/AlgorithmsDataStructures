package com.neeraj.algorithms.sort;

public class SelectionSort {
	public int[] sort(int[] numbers){
		int length = numbers.length;
		for(int i = 0; i <= length - 1; i++){
			int index = i;
			for(int j = i + 1; j <= length - 1; j++){
				if(numbers[j] < numbers[index]){
					index = j;
				}
			}
			int minNumber = numbers[index];
			numbers[index] = numbers[i];
			numbers[i] = minNumber;
		}
		return numbers;
	}
}