package com.oracle.xml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class DNBUtils {
	private static final String driver="oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@10.184.108.69:1521:FLEXCJ";
	private static final String user = "fcdbng";
	private static final String password = "fcdbng";

	private static final String
	SEL_FCDBNG_ID_STR				= 	" select firstname"
									+ 	" from mstuser"
									+ 	" where typeuser = ?"
									+	" and id_entity = ?"
;
	
	public static Connection getConnection() throws Exception{
		Connection conn = null;
		Class.forName(driver);
		conn = DriverManager.getConnection(url, user, password);
		return conn;
	}
	public static Vector<String> getCustDetails	(
				Connection p_conn
			,	String typeuser
			,	String id
			)throws Exception{
				
				Vector<String> l_vector = null;
				ResultSet l_rs = null;
				PreparedStatement l_pstm = null;
				try	{
					System.out.println("iam in 1");
					l_pstm = p_conn.prepareStatement (SEL_FCDBNG_ID_STR);
					l_pstm.setString(1, typeuser);
					l_pstm.setString(2, id);
					System.out.println("iam in 2");
					l_rs =	l_pstm.executeQuery();
					l_vector = new Vector<String>();
					while(l_rs.next()){
						l_vector.addElement(l_rs.getString("firstname"));
					}
		
				}	finally	{
						try	{
							l_rs.close();
							}	catch	(Exception e)	{
							}	try	{
								l_pstm.close();
							}	catch	(Exception e)	{
						
							}
							l_rs	=	null;
							l_pstm	=	null;
				}
				return l_vector;
	}
	public static void main(String args[]) throws Exception {
		Connection l_conn = null;
		Vector<String> l_vector = null;
		try{
			l_conn = getConnection();
			l_vector = DNBUtils.getCustDetails(l_conn, "INA","F001");
			for(int l_i = 0;l_i<l_vector.size(); l_i++){
				System.out.println(l_vector.elementAt(l_i));
			}
			
		}finally{
			try{
				l_conn.close();
			}catch(Exception e){
			}
			l_conn = null;
		}
	}
}
