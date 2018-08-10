package com.txns;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class TxnMain {
	public static void main(String args[]) throws Exception{
		Connection conn  = getConnection();
		System.out.println("done");
		DatabaseMetaData  dbm = conn.getMetaData();
		if(dbm.supportsTransactionIsolationLevel(Connection.TRANSACTION_REPEATABLE_READ)){
			System.out.println("Transaction Isolation level " + "TRANSACTION_READ_COMMITTED is supported.");
			conn.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
		}
		conn.close();
	}
	public static Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@10.184.108.69:1521:FLEXCJ";
		return DriverManager.getConnection(url,"fcdbng","fcdbng");
	}

}
