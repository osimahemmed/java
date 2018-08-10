package com.oracle.xml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public class CountRec {
  public static Connection getConnection() throws Exception {
    String driver = "oracle.jdbc.driver.OracleDriver";
    String url = "jdbc:oracle:thin:@10.184.108.69:1521:FLEXCJ";
    String username = "fcdbng";
    String password = "fcdbng";
    Class.forName(driver);
    System.out.println("Test 1");
    Connection conn = DriverManager.getConnection(url, username, password);
    System.out.println("Test 2");
    return conn;
  }

  public static void main(String[] args) {
    ResultSet rs = null;
    Connection conn = null;
    PreparedStatement pstmt = null;
    HashMap<String, String> mapdesc = new LinkedHashMap<String, String>();
    try {
      conn = getConnection();
      String query = "select * from msttxn";
      pstmt = conn.prepareStatement(query);
      rs = pstmt.executeQuery();
      while (rs.next()) {
    	  String idtxn = rs.getString(1);
    	  String desc = rs.getString(3);
    	  mapdesc.put(idtxn, desc);	  
    	//  System.out.println("mapdesc " + mapdesc);
      }  
      
		//System.out.println("after sorting map Values are " +valDesc);
		/*

  	  /*
  	  Set<String> set = mapdesc.keySet();
  	  Iterator<String> iter = set.iterator();
  	  while(iter.hasNext()){
  		  String keyid = (String)iter.next();
  		  String descr = mapdesc.get(keyid);
  		  System.out.println(descr);
  	  }
  	  */
      System.out.println("Size of the Map "+mapdesc.size());
      List<String> keyIdTxn = new ArrayList<String>(mapdesc.keySet());
      List<String> valDesc = new ArrayList<String>(mapdesc.values());
      //System.out.println("valDesc " + valDesc);
      Collections.sort(keyIdTxn);
  	  Collections.sort(valDesc);
  	  
  	  //System.out.println("after sorting map Keys is " +keyIdTxn);
  	  //System.out.println("after sorting map Values is " +valDesc);
  	  
		LinkedHashMap<String, String> sortedMap = new LinkedHashMap<String, String>();
		
		Iterator valueItr = valDesc.iterator();
		while(valueItr.hasNext()){
			Object value = valueItr.next();
			//System.out.println("value is " + value );
			Iterator keyIt = keyIdTxn.iterator();
			while(keyIt.hasNext()){
				Object key = keyIt.next();
				//System.out.println("key is " + key);
				String comp1 = mapdesc.get(key).toString();
				System.out.println("comp1 " + comp1);
				String comp2 = value.toString();
				//System.out.println("comp2 " + comp2);
				if(comp1.equals(comp2)){
					mapdesc.remove(key);
					keyIdTxn.remove(key);
					sortedMap.put((String)key, (String)value);
					//System.out.println("sorted map is" +sortedMap);
					break;
				}
				
			}
			
		}
		System.out.println("sorted map is" +sortedMap);
  	  
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        rs.close();
        pstmt.close();
        conn.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }
}
