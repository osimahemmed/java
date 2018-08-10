package com.oracle.xml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.sql.Date;

public class SetDate {
	private static final String INSERT_DATE = "insert into ORDER_DETAILS(order_id,order_date,order_mode) values (?,?,?)";
	
	private static final String SELECT_DATE = "select * from ORDER_DETAILS";
	
	public static Connection getConnection()throws Exception{
		String driver = "oracle.jdbc.driver.OracleDriver";
	    String url = "jdbc:oracle:thin:@10.184.108.69:1521:FLEXCJ";
	    String username = "scott";
	    String password = "tiger";
	    Class.forName(driver);
	    Connection conn = DriverManager.getConnection(url, username, password);
	    return conn;
	}
	/*public static java.sql.Date getDate(){
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date today = new java.util.Date();
		//Date strDate = df.format(date);
		System.out.println("Todays date is " +today);
		return new java.sql.Date(today.getTime());
	}*/
	public static void main(String args[]) throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		//Date date = new Date(0000-00-00);
		Statement stmt = null;
		ResultSet rs =null;
		String name = null;
		int id = 0;
		java.sql.Date dt =null;
		SimpleDateFormat dformat = new SimpleDateFormat("dd-yyyy-MM");
		String str = null;
		try{
			/*
			//java.sql.Date curDate = getDate(); 
			//System.out.println("Test 123 date " +curDate);
			conn = getConnection();
			pstmt = conn.prepareStatement(INSERT_DATE);
			pstmt.setInt(1, 2);
			//pstmt.setDate(2, curDate);
			pstmt.setDate(2,date.valueOf("2009-11-25"));
	        
			pstmt.setString(3, "email");
			
			int rowCount = pstmt.executeUpdate();
			System.out.println("Rows count is " +rowCount);
			*/
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SELECT_DATE);
			while(rs.next()){
				id	 = rs.getInt(1);
				dt	 = rs.getDate(2);
				name = rs.getString(3);			
				//System.out.println(dt);
				}
			System.out.println(id);
			System.out.println("HI"+dt);
			System.out.println(name);
			str = dformat.format(dt);
			System.out.println("Format " +str);
			
		}finally{
			stmt.close();
			conn.close();
		}
		
	}

}
