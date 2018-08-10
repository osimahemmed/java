package com.program.practice;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {

	public static void main(String[] args) {
		
		String str = "aaabcbdeaf";
		int a = lengthOfLongestSubstring(str);//cbdeaf
		System.out.println(a);

	}
	
	public static int lengthOfLongestSubstring(String s) {
	    if(s == null || s.length() == 0){
	        return 0;
	    }
	    int result = 0;
	    int k = 0;
	    Set<Character> set = new HashSet<Character>();
	    for(int i = 0; i < s.length(); i++){
	        char c = s.charAt(i);
	        if(!set.contains(c)){
	            set.add(c);
	            result = Math.max(result, set.size());
	        }else{
	            while(k < i){
	                if(s.charAt(k) == c){
	                    k++;
	                    break;
	                }else{
	                    set.remove(s.charAt(k));
	                    k++;
	                }
	            }
	        }  
	    }
	    
	    System.out.println(set);
	 
	    return result;
	}

}
