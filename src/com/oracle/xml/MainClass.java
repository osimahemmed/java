package com.oracle.xml;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MainClass {

	  public static void main(String[] args) throws ParseException {
		  String strDt = "02-12-2009";
		  
		  DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		  DateFormat df1 = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss");
		  try{
		  java.util.Date date = df.parse(strDt);
		 // java.util.Date dt = df.format(date)
		  java.util.Date date1 = df.parse(strDt);
		  System.out.println("date 1 :" + date1);
		  String dtr = df1.format(date1);
		  System.out.println("dtr "+dtr);
	    java.sql.Date sqlDate = new java.sql.Date(date.getTime());
	   // System.out.println("utilDate:" + date1);
	    System.out.println("sqlDate : " + sqlDate);
		  }catch (ParseException e) {
			System.out.println("Exception " +e);
		}
	  }

	}