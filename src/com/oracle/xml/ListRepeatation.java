package com.oracle.xml;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListRepeatation {
	
	public static void main(String args[]){
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(8);
		list.add(9);
		
		showRepeatation(list.toArray());
		
	}
	
	private static void showRepeatation(Object[] array){
		
		Arrays.sort(array);
		
		Object oldValue = null;
		Object newValue = null;
		
		for (int j=0; j< array.length; j++) {
			int cnt = 0;
				
			for (int k=j; k< array.length-1; k++){
				if(j == 0 || oldValue != array[j]) {
					if(array[j] == array[k+1]){
						cnt++;
					}
				}
				
			}
			newValue = oldValue;
			oldValue = array[j];
						
			if(j == 0 || oldValue != newValue){
				System.out.println("number "+array[j] + " repeated  "+cnt+ " times");
			}
			
		}
		
	}

}
