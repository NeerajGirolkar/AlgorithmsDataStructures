package com.neeraj.algorithms.sort.test;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.neeraj.algorithms.sort.BubbleSort;
import com.neeraj.util.Utilities;

public class BubbleSortTest {
	private int[] unsorted;
	private static final int NUMBER_OF_INPUTS = 10;
	
	@Before
	public void init(){
		unsorted = Utilities.generateIntRandoms(NUMBER_OF_INPUTS);
	}
	
	@Test
	public void testBubbleSort(){
		BubbleSort bubble = new BubbleSort();
		System.out.println("Unsorted Array: " + Arrays.toString(unsorted));
		int[] sorted = bubble.sort(unsorted);
		System.out.println("Sorted Array: " + Arrays.toString(sorted));
	}
}