package com.oracle.xml;
import java.util.Date;import
java.text.SimpleDateFormat;
public class FormattingDateInCustomFormat {   
	public static void main(String[] args) {     
		//create Date object
		Date date = new Date();
		System.out.println(date);
		//create object of SimpleDateFormat class with custom format
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yy");
		String strDate = sdf.format(date);
		System.out.println("formatted date in mm/dd/yy : " + strDate);
		//format date in dd/mm/yyyy format
		sdf = new SimpleDateFormat("dd/MM/yyyy");
		strDate = sdf.format(date);
		System.out.println("formatted date in dd/MM/yyyy : " + strDate);
		//format date in mm-dd-yyyy hh:mm:ss format
		sdf = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");
		strDate = sdf.format(date);
		System.out.println("formatted date in mm-dd-yyyy hh:mm:ss : " + strDate);
	}
}