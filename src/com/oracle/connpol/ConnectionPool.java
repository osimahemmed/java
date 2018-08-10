package com.oracle.connpol;

import java.sql.*;
import java.io.InputStream;
import java.util.*;

/** 
 * Implementation of a database connection pool. 
 */
public class ConnectionPool {
	
	/**       
	 * A reference to the single instance of this class is stored in this variable.        
	 * This is how the class maintains the Singleton behavior.      
	 */
	
	private static  ConnectionPool mInstance;
	
	/*      
	 * The Vector allows us to store a number of connection objects and to retrieve them      
	 * safely. The Vector object is synchronized so that multiple threads requesting       
	 * connections will not get a reference to the same connection object.
     */
	
	private Vector<Connection> mConnections;
	
	/**       
	 * Database driver string used to register the JDBC driver.       
	 */
	private Driver mDBDriver = null;
	
	/**       
	 * JDBC connection URL for the driver.
	 */
	private String mDBURL = null;
	
	/**        
	 * Database user name.       
	 */
	private String mDBUserName = null;
	
	/**        
	 * Database password.       
	 */
	private String mDBPassword = null;
		
	/**
	 * Number of connections to establish in the connection pool.
	 */
	private int mNumberOfConnections = 4;

	/** 
	 * This method is central to the Singleton pattern. It returns      
	 * a reference to the single running instance and if this is the       
	 * first time the class is called it creates the single instance.     
	 * @return Single instance of the ConnectionPool object.       
	 */
	public static synchronized  ConnectionPool getInstance() {
		if(mInstance == null){
			mInstance = new ConnectionPool();
		}
		return mInstance;
	}
	/**
	 * For a Singleton pattern the constructor is private so that the instance of      
	 * this class is managed by the static getInstance method.       
	 *     
	 * @see #getInstance()      
	 */
	private ConnectionPool() {
		
		Connection tempConnection;
		String filePrefix = "/"+ ConnectionPool.class.getName().replace('.', '/');
		System.out.println("filePrefix " +filePrefix);
		InputStream propertyFile = getClass().getResourceAsStream(filePrefix + ".properties");
		System.out.println("propertyFile"+propertyFile);
		Properties poolProperties = new Properties();
		
		try {
			poolProperties.load(propertyFile);
		} catch (Exception propertyException) {
			System.err.println("Error reading property file. "
							+ filePrefix
							+ ".properties is in the same directory with the ConnectionPool class.");
			return;
		}
		
		// First load the database driver by reading the driver from the properties file.              
		try {
			
			//String dbDriverName = poolProperties.getProperty("dbDriver");
			String dbDriverName = poolProperties.getProperty("dbDriver");//dbDriver=oracle.jdbc.driver.OracleDriver
			mDBDriver = (Driver) Class.forName(dbDriverName).newInstance();
			DriverManager.registerDriver(mDBDriver);
			// Now grab the remaining properties and create the pool of connections. 
			mDBURL = poolProperties.getProperty("dbUrl");//dbUrl=jdbc:oracle:thin:@10.184.108.69:1521:FLEXCJ
			mDBUserName = poolProperties.getProperty("dbUserName");
			mDBPassword = poolProperties.getProperty("dbPassword");
			mNumberOfConnections = Integer.parseInt(poolProperties.getProperty("numberOfConnections"));
			mConnections = new Vector<Connection>(mNumberOfConnections);
			System.out.println(mDBURL+""+mDBUserName+""+mDBPassword+""+mNumberOfConnections+"");
			
			for (int i = 0; i < mNumberOfConnections; i++) {
				tempConnection = DriverManager.getConnection(mDBURL,mDBUserName, mDBPassword);
				mConnections.addElement(tempConnection);
			}
			
		} catch (Exception setupException) {
			System.err.println("Unable to setup JDBC connection pool. "+ setupException);
		}
	}

	/**      
	 * Returns a database connection from the pool or null if none is available.      	 
	 *       
	 * @return Database connection or null if none available.       
	 */
	@SuppressWarnings("resource")
	public Connection checkOut() {
		Connection dbConnection = null;
		if (mConnections.size() > 0) {
			dbConnection = (Connection) mConnections.firstElement();
			mConnections.removeElementAt(0);
			try {
				if (dbConnection.isClosed()) {
					dbConnection = checkOut();
				} else {
					dbConnection.getMetaData().getTableTypes();
				}
			} catch (SQLException sqlE) {
				dbConnection = checkOut();
			}
		}
		return dbConnection;
	}

	/** 
	 * Check a connection back into the pool.       
	 * @param pConnection Database connection to return to the pool.      
	 */
	public void checkIn(Connection pConnection) {
		if(pConnection != null) {
			try {
				if(!pConnection.isClosed()) {
					mConnections.addElement(pConnection);
				}
			} catch(SQLException sql) {
				System.out.println("Do nothing");
			}
		}
	}
	
	private void checkInConn(Connection con) {
		if(con != null) {
			try {
				if(!con.isClosed()) {
					mConnections.addElement(con);
				}
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Do Nothing");
			}
		}
	}

	/**       
	 * Shutdown the connection pool by closing all connections and de-registering       
	 * the JDBC driver.       
	 */
	public synchronized void shutdown() {
		
		Connection tempConnection = null;
		ListIterator<Connection> ConnectionIterator = mConnections.listIterator();
		try {
			
			while (ConnectionIterator.hasNext()) {
				tempConnection = (Connection) ConnectionIterator.next();
				tempConnection.close();
			}
			ConnectionIterator = null;
			mConnections.removeAllElements();
			DriverManager.deregisterDriver(mDBDriver);
			
		} catch (SQLException sqlE) {
			System.err.println("Unable to de-register the JDBC driver.");
		}
		mInstance = null;
	}
}
