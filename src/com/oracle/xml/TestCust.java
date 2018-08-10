package com.oracle.xml;

import java.sql.*;

public class TestCust {
	
	private static final int TEST_FLAG = 1;
	
	private static final String
	COUNT_ROWS = "select count(*) from msttxn";
	private static final String
	SEL_CUST_MAST					= 	" select 1"
									+ 	" from msttxn"
									+ 	" where idtxn = ?"
									+	" and txngroup = 'P'";
	public static Connection getConnection()throws Exception{
		String driver ="oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@10.184.108.69:1521:FLEXCJ";
		String username = "fcdbng";
		String password = "fcdbng";
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, username, password);
		return conn;
	}
	public static boolean validCustomer(Connection p_conn,String cust_id)throws Exception{
		PreparedStatement l_stmt = null;
		ResultSet l_rs = null;
		try{
			l_stmt = p_conn.prepareStatement(SEL_CUST_MAST);
			l_stmt.setString(1,cust_id);
					    			
			l_rs = l_stmt.executeQuery();
			
			if(!l_rs.next()){
				System.out.println("iam in false");
				return false;
			}
			
	
		}finally{
			try{
				l_rs.close();
			}catch (Exception e) {
			}
			try{
				l_stmt.close();
			}catch (Exception e) {
			}
			l_rs 	= null;
			l_stmt 	= null;
		}
		System.out.println("Iam in true");
		return true;
	}
	public static int countRows(Connection p_conn)throws Exception{
		PreparedStatement l_stmt = null;
		ResultSet l_rs = null;
		int numberOfRows = 0;
		try{
			l_stmt  = p_conn.prepareStatement(COUNT_ROWS);
			l_rs	= l_stmt.executeQuery();
			while(l_rs.next()){
				numberOfRows = l_rs.getInt(1);	
			}
			
		}finally{
			try{
				l_rs.close();
			}catch (Exception e) {
			}
			try{
				l_stmt.close();
			}catch (Exception e) {
			}
			l_rs = null;
			l_stmt = null;
			
		}
		System.out.println("Number of rows are "+ numberOfRows);
		return numberOfRows;
	}
	public static void main(String args[]) throws Exception{
		TestCust testCust = new TestCust();
		Connection l_conn = getConnection();
		
		testCust.validCustomer(l_conn, "ACD");
		testCust.countRows(l_conn);
	}

}