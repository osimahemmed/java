package com.oracle.xml;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharCount {

	public static void main(String[] args) {
		Object name = null;
		String strName = "ahemmed";
		Integer freq=null;
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for(int i=0;i<strName.length();i++){
			char ch = strName.charAt(i);
			freq = map.get(ch);
			map.put(ch, freq==null?1:freq+1);
			
		}
		System.out.println("map" + map);
		Iterator iter = map.entrySet().iterator();
		while(iter.hasNext()){
			name = iter.next();
			System.out.println("name " +name);
		}
	}

}
