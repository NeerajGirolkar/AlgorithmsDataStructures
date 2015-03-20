package com.neeraj.algorithms.sort.test;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.neeraj.algorithms.sort.SelectionSort;
import com.neeraj.util.Utilities;

public class SelectionSortTest {
	private int[] unsorted;
	private static final int NUMBER_OF_INPUTS = 10;
	
	@Before
	public void init(){
		unsorted = Utilities.generatePositiveNegativeIntRandoms(NUMBER_OF_INPUTS);
	}
	
	@Test
	public void testSelectionSort(){
		SelectionSort selection = new SelectionSort();
		System.out.println("Unsorted Array: " + Arrays.toString(unsorted));
		int[] sorted = selection.sort(unsorted);
		System.out.println("Sorted Array: " + Arrays.toString(sorted));
	}
}
