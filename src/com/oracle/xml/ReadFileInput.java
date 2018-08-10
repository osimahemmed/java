package com.oracle.xml;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * This program reads a text file line by line and print to the console. It uses
 * FileOutputStream to read the file.
 * 
 */
public class ReadFileInput {

  public static void main(String[] args) {
	  String filepath="D:\\code\\BigFile.txt";
	  System.out.println("Printing Details"+getFile(filepath));
	  }
  	  static public String getFile(String filepath){
  	  File file = new File(filepath);
	  FileInputStream fis =null;
	  BufferedInputStream bis =null;
	  DataInputStream dis =null;
	  String readLine=null;
	  
	  try{
		  fis = new FileInputStream(file);
		  bis = new BufferedInputStream(fis);
		  dis = new DataInputStream(bis);
		  
		  while(dis.available()!=0){
			  readLine = dis.readLine();
			System.out.println(readLine);
		  }
		  
	  }catch (FileNotFoundException e) {
		  	e.printStackTrace();
	}catch (IOException e) {
			e.printStackTrace();
	}
	return readLine;
	  }
} 
