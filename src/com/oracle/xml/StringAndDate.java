package com.oracle.xml;

public class StringAndDate {
	
	/**
	 * Get a String (dd/mm/yyyy) and returns a java.sql.Date.
	 * It is useful to get user input and insert it in 
	 * the database like MySQL.
	 *  
	 * @param strDate a String in the format dd/mm/yyyy
	 * @return java.sql.Date
	 */
	/**
	 * @param strDate
	 * @return
	 */
	public static java.sql.Date getSqlDate(String strDate) {
		String[] splitedDate = strDate.split("/");
		int day = Integer.parseInt(splitedDate[0]);
		int month = Integer.parseInt(splitedDate[1]) - 1;
		int year = Integer.parseInt(splitedDate[2]) - 1900;
		System.out.println("day " + day);
		System.out.println("month " + month);
		System.out.println("year " + year);
		//deprecated
		return new java.sql.Date(year, month, day);
	}
	
	// Usage:
	public static void main(String[] args) {
		System.out.println(getSqlDate("01/05/2009"));
	}
}
