package com.oracle.xml;

import java.util.*;

public class Ex {

	public static void main(String[] args) {
		String[] s = {"Zx","df","ora","rel"};
		
		List list = Arrays.asList(s);
		System.out.println(list);
		Iterator i = list.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
			
		}
	}

}
