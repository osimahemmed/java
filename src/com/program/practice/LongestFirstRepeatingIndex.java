package com.program.practice;

public class LongestFirstRepeatingIndex {

	//Given a String “aabbbbddcc” find the longest first repeating index and its length. 
	//(Input: “aabbbbddcc”  Output: [2,4] 2 is the index and 4 is the length).
	public static void main(String[] args) {
		String str = "aabbbbddcc";
		int[] result = longestRepeatingString(str);
		System.out.println("[" +result[0] + ","+ result[1] +"]");

	}
	
	private static int[] longestRepeatingString(String text) {
		char[] ch = text.toCharArray();
		
		int len = 0;
		int index = 0;
		
		for(int i = 0; i < ch.length; i++) {
			char c = ch[i];
			int count = 0;
			int ind = i;
			while(i < ch.length && c == ch[i]) {
				count ++;
				i++;
			}
			if(count > len) {
				index = ind;
				len = count;
			}
		}
		
		int[] res = {index, len};
		return res;
	}

}
