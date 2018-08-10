package com.oracle.xml;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		HashMap<String, Integer> markList = new HashMap<String, Integer>();
		markList.put("osim", 100);
		markList.put("Ravi", 100);
		markList.put("swapan", 45);
		markList.put("sushil", 64);
		markList.put("Bibhas", 64);
		markList.put("Jagat", 35);
		
		sortHashMapByValues(markList);
		
	}
	public static void sortHashMapByValues(HashMap<String, Integer> passedMap){
		
		List<String> mapKeys = new ArrayList<String>(passedMap.keySet());
		List<Integer> mapValues = new ArrayList<Integer>(passedMap.values());
		
		//System.out.println("map Keys is " +mapKeys);
		//System.out.println("map Values are " +mapValues);
		
		Collections.sort(mapKeys);
		Collections.sort(mapValues);
		
		//System.out.println("after sorting map Keys is " +mapKeys);
		//System.out.println("after sorting map Values are " +mapValues);
		LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
		
		Iterator<Integer> valueItr = mapValues.iterator();
		while(valueItr.hasNext()){
			Object value = valueItr.next();
			//System.out.println("value is " + value );
			Iterator<String> keyIt = mapKeys.iterator();
			while(keyIt.hasNext()){
				Object key = keyIt.next();
				//System.out.println("key is " + key);
				String comp1 = passedMap.get(key).toString();
				System.out.println("comp1 " + comp1);
				String comp2 = value.toString();
				System.out.println("comp2 " + comp2);
				if(comp1.equals(comp2)){
					passedMap.remove(key);
					mapKeys.remove(key);
					sortedMap.put((String)key, (Integer) value);
					System.out.println("sorted map is" +sortedMap);
					break;
				}
				
			}
		}
		
		Set<String> s =sortedMap.keySet();
		Iterator<String> itr = s.iterator();
		while(itr.hasNext()){
			String keyi = (String)itr.next();
			//System.out.println("names are " +keyi);
			int val = sortedMap.get(keyi);
			System.out.println("Values are "+val );
		}
		
		//return sortedMap;
	}

}
