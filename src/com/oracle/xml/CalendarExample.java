package com.oracle.xml;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class CalendarExample 
{ 

	public static void main(String[] args) 

	{ 

		
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		Date dte = Calendar.getInstance().getTime();
		System.out.println("Format date is "+df.format(dte));
		Calendar cal = Calendar.getInstance(); 

		int day = cal.get(Calendar.DATE); 

		int month = cal.get(Calendar.MONTH) + 1; 

		int year = cal.get(Calendar.YEAR); 

		int dow = cal.get(Calendar.DAY_OF_WEEK); 

		int dom = cal.get(Calendar.DAY_OF_MONTH); 

		int doy = cal.get(Calendar.DAY_OF_YEAR); 



		//System.out.println("Current Date: " + cal.getTime()); 

		System.out.println("Day: " + day); 

		System.out.println("Month: " + month); 

		System.out.println("Year: " + year); 

		System.out.println("Day of Week: " + dow); 

		System.out.println("Day of Month: " + dom); 

		System.out.println("Day of Year: " + doy); 

	} 
}

