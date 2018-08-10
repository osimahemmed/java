package com.oracle.xml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PreapareStmt {
  /*public static java.sql.Date getCurrentJavaSqlDate() {
    java.util.Date today = new java.util.Date();
    System.out.println(new java.sql.Date(today.getTime()));
    return new java.sql.Date(today.getTime());
  }*/
	public static String strDate1=null;
    public static String getDate(Date date1){
    	SimpleDateFormat df1 =new SimpleDateFormat("MMM/dd/yyyy");
    	strDate1 =df1.format(date1);
    	
  	  return strDate1;
    }
	private static final String SELECT_DATE = "SELECT INVESTEMENT_DATE FROM INSURANCE";
	private static final String INSERT_DATE = "INSERT INTO INSURANCE VALUES(?,?,?,?)";

  public static Connection getConnection() throws Exception {
    String driver = "oracle.jdbc.driver.OracleDriver";
    String url = "jdbc:oracle:thin:@10.184.108.69:1521:FLEXCJ";
    String username = "fcdbng";
    String password = "fcdbng";
    Class.forName(driver);
    Connection conn = DriverManager.getConnection(url, username, password);
    return conn;
  }

  public static void main(String[] args) throws Exception {
    Connection conn = null;
    PreparedStatement pstmt = null;
    //Statement stmt =null;
    ResultSet rs =null;
    String strDate="06/05/2010";
    Date date=null;
    Date pdate =null;
    java.sql.Date dte =null;
    SimpleDateFormat df =new SimpleDateFormat("dd/MM/yyyy");
    try {
    	
      conn = getConnection();
      
      /*
      pdate = df.parse(strDate);
      System.out.println("iam in date is "+pdate);
      dte = new java.sql.Date(pdate.getTime());
      
      System.out.println("heyyyyyyyy is "+dte);
     
      pstmt = conn.prepareStatement(INSERT_DATE);
      pstmt.setInt(1,5);
      pstmt.setString(2, "Grp");
      pstmt.setInt(3, 560);
      pstmt.setDate(4, null);
      pstmt.executeQuery();
      System.out.println("done");
      */
      pstmt=conn.prepareStatement(SELECT_DATE);
      //pstmt.setInt(1, 2);
      rs=pstmt.executeQuery();
      while(rs.next()){
    	  date=rs.getDate("INVESTEMENT_DATE");
    	  if(date==null){
    		  date = Date.class.newInstance();
    		  System.out.println("Null date is "+date);
    	  }
    	  strDate1 =getDate(date);
          System.out.println("Format "+strDate1);
    	  
      }
      //System.out.println("Date is "+date);

    }
    catch (ParseException e) {
    	e.printStackTrace();
		
	}
    finally {
     pstmt.close();
     conn.close();
    }
  }
}
