package com.sape.ds;

public class ReverseOfArray {

	public static void main(String[] args) {
		String[] arr = {"osim","bibhas","swapan","sushil","ashish"};
		reverseArr(arr,0,arr.length-1);
		for(String s : arr) {
			System.out.println(s);
		}
	}
	
	private static void reverseArr(String[] arr,int start, int end) {
		String temp;
		if(start >= end) {
			return;
		}
		temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		reverseArr(arr, start+1,end-1);
		
	}
}
