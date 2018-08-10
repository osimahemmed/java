package com.oracle.xml;

import java.util.ArrayList;
import java.util.Iterator;

public class Dupli1 {

	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("2");
		aList.add("2");
		aList.add("3");
		aList.add("3");
		aList.add("4");
		aList.add("4");
		int k=0;
		ArrayList<String> list =new ArrayList<String>();
		//System.out.println(aList);
		for(int i =0;i<aList.size();i++){
			String str1 = aList.get(i);
			//System.out.println(str1);
			for(int j=i+1;j<aList.size();j++){
				String str2 = aList.get(j);
				if(str1.equals(str2)){
					k++;
					list.add(str1);
					//System.out.println("equal  print " +i);
					
					//System.out.println(list);
					
				}
				
				
			}
		}
		System.out.println("equal  print " +k);
		//String str =aList.get(0);
		//System.out.println(b);
		/*Iterator< String> utr = aList.iterator();
		while(utr.hasNext()){
			System.out.println(utr.next());
		}*/

	}

}
