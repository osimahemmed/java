package com.program.practice;

public class AsciiToIntegerConversion {

	public static void main(String[] args) {
		//int a = Atoi(55);
		int a = Atoi(50);
		System.out.println(a);
		System.out.println(asciiToInt(57));
	}

	private static int Atoi(int asciiValue) {
		int numericValue = -1;
		if (asciiValue >= '0' && asciiValue <= '9') {
			numericValue = asciiValue - '0';
		}
		
		return numericValue;
	}
	
	private static int asciiToInt(int asciiVal) {
		int val = -1;
		if(asciiVal >= '0' && asciiVal <= '9') {
			val = asciiVal - '0';
		}
		return val;
	}

}
