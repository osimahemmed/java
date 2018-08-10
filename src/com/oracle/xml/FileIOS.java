package com.oracle.xml;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileIOS {

	public static void main(String[] args) throws Exception {
		String str  ="oracle bangalore ad ada dadadajjjjjjjjjjjjjjjjjjjj" +
				"adddddddddddddddddddddddddddddddddddddddddddddd";
		byte b[] = str.getBytes();
		OutputStream Os = new FileOutputStream("C://file1.txt");
		Os.write(b);
		Os.close();
		System.out.println("written to file1.txt");

	}

}
