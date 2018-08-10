package com.oracle.xml;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateToString {
	public static void main(String[] args)

	{

		DateFormat df = new SimpleDateFormat("yyyy/mm/dd");
		Date date = Calendar.getInstance().getTime();
		String today = df.format(date);
		System.out.println(today);

	}
}
