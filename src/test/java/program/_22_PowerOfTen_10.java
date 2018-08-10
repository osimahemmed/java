package com.test.java.program;

public class _22_PowerOfTen_10 {

	public static void main(String[] args) {

		double x = 0.1;
		int y = 10;
		
		System.out.println("1000: " + isPowerOfTen(1000, 10));
		System.out.println("4: " + isPowerOfTen(4, 10));
		System.out.println("0: " + isPowerOfTen(0, 10));
		System.out.println("100: " + isPowerOfTen(100, 10));
		System.out.println("40: " + isPowerOfTen(40, 10));
		System.out.println("0.1: " + isPowerOfTen(0.1, 10));
	}

	private static boolean isPowerOfTen(double value, double pow) {
		double p = pow;
		if (value == 1)
			return true;

		else if (value < 1) {
			while (p > value)		
				p = p / pow;
		} 
		else {
			while (p < value)	
				p = p * pow;
		}
		return p == value;
	}
}
