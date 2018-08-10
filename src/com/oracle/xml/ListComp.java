package com.oracle.xml;

import java.util.ArrayList;
import java.util.Arrays;

public class ListComp {
	public static void main(String args[]){
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		list1.add("a1");
		list1.add("a2");
		list1.add("a3");
		
		list2.add("b1");
		list2.add("a2");
		list2.add("a3");
		
		for(int i =0;i<list1.size();i++){
			String str1 = (String)list1.get(i);
			for(int j=0;j<list2.size();j++){
				String str2 = (String)list2.get(j);
				
				int res = str1.compareTo(str2);
				if (res == 0){
					System.out.println(str1+ " = " + str2);
				}
				else if (res > 0){
					System.out.println(str1+ " > " + str2);
				}
				else if (res < 0){
					System.out.println(str1+ " < " + str2);
				}
			}
			
		}
		
	}

}
