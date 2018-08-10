package com.program.practice;

public class LongestWordInString {

	public static void main(String[] args) {

		String s = "Today is the happiest day of my life";
		String[] words = s.split(" ");
		String longest = "";
		
		for(int i = 0; i < words.length; i++) {
			if(words[i].length() >= longest.length()) {
				longest = words[i];
			}
		}
		
		System.out.println("Longest word is " + longest);

	}

}
