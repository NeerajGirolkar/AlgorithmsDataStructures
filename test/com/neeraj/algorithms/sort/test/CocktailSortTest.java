package com.neeraj.algorithms.sort.test;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.neeraj.algorithms.sort.CocktailSort;
import com.neeraj.util.Utilities;

public class CocktailSortTest {
	private int[] unsorted;
	private static final int NUMBER_OF_INPUTS = 10;
	
	@Before
	public void init(){
		unsorted = Utilities.generatePositiveNegativeIntRandoms(NUMBER_OF_INPUTS);
	}
	
	@Test
	public void testCocktailSort(){
		CocktailSort cocktail = new CocktailSort();
		System.out.println("Unsorted Array: " + Arrays.toString(unsorted));
		int[] sorted = cocktail.sort(unsorted);
		System.out.println("Sorted Array: " + Arrays.toString(sorted));
	}
}
