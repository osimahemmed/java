package com.oracle.xml;

public class Swap1 {

	public static void main(String[] args) {
		
		int num1 = 3;
		int num2 = 8;
		System.out.println("Before swap "+num1 + " "+ num2 + " ");
		
		
		num1 = num1+num2;//11
		num2 = num1-num2;//3
		num1 = num1-num2;//8
		
		
		System.out.println("After Swap "+num1 + " " + num2 + " ");
		
	
	}

}
