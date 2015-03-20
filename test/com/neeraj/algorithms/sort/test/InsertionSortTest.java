package com.neeraj.algorithms.sort.test;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.neeraj.algorithms.sort.InsertionSort;
import com.neeraj.util.Utilities;

public class InsertionSortTest {
	private int[] unsorted;
	private static final int NUMBER_OF_INPUTS = 100;
	
	@Before
	public void init(){
		unsorted = Utilities.generatePositiveNegativeIntRandoms(NUMBER_OF_INPUTS);
	}
	
	@Test
	public void testInsertionSort(){
		InsertionSort insertion = new InsertionSort();
		System.out.println("Unsorted Array: " + Arrays.toString(unsorted));
		int[] sorted = insertion.sort(unsorted);
		System.out.println("Sorted Array: " + Arrays.toString(sorted));
	}
}
