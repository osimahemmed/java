package com.oracle.xml;

import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StrD {
	public static void main(String args[]){
		
		try{
			String dt = "25-03-2009"; //mmm/dd/yyyy 
			DateFormat formatter;
			Date date;
			formatter = new SimpleDateFormat("dd-MM-yyyy");
			date = formatter.parse(dt);
			Format frmt = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:ss");
			String dt1 = frmt.format(date);
			System.out.println("Date is "+date);
			System.out.println("format date is  "+dt1);
			//System.out.println(formatter.format(date));
			
		}catch(ParseException e){
			System.out.println("Exception "+e);
		}
	}

}
