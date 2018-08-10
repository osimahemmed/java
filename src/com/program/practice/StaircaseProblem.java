package com.program.practice;

public class StaircaseProblem {

	public static void main(String args[]) {
		int step = 4;
		System.out.println("Number of ways = " + countWays(step));
	}

	private static int countWays(int step) {
		return fib(step + 1);
	}

	private static int fib(int n) {
		if (n <= 1)
			return n;
		return fib(n - 1) + fib(n - 2);
	}
}
