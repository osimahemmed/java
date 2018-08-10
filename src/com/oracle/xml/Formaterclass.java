package com.oracle.xml;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Formaterclass { 
    public static void main(String[] args){
    	
    	HashMap<String, String> hMap = new HashMap<String, String>();
    	hMap.put("1", "one");
    	hMap.put("2", "two");
    	hMap.put("3", "three");
    	hMap.put("4", "four");
    	System.out.println("hash map is " + hMap);
    	
    	boolean isKeyExists = hMap.containsValue("one");
    	System.out.println("exists in map  " + isKeyExists);
    	
    	Map<String, String> sorted = new TreeMap<String, String>(hMap);
    	
    	
    	Collection c = sorted.values();
    	Iterator itr = c.iterator();
    	while(itr.hasNext()){
    		System.out.println(itr.next());
    	}
    } 
}
