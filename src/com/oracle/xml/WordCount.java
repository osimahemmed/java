package com.oracle.xml;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

public class WordCount {
	public static void main(String args[]){
		String name = "osim swapan pratap swapan pilot osim osim osim";
		StringTokenizer str = new StringTokenizer(name," ");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		while(str.hasMoreElements()){
			String str2 = str.nextToken();
			Integer in = map.get(str2);
			System.out.println(in);
			map.put(str2, in==null?1:in+1);	
		}
		Iterator iter = map.entrySet().iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}

}
