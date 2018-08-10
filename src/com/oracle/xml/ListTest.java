package com.oracle.xml;

import java.util.*;

public class ListTest {

	public static void main(String[] args)throws Exception {
		
		List<String> list = new ArrayList<String>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		
		list.add(1, "insert");
		
		for(String str: list){
			System.out.println(str);
		}

	}

}
