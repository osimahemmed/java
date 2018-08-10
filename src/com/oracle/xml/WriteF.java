/*package com.oracle.xml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteF {
	public static void main(String args[]) throws IOException{
		File f;
		try{
			f = new File("C:\\images\\myfile.txt");
			FileOutputStream fos = new FileOutputStream(f);
			FileInputStream fin = new FileInputStream(f);
			byte b = new (1024);
			if(f.exists()){
				System.out.println(fin.read(b, 0,f.length()));
				//String str = "Welcome to oracle financial services software limited";
				//fos.write(str.getBytes());
				//fos.close();
				//fos.flush();
				System.out.println("Written to file");
			}
			else{
				System.out.println("File does not exist");
				}
			}
		catch (FileNotFoundException e) {
				System.out.println("Getting exception " + e.getMessage());
		}
	}

}
*/