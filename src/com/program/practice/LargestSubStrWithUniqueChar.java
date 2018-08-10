
//Largest substring with unique characters e.g. aaabcbdeaf Output : cbdeaf//not working
package com.program.practice;

import java.util.HashMap;
import java.util.Map;

public class LargestSubStrWithUniqueChar {

	public static void main(String[] args) {
		String str = lengthOfLongestSubstring("GEEKSFORGEEKS");//aaabcbdeaf//EKSFORG
		System.out.println(str);
	}


	public static String lengthOfLongestSubstring(String str) {
		//String longestOverall = "";
		String currLongest = "";
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (map.containsKey(c)) {
				i = map.get(c);
				/*if (currLongest.length() > longestOverall.length()) {
					longestOverall = currLongest;
				}*/
				map.clear();
				currLongest = "";
			} else {
				currLongest += c;
				map.put(c, i);
			}
		}
		System.out.println("length " + currLongest.length());
		return currLongest;//longestOverall;
	}
}
