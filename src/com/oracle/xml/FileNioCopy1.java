package com.oracle.xml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class FileNioCopy1 {
	
	public static void main(String args[]) throws IOException{

		FileChannel source =null;
		FileChannel destination = null;
		try{
			FileInputStream fin = new FileInputStream("D:\\Core_pro\\src\\com\\oracle\\xml\\FileRd.java");
			source =fin.getChannel();
			//FileOutputStream out = new FileOutputStream(destFile);
			//destination   = out.getChannel();
			destination.transferFrom(source, 0, source.size());
		} catch (Exception e) {
			System.out.println("File not found exception");
		}
		finally{
			if(source!=null){
				source.close();
			}
			if(destination!=null){
				destination.close();
			}
		}
	}
}

