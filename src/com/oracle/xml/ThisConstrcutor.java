package com.oracle.xml;

public class ThisConstrcutor {
	
	ThisConstrcutor() {
	    this("JBT");
	    System.out.println("Inside Constructor without parameter");
	  }
	ThisConstrcutor(String str) {
	    System.out
	        .println("Inside Constructor with String parameter as " + str);
	  }
	  public static void main(String[] args) {
		  ThisConstrcutor obj = new ThisConstrcutor();
		  
	  }
}
