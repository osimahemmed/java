package com.program.practice;

public class _31_WalkingRobot {

	public static void main(String[] args) {
		String move = "UDDLRL";
		int[] intialPos = {0,0};
		int[] a = getFinalCoordinates(move, intialPos);
		System.out.println(a[0] + " " +a[1]);
	}

	private static int[] getFinalCoordinates(String move, int[] initialPosition) {

		for (int i = 0; i < move.length(); i++) {
			String ch = String.valueOf(move.charAt(i));
			switch (ch) {
			case "U":
				initialPosition[1] += 1;
				break;
			case "D":
				initialPosition[1] -= 1;
				break;
			case "L":
				initialPosition[0] -= 1;
				break;
			case "R":
				initialPosition[0] += 1;
				break;
			}
		}
		return initialPosition;
	}

}
