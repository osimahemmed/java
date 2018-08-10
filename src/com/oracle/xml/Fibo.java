package com.oracle.xml;

import java.util.ArrayList;

public class Fibo {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = fibon(10);
		for(int i=0;i<list1.size();i++){
			System.out.println(list1.get(i));
		}

	}
	public static ArrayList<Integer> fibon(int n){
		int prev =-1;
		int res = 1;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			int sum =prev+res;
			prev = res;
			res = sum;
			list.add(res);
			
		}
		return list;
	}

}
