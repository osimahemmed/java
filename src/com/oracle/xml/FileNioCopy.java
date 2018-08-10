package com.oracle.xml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class FileNioCopy {
	public static void copy(File sourceFile, File destFile) throws IOException{
		if(!destFile.exists()){
			destFile.createNewFile();
		}
		FileChannel source =null;
		FileChannel destination = null;
		try{
			FileInputStream fin = new FileInputStream(sourceFile);
			source =fin.getChannel();
			FileOutputStream out = new FileOutputStream(destFile);
			destination   = out.getChannel();
			destination.transferFrom(source, 0, source.size());
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
	public static void main(String args[]) throws IOException{
		System.out.println("iam in 1");
		File src = new File("C:\\file1.txt");
		File des = new File("C:\\file3.txt");
		System.out.println("iam in 2");
		copy(src, des);
		System.out.println("iam in 1");
	}

}
