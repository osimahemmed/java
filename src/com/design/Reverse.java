package com.design;

public class Reverse {

	public static void main(String[] args) {
		
		boolean test = checkSting("osim","miso");
		System.out.println("isSame " + test);
	}
	
	static boolean checkSting(String s1, String s2){
		StringBuffer bf = new StringBuffer();
		for(int i=s1.length()-1;i>=0;i--){
			bf.append(s1.charAt(i));
		}
		if(s2.equals(bf.toString())){
			return true;
		}
			return false;
		
	}

}
