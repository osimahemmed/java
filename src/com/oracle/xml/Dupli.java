package com.oracle.xml;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Dupli{

	public static void main(String[] args) {   
	ArrayList al = new ArrayList();   
	al.add("1");   
	al.add("2");   
	al.add("5");   
	al.add("6");   
	al.add("3");   
	al.add("4");   
	  
	System.out.println("List one: "+al);   
	    
	ArrayList al2 = new ArrayList();   
	al2.add("1");   
	al2.add("2");   
	al2.add("7");   
	al2.add("8");   
	  
	System.out.println("List two "+al2);   
	  
	Set s = new HashSet();   
	s.addAll(al);   
	s.addAll(al2); 
	System.out.println("ss" + s);
	  
	ArrayList dupValues = new ArrayList();   
	  
	for(int i=0; i<al2.size(); i++) {   
	if(al.contains(al2.get(i))) {   
	dupValues.add(al2.get(i));   
	}   
	}   
	  
	System.out.println("Dup values " +dupValues);   
	  
	List finalList = new ArrayList();   
	  
	finalList.addAll(s);   
	  
	System.out.println("List with all values "+ finalList);   
	    
	}  
	}
