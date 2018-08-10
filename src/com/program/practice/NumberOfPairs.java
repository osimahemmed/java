package com.program.practice;

import java.util.HashSet;
import java.util.Set;

public class NumberOfPairs {

	public static void main(String[] args) {
		int[] arr = { 14, 4, 7, 3, 5, 7 };

		findPairOfSum(arr, 11);


	}

	private static void findPairOfSum(int[] arr, int sum) {
		Set<Integer> set = new HashSet<Integer>();

		for(int value : arr) {
			int diff = sum - value;
			if(!set.contains(diff)) {
				set.add(diff);
			} else {
				System.out.println("Pair sum: " + value+ " " + diff);
			}
		}

	}

}
