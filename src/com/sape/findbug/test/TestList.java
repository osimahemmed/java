package com.sape.findbug.test;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		m1();
		m2();

	}
	
	private static List m1() {
		
		List list = new ArrayList();
		list.add("a");
		return list;
	}
	
	private static List m2() {
		
		List list;
		
		if(true) {
			
			list =  new ArrayList();
			list.add("D");
		}
		
		return list;
	}

}
