package com.oracle.xml;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadIO {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		InputStreamReader inp = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(inp);
		System.out.println("enter text");
		String str = br.readLine();
		System.out.println("entered string is");
		System.out.println(str);
		br.close();
		inp.close();

	}

}
