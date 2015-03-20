package com.neeraj.algorithms.sort;

public class InsertionSort {
	public int[] sort(int[] numbers){
		int length = numbers.length;
		for(int i = 1; i <= length - 1; i++){
			int currentNumber = numbers[i];
			int elementToCompareIndex = i - 1;
			while(elementToCompareIndex >= 0 && numbers[elementToCompareIndex] > currentNumber){
				numbers[elementToCompareIndex + 1] = numbers[elementToCompareIndex];
				elementToCompareIndex--;
			}
			numbers[elementToCompareIndex + 1] = currentNumber;
		}
		return numbers;
	}
}