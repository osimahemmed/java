package com.oracle.xml;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		
		File f;
		f= new File("C:\\images\\myfile.txt");
		if(!f.exists()){
			f.createNewFile();
			System.out.println("New file created");
			System.out.println("absolute path "+f.getAbsolutePath());
		}
		else{
			System.out.println("File already created.");
		}

	}

}
