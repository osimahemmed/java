package com.program.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BiggestNumber {

	public static void main(String[] args) {
		int[] num = {1, 34, 3, 98, 9, 76, 45, 4};
		String biggestNum = getBiggestNumber(num);
		System.out.println(" biggestNum is " + biggestNum);
	}

	private static String getBiggestNumber(int[] input) {
		
		List<String> list = new ArrayList<>();
		String number = "";
		for(int num : input) {
			list.add(String.valueOf(num));
		}
		Collections.sort(list, new NumberComparator());
		for(String str : list) {
			number += str;
		}
		return number;
	}
	
	static class NumberComparator implements Comparator<String> {

		@Override
		public int compare(String i1, String i2) {
			String orig = i1+""+i2;
			String reverse = i2+""+i1;
			
			return reverse.compareTo(orig);//998764543431
		}
	}
}
