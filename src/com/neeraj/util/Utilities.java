package com.neeraj.util;

import java.util.Random;

public class Utilities {
	
	public static int[] generateIntRandoms(int maxNumber){
		int[] randoms = new int[maxNumber];
		Random randomGenerator = new Random();
		for(int i = 0; i <= maxNumber - 1; i++){
			randoms[i] = randomGenerator.nextInt(maxNumber);
		}
		return randoms;
	}
	
	/**
	 * 1) Random class in Java generates statistically distributed positive random numbers. 
	 * 2) To generate positive & negative numbers in equal proportion, subtract the number 
	 *    that is half of the range of the numbers to generate.
	 */
	public static int[] generatePositiveNegativeIntRandoms(int maxNumber){
		int[] randoms = new int[maxNumber];
		Random randomGenerator = new Random();
		for(int i = 0; i <= maxNumber - 1; i++){
			randoms[i] = randomGenerator.nextInt(maxNumber * 2) - maxNumber;
		}
		return randoms;
	}
}