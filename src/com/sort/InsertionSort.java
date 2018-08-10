package com.sort;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] arr1 = {10,34,2,56,7,67,88,42};
		
		int[] arr2 = insertionSort(arr1);
		for(int i: arr2) {
			System.out.println(i);
		}

	}
	private static int[] insertionSort(int [] input) {
		
		for(int i = 1; i < input.length; i++) {
			for(int j = i; j > 0; j--) {
				if(input[j] < input[j-1]) {
					int temp = input[j];
					input[j] = input[j-1]; 
					input[j-1] = temp;
				}
			}
		}		
		return input;
	}
	
	/*private static int[] sortInsert(int[] input) {//5,2,1,0,7
		for(int i = 1; i < input.length; i++) {
			for(int j = i; j > 0; j--) {
				if(input[j] < input[j-1]) {
					int temp = input[j];
					input[j] = input[j-1];
					input[j-1] = temp;
				}
			}
		}
		
		return input;
	}*/
}