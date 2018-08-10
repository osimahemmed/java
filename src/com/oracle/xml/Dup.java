package com.oracle.xml;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Dup {
	public static void main(String args[]){
		List<Integer> in = new ArrayList<Integer>();
		in.add(2);
		in.add(2);
		in.add(3);
		in.add(3);
		in.add(4);
		in.add(5);
		int insize = in.size();
		System.out.println(insize);
		
		Set<Integer> se = new HashSet<Integer>(in);
		int sesize = se.size();
		if(insize>sesize){
			System.out.println("Duplicates");
		}
	}

}
