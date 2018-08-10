package com.oracle.xml;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class FileW {

	public static void main(String args[])throws IOException{
		System.out.println("Enter a file name :");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		File f = new File(in.readLine());
		if(f.exists()){
			FileReader fr = new FileReader(f);
			LineNumberReader ln = new LineNumberReader(fr);
			int count = 0;
			while(ln.readLine()!=null){
				count++;
			}
			System.out.println("Number of lines are "+count);
			ln.close();
			//long file_size = f.length();
			//System.out.println("Size of the file is " + file_size);
		}else{
			System.out.println("File does not exist");
			System.exit(0);
		}
	}
	
}
