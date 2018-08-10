//Given Input,print the following input: “SSSSSTTPPQ”  Output: “5S2T2P1Q”.

package com.program.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class CompressString {

	public static void main(String[] args) {
		
		String str = printCountOfChars("SSSSSTTPPQ"); 
		System.out.println(str);

	}

	private static String printCountOfChars(String input) {
		String patternPrint = "";
		Map<String, Integer> map = new LinkedHashMap<>();
		for(int i = 0; i < input.length(); i++) {
			String key = String.valueOf(input.charAt(i));
			if(map.containsKey(key)) {
				map.put(key, map.get(key)+1);
			} else {
				map.put(key, 1);
			}
		}
		for(String strKey : map.keySet()) {
			patternPrint = patternPrint + map.get(strKey) + strKey;
		}
		
		return patternPrint;
		/*String patternToPrint = "";
		Map<String, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < input.length(); i++) {
			String key = String.valueOf(input.charAt(i));

			if (map.containsKey(key)) {
				int value = map.get(key);
				map.put(key, value + 1);
			} else {
				map.put(key, 1);
			}
		}

		for (String eachKey : map.keySet()) {
			patternToPrint += map.get(eachKey) + eachKey;
		}*/
		//return patternToPrint;
	}

}
