package com.oracle.xml;

import java.io.*;

public class HanEx{
	  public static void main(String[] args) throws Exception{
	    try{
	      int a,b;
	      
	      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	      System.out.println("Enter the value for a");
	      a = Integer.parseInt(in.readLine());
	      System.out.println("Enter the value for b");
	      b = Integer.parseInt(in.readLine());
	      System.out.println("value of a is " +a);
	      System.out.println("value of a is " +b);
	    }
	    catch(NumberFormatException ex){
	      System.out.println(ex.getMessage() + " is not a numeric value.");
	      System.exit(0);
	    }
	  }
	}