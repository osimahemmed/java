package com.design;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StrD1 {
	public static void main(String args[]){
		
		try{
			
			java.util.Date today = new java.util.Date();
			System.out.println("today is " + today);
			java.sql.Timestamp ts1 = new java.sql.Timestamp(today.getTime());
		    String name = ts1.toString();
		    
		    System.out.println("TimeStamp date is " + name);
		    String atr4 = name.substring(0, 10);
		    SimpleDateFormat fr = new SimpleDateFormat("yyyy-MM-d");
		    Date dt =fr.parse(atr4);  
		    SimpleDateFormat for1 =new SimpleDateFormat("dd-MMM-yyyy");
		    String dtl = for1.format(dt);  
		    
		    System.out.println("Afer formatting  == " +dtl );
		    
		    java.util.Date ut = for1.parse(dtl);
		    
		    System.out.println("ut---------" +  ut);
		    
		    java.sql.Date dtsql = new java.sql.Date(ut.getTime());
		    
		    System.out.println("sql date is " + dtsql);
		    
		    		   
		}catch(ParseException e){
			System.out.println("Exception "+e);
		}
	}

}
