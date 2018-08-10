package com.program.practice;

public class FractionAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private static int[] addFraction(int[] x, int[] y) {
		int numerator = x[0] * y[1] + x[1] * y[0];
		int denominator = x[1] * y[1];

		int gcd = getGCD(numerator, denominator);
		numerator = numerator / gcd;
		denominator = denominator / gcd;

		int[] sum = { numerator, denominator };

		return sum;
	}

	private static int getGCD(int x, int y){
		int min = Math.min(x,y);
		int max = Math.max(x,y);
		int gcd = min;

		while(max%min != 0){
			gcd = max%min;
			max = min;
			min = gcd;
		}
		return gcd;
	}
}
