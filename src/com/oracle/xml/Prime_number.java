package com.oracle.xml;

public class Prime_number {

	public static void main(String[] args) {
		/*
		 * int num =27; int i; for(i=2;i<num;i++){ int n = num%2; if(n==0){
		 * System.out.println("Not a prime no"); break; } } if(i==num){
		 * System.out.println(num +" Prime number"); }
		 */

		// boolean b = isPrimeNumber(9);
		// System.out.println(b);
		boolean b = isPrimeNumber(29);
		System.out.println("is prime " + b);

	}

	private static boolean isPrimeNumber(int number) {

		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	private static boolean isPrimeNum(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
