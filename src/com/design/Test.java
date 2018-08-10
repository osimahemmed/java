package com.design;

import java.sql.Timestamp;
import java.util.Date;

public class Test {
	
	public static void main(String args[]){
		String str = "osim";
		String str1 ="1234";
		String str3 = str + str1;
		System.out.println(str3.length());
		
		String str6 = str3.substring(str3.length()-4,8);
		
		System.out.println(str6);
		Timestamp ts=new Timestamp(System.currentTimeMillis());
		String str31 = ts.toString();
		String str9 = str31.substring(8,10);
		
		int a = Integer.parseInt(str9);
		System.out.println(a);
			
	}

}
