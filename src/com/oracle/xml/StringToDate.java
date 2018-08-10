package com.oracle.xml;

import java.util.*;
import java.text.*;
public class StringToDate {
	public static void main(String[] args)
    {

		String strDate = "12-07-2009";
//		String del = "-";
//		String temp[] = strDate.split(del);
//		
//		}
		
		SimpleDateFormat df = new SimpleDateFormat("MM-dd-yyyy");
		try{
			Date date = df.parse(strDate);
			System.out.println("Today date is " +date);
			Format ft = new SimpleDateFormat("dd/MMM/yyyy");
			String str2 = ft.format(date);
			System.out.println("Fomat date is "+str2);
			//java.sql.Date  dfr = new java.sql.Date(df.parse(strDate).getTime());
			//Date date = df.parse(strDate);
			//System.out.println("Date is " +df.format(dfr));
		}catch (ParseException e) {
			System.out.println("Exception " +e);
		}
    }

} 
