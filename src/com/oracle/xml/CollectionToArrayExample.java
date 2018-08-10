package com.oracle.xml;

import java.io.File;
import java.util.*;

public class CollectionToArrayExample {


	public static void main(String[] args) {
		
		/*
		HashMap<String, String> hm = new LinkedHashMap<String, String>();
		hm.put("Name", "osim");
		hm.put("Age", "28");
		hm.put("Address", "Bangalore");
		System.out.println(hm);
		Set<String> set = hm.keySet();
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			String na = (String)itr.next();
			String val = hm.get(na);
			System.out.println(val);
			//System.out.println(na);
		}
		List<String> list = new ArrayList<String>(hm.keySet());
		list.addAll(hm.values());
		System.out.println("list values "+list);
		for(int i=0;i<list.size();i++){
			System.out.println("List val 9999 "+list.get(i));
		}
		*/
		/*List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("D");
		list.add("C");
		list.add("B");
		
		Object array[] = list.toArray();
		for(int i =0;i<array.length;i++){
			System.out.println(array[i].toString());
		}
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		Arrays.sort(array, Collections.reverseOrder());
		System.out.println(Arrays.toString(array));
		*/
		ArrayList<String> filnames = new ArrayList<String>();
		File folder = new File("C:\\images");
		File[] listOfFiles = folder.listFiles();
		for(int i =0;i<listOfFiles.length; i++){
			if(listOfFiles[i].isFile()){
				filnames.add(listOfFiles[i].getName());
				System.out.println(listOfFiles[i].getName());		
			}
		}		
	
	}
}

