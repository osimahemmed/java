package com.program.practice;

public class MaximumOccuringCharInString {

	public static void main(String[] args) {
		
		char ch = getMaxOccuringChar("sample stringg786tgggg");
		System.out.println(ch);
	}

	static final int ASCII_SIZE = 256;
	private static char getMaxOccuringChar(String str) {
		
		int count[] = new int[ASCII_SIZE];
		for(int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
		}
		int max = -1;
		char res = ' ';
		for(int i = 0; i < str.length(); i++) {
			if(max < count[str.charAt(i)]) {
				max = count[str.charAt(i)];
				res = str.charAt(i);
			}
		}
		
		return res;
	}
}
