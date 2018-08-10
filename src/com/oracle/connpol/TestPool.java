package com.oracle.connpol;

import java.io.*;
import java.util.*;
import java.sql.*;

/** 
 * Simple test class used to instantiate the connection pool and checkout all 
 * the connections. This class loads the number of connections from the 
 * property file and then creates an array of connections. Each connection is 
 * checked out from the pool and a query is run. The connections are not returned. 
 * To verify the pool is empty one more connection is attempted which should 
 * result in a null return. After that all connections are returned and the 
 * connection pool is shutdown. 
 */
public class TestPool {
	
	/**    
	 * Empty constructor. No instance of TestPool is actually created    
	 */
	public TestPool() {
	}

	/**    
	 * This method handles any command line input and references the    
	 * connection pool test code.    
	 * @param   pArgs        Arguments array from the command line   
	 */
	public static void main(String[] pArgs) throws java.io.IOException {
		
		int numberOfConnections = 0;
		Connection allConnections[];
		Properties pProps = new Properties();
		//D:\Osim\Core_pro\src\com\oracle\connpol\ConnectionPool.properties
		String filename="D:\\Osim\\Core_pro\\src\\com\\oracle\\connpol\\ConnectionPool.properties";
		// Setup the reference to the connection pool. This calls the static method     
		// that either returns the existing instance or creates the first instance     
		// and returns a reference.
		
		ConnectionPool dbConnectionPool = ConnectionPool.getInstance();
		try {
			FileInputStream fileIn = new FileInputStream(filename);
			pProps.load(fileIn);
			fileIn.close();
		} catch (Exception e) {
			System.err.println("Unable to read the property file in ex.");
			return;
		}
		// Get the number of connections from the property file.      
		try {
			
			numberOfConnections = Integer.parseInt(pProps.getProperty("numberOfConnections"));
			
		} catch (Exception e) {
			System.err.println("Error getting number of connections from the property file.");
			return;
		}
		
		// Set the array to hold the entire pool of connections.      
		allConnections = new Connection[numberOfConnections];
		System.out.println("allConnections " +allConnections.length);
		// Checkout each connection and run a simple query.     
		// Keep the connections so we can empty the pool.     
		
		for (int i = 0; i < allConnections.length; i++) {
			
			allConnections[i] = dbConnectionPool.checkOut();
			System.out.println("No of conn"+allConnections[i].toString());
			if (allConnections[i] == null) {
				System.err.println("Error getting connection. Something is wrong :-)");
			} else {
				
				try {
					int no= 0;
					int name= 0;
					Statement stmt = allConnections[i].createStatement();
					ResultSet rs = stmt.executeQuery("SELECT * FROM AUCTION");
					while(rs.next()){
						no = rs.getInt(1);
						name = rs.getInt(2);
						
						
					}
					System.out.println(no+""+name);
					
					/* Normally you would have some processing here. 
					 * We are just going to  close up and accept that the connection ran well.
					 */
					rs.close();
					stmt.close();
					
				} catch (SQLException sqlE) {
					System.err.println("Error running query. Check your settings."+ sqlE);
				} finally {
					// Normally we would use the finally block to make sure the connection 
					// is returned to the pool. For testing only we will do nothing. 
					;
				}
			}
		}
		Connection nullTest = dbConnectionPool.checkOut();
		
		// This connection should be null.              
		if (nullTest != null) {
			System.err.println("Something is wrong :-)");
		}
		
		// Return all the connections to the pool.
		for (int i = 0; i < allConnections.length; i++) {
			dbConnectionPool.checkIn(allConnections[i]);
			allConnections[i] = null;
		}
		
		// Perform a clean shutdown of the connection pool. Connections will close when             
		// the reference is lost but it is better to have a clean shutdown.
		dbConnectionPool.shutdown();
	}
}