/*
 * **************************Power Of Ten 10 ****************************************           
22) find number whether given no. is power of 10 or not. Example: 100(10^2), 1000 (10^3), 0.1 (10^-1), 0.01(10^-2)
 */

package com.program.practice;

public class PowerOfTen {

	public static void main(String[] args) {
		// Check if x is a power of 10
		double x = 0.1;
		int y = 10;
		System.out.println(+x + " is power of " + y + ": " + isPower(x, y));
	}

	private static boolean isPower(double x, int y) {
		double n = y;
		if (x == 1)
			return true;

		else if (x < 1) {
			while (n > x)
				n /= y;
		} else {
			while (n < x)
				n *= y;
		}
		return n == x;
	}

}
