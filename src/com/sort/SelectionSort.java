package com.sort;

/*
 * The selection sort algorithm sorts an array by repeatedly finding the minimum element 
 * (considering ascending order) 
 * from unsorted part and putting it at the beginning
 */

public class SelectionSort {

	public static void main(String[] args) {
		//int[] arr = {0,1,10,4,7,3};
		
		int[] arr1 = {10,34,2,56,7,67,88,42};
		
		int arr2 [] = selectionSort(arr1);
		for(int m = 0; m < arr2.length; m++) {
			System.out.println(arr2[m]);
		}

	}
	
	public static int [] sort(int arr[])
    {
        int n = arr.length;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = min_idx+1; j < n; j++) { //{0,1,10,4,7,3}
            	if (arr[j] < arr[min_idx]) {
            		min_idx = j;
            	}    
            }
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        
        return arr;
    }
	private static int[] selectionSort(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n-1; i++) {
			int min_idx = i;
			for(int j = min_idx+1; j < n; j++) {//0,3,4,1,2
				if(arr[j] < arr[min_idx]) {
					min_idx = j;
				}
			}
			
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}
}
