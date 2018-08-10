package com.program.practice;

public class SquareRoot {

	public static void main(String[] args) {
		float ft = compute(11);
		System.out.println(ft);
	}

	public static float compute(float Number) {
		float temp = Number / 2;

		while (true) {
			float sqrRoot = temp - (temp * temp - Number) / (2 * temp);
			float value = Math.abs(temp - sqrRoot);

			if (value < 0.0001)
				return sqrRoot;
			else
				temp = sqrRoot;
		}
	}

}
