/*package com.oracle.xml;

import java.text.*;
import java.util.*;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.ListUtils;

public class CurDate {

	
	public static void main(String[] args) {
	
		
		Date d = new Date();
		System.out.println(d);
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		String s = df.format(d);	
		
		System.out.println("Date is " + s);
		
		String ds = "07/11/2009";
		//DateFormat df = DateFormat.getDateInstance();
		//try{
		//	Date d = df.parse(ds);
		//}catch (Exception e) {
		//System.out.println("Unable to parse" + ds);
		
		List list1 = new ArrayList<String>();
		List list2 = new ArrayList<String>();
		list1.add(1);
		list1.add(2);
		list1.add(7);
		
		list2.add(3);
		list2.add(1);
		list2.add(2);
		list2.add(9);
		List retrive = new ArrayList<String>(list2);
		System.out.println("here " +retrive);
		retrive.retainAll(list1);
		System.out.println("retrive " +retrive);
		list2.removeAll(list1);
		System.out.println("list 2"+list2);
			
		//System.out.println(list1);
		
		//List list = ListUtils.union(list1, list2);
		//System.out.println(list);
			
		}
	}

*/