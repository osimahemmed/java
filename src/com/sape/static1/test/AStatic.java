package com.sape.static1.test;

public class AStatic {
	
	static {
	      System.out.println("static block 1");
	   }
	   
	   {
		   System.out.println(" instance block 2");
	   }
	   
	   public AStatic() {
			System.out.println(" AStatic constructor 3");
		}
	

}
