package com.sort;

/*
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent 
 * elements if they are in wrong order.
 */

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {60,23,45,12,100,7};
		bubbleSort(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	private static void bubbleSort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length-1; j++ ) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
