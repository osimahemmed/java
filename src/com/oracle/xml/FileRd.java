package com.oracle.xml;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileRd {
	
	public static void main(String args[]) {
		FileInputStream fstream = null;
		DataInputStream in = null;
		String strLine = null;
		try {
			fstream = new FileInputStream("D:\\Core_pro\\src\\com\\oracle\\xml\\FileRd.java");
			in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			while((strLine = br.readLine()) != null){
				System.out.println(strLine);
			}			
		}catch (Exception e) {
			System.err.println("Error " +e.getMessage());
			
		}finally{
			try{
				in.close();
				fstream.close();
				
			}catch(Exception e){}
		}
		
		
	}

}
