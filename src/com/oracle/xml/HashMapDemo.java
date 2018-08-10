package com.oracle.xml;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, String> errors = new HashMap<String, String>();
        
        Map<String, Integer> linkMap = new LinkedHashMap<>();
        linkMap.put("osim", 1);
        linkMap.put("Sushil", 3);
        linkMap.put("jain", 4);
        linkMap.put("Ashish", 2);
        
        Iterator<String> itr = linkMap.keySet().iterator();
        while(itr.hasNext()) {
        	String key = itr.next();
        	if(key.equalsIgnoreCase("osim")) {
        		System.out.println("osim");
        		itr.remove();
        	}
        	System.out.println("value is "+ linkMap.get(key));
        }
        System.out.println(linkMap);

        // mapping some data in the map
        errors.put("404", "Resource not found.");
        errors.put("403", "Access forbidden.");
        errors.put("500", "General server error.");

        // reading data from the map
        String errorDesc = (String) errors.get("404");
        System.out.println("Error 404: " + errorDesc);

        // iterating the map by it's keys
        Iterator<String> iterator = errors.keySet().iterator();
        while (iterator.hasNext()) {
            String key = (String) iterator.next();
            System.out.println("Error " + key + " means " + errors.get(key));
       }
    }
}
