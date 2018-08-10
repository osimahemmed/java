package com.program.practice;

import java.math.BigInteger;

public class StringToAscii {

	public static void main(String[] args) {
		
		String str = "abc";
		StringBuilder sb = new StringBuilder();
		for(char c : str.toCharArray()) {
			sb.append((int)c);
		}
		BigInteger mInt = new BigInteger(sb.toString());
		System.out.println(mInt);
	}

}