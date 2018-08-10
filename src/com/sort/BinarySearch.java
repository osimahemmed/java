package com.sort;

import java.util.Collections;
import java.util.HashMap;

public class BinarySearch {

	private int binarySearch(int[] inputArr, int key) {
		int start = 0;
		int end = inputArr.length - 1;
		while(start <= end) {
			int mid =(end + start)/2;
			if(key == inputArr[mid]) {
				return mid;
			} if (key < inputArr[mid]) {
				end = mid -1;
			} else {
				start = mid +1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		Collections.synchronizedMap(new HashMap<String, String>());
		final int[] arr = {2, 4, 6, 8, 10, 12, 14, 16,20};
		final BinarySearch bs = new BinarySearch();
		System.out.println("Key 10's position: "+bs.binarySearch(arr, 10));

	}

}
