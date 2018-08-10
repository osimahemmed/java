package com.oracle.xml;

import java.util.ArrayList;
import java.util.Collections;

public class RevStr {
	public static void main(String[] args) {
		String str = "oracle";
		System.out.println(Rever.reverseIt(str));
		/*ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("F");
		list.add("C");
		list.add("E");
		list.add("B");
		list.add("D");
		Collections.sort(list);
		System.out.println("list is " +list);
		Collections.reverse(list);
		System.out.println("size "+list.size());
		for(int i=0;i<list.size();i++){
			System.out.println(" Get the value " +list.get(i));
		}
		System.out.println("Reverse list is "+list);
		*/

	}
}
class Rever{
	public static String reverseIt(String src){
		int len = src.length()-1;
		System.out.println("Length "+len);
		StringBuffer buf = new StringBuffer();
		for(int i =len;i>=0;i--){
			buf.append(src.charAt(i));
						
		}
		return buf.toString();
	}
	
}
