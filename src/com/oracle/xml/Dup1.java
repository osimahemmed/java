package com.oracle.xml;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Dup1 {
	public static void main(String[] args) {
		HashMap<Character, Integer> h = new HashMap<Character, Integer>();
		//String s = "This is a test that find the most common character";
		String s = "swapanan";
		String unique = new String();
		for (int i = 0; i < s.length(); i++) {
			if (h.containsKey(s.charAt(i))) {
				System.out.println("iam in if");
				h.put(s.charAt(i), (int) h.get(s.charAt(i)) + 1);
			} else {
				h.put(s.charAt(i), 1);
				unique += s.charAt(i);
				System.out.println("iam in else");
			}
		}//for

		Set<Map.Entry<Character, Integer>> freq = h.entrySet();
		Iterator<Map.Entry<Character, Integer>> it = freq.iterator();
		while (it.hasNext()) {
			Map.Entry<Character, Integer> item = it.next();
			System.out.println(item.getKey() + ": " + item.getValue());
		}
	}
}