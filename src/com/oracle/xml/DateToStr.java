package com.oracle.xml;

import java.text.*;

import java.util.*;

public class DateToStr {
	public static void main(String args[]){
		try{
			String str1 = "2007-June-02";
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MMM-dd");
			Date date = df.parse(str1);
			System.out.println(date);
			System.out.println("Last Date " +df.format(date));
			
		}catch (ParseException e) {
			System.out.println("Exception "+ e);
		}
	}

}
