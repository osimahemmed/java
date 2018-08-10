package com.oracle.xml;

import java.sql.*;

public class SimpleBean {
	
	   public void insertRecord(String name,String accountno,int amt)
	   {
		   Connection connection = null;
           //Statement stat = null;
          
            try {

            	String driverName = "oracle.jdbc.driver.OracleDriver";
                Class.forName(driverName);
                String serverName = "10.184.108.69";
                String portNumber = "1521";
                String sid = "FLEXCJ";
                String url = "jdbc:oracle:thin:@" + serverName + ":" + portNumber + ":" + sid;
                String username = "FCJ100_4";
                String password = "FCJ100_4";
                connection = DriverManager.getConnection(url, username, password);
                CallableStatement cs = connection.prepareCall("{ call FUND_TRANSFER(?,?,?,?) }");
                cs.setString(1,name);
                cs.setString(2,accountno);
                cs.setInt(3,amt);
                cs.registerOutParameter(4, java.sql.Types.INTEGER);
                ResultSet rs = cs.executeQuery();
                int param2 = cs.getInt(4);
                System.out.println("param2=" + param2);
             }
            catch (ClassNotFoundException e1) 
            {
            	e1.printStackTrace();
            } 
            catch (SQLException e2) {
              // Could not connect to the database
            	e2.printStackTrace();
            }
            
	   }
      public static void main(String args[])
      {
    	  SimpleBean objSimpleBean = new SimpleBean();  
    	  objSimpleBean.insertRecord("Sugita","ABC100",100);
      }
}
