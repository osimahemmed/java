package com.oracle.xml;

import java.util.*;
import java.lang.String;


public class DupFind {

	public static void main(String[] args) {


		List<String> alKey = new ArrayList<String>();
		alKey.add("osim");
		alKey.add("osim");
		alKey.add("pratap");
		alKey.add("pratap");
		alKey.add("swapan");
		alKey.add("sushil");
		alKey.add("tripathy");

//		Call the findDup method
		boolean boolDup = findDup(alKey);
		System.out.println("The value of boolDup -> " + boolDup);
	}

	public static boolean findDup(List<String> alKey) {

		boolean boolDup = false;
		Map<String, String> repeated = new HashMap<String, String>();
		Iterator<String> iterator = alKey.iterator(); 
		while(iterator.hasNext()){ 

			String str = (String) iterator.next();
			// Looking for a duplicate entry
			if (repeated.containsKey(str))
			{
				// Set the boolean value true
				System.out.println("Duplicate found -> " + str);
				boolDup = true;
			} else {
				// Just doing dummy put in the HashMap object
				//System.out.println("iam here");
				repeated.put(str,"1");
				
			}
			System.out.println("str " + str);
		}

		return boolDup;
	}
}