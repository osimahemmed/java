package com.oracle.xml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile1 {

	public static void main(String args[])throws IOException{
		File f; 
		try{
			f= new File("C:\\images\\myfile.txt");
			if(!f.exists()&& f.length()<0)
				System.out.println("files is not exist");
			else{
				FileInputStream fin = new FileInputStream(f);
				byte b;
				do{
					b= (byte)fin.read();
					System.out.print((char)b);
				}
				while(b!=-1);
				fin.close();
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("Getting error message " + e.getMessage());
		}
	}

}
