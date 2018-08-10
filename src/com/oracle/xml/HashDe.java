package com.oracle.xml;

import java.util.*;


public class HashDe {

	public static void main(String[] args) {
		Map<String, Double> hm = new HashMap<String, Double>();
		hm.put("Rohit", 1160.34);
		hm.put("Ramesh",2200.67);
		hm.put("ArunSh",1350.21);
		hm.put("Nirmal",1425.32);
		hm.put("Bhavani",3434.34);
		
		Set set = hm.entrySet();
		
		Iterator itr = set.iterator();
		while(itr.hasNext()){
			Map.Entry me = (Map.Entry)itr.next();
			System.out.println(me.getKey() + " : " + me.getValue());
		}
		
		double balance = ((Double)hm.get("Rohit")).doubleValue();
		System.out.println("Old Balance is "+balance);

		hm.put("Rohit", balance+1000);
		System.out.println("New Balance is " + hm.get("Rohit"));
		
		
		

	}

}
