package com.oracle.xml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {
	public static void copy(File source, File dest) throws IOException{
		if(!dest.exists()){
			dest.createNewFile();
		}
		InputStream in  = null;
		OutputStream out = null;
		try{
			in = new FileInputStream(source);
			out = new FileOutputStream(dest);
			byte[] buf = new byte[1024];
			int len;
			while((len = in.read(buf)) > 0){
				out.write(buf, 0, len);
				System.out.println("done");
			}
		}
		finally{
			if(in!=null){
				in.close();
			}
			if(out!=null){
				out.close();
			}
		}
	}
	public static void main(String args[]) throws IOException{
		File source = new File("C:\\file1.txt");
		File dest   = new File("C:\\file2.txt");
		copy(source, dest);
	}
}
