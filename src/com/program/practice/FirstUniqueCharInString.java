//First unique character of a string. E.g. aabdcce . Output : b
package com.program.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharInString {

	public static void main(String[] args) {
		char ch = getFirstUniqueChar("aabdcce");//aabdcce
		System.out.println(ch);

	}

	private static Character getFirstUniqueChar(String str) {
		Map<Character, Integer> map = new LinkedHashMap<>();
		for(int i = 0; i < str.length(); i++) {
			char key = str.charAt(i);
			if(map.containsKey(key)) {
				map.put(key, map.get(key)+1);
			} else {
				map.put(key, 1);
			}
		}
		for(Character ch : map.keySet()) {
			if(map.get(ch) == 1) {
				return ch;
			}
		}
		/*Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char key = str.charAt(i);
			if (map.containsKey(key)) {
				map.put(key, map.get(key) + 1);
			} else {
				map.put(key, 1);
			}
			
		}

		for (Character c : map.keySet()) {
			if (map.get(c) == 1) {
				return c;
			}
		}*/
		return null;
	}

}
