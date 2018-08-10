package com.oracle.xml;

import java.io.File;
import java.io.IOException;

public class CTFile {
	public static void main(String args[]){
		File tempFile = null;
		try{
			tempFile = File.createTempFile("C:\\images\\MyFile.txt", ".tmp");
			System.out.println("Done");
			System.out.println(tempFile.getAbsolutePath());
			
		}catch(IOException e){
			System.err.println("Cannot create temp file: " +e.getMessage());
		}finally{
			if(tempFile!=null){
				
			}
		}
	}

}
