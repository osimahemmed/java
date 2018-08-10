package com.program.practice;

public class SecondSmallestFromRotatedArr {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6};
		int[] arr2 = {5,6,1,2,3,4};
		int[] arr3 = {3,4,5,6,1,2};
		int secondSmall = getSecondSmallest(arr2);
		System.out.println(secondSmall);
	}

	private static int getSecondSmallest(int[] input) {
		int index = Integer.MIN_VALUE;
		for (int i = 0; i < input.length - 1; i++) {
			if (input[i] > input[i + 1]) {
				index = i + 2;
				break;
			}
		}
		if (index == Integer.MIN_VALUE) {
			index = 1;
		} else if (index >= input.length)
			index = 0;
		return input[index];
	}

}
