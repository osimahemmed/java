package com.oracle.xml;

public class StringBuf {

	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("osim");
		StringBuffer sb1 = new StringBuffer("osim");
		if(sb.equals(sb1)){
			System.out.println("Equal");
		}else{
			System.out.println("not equal");
		}
		

	}

}
