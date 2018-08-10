package com.oracle.xml;

import java.io.IOException;

public class Run {
	
	public static void main(String args[]){
		
		Runtime runtime = Runtime.getRuntime();
		try {
			runtime.exec("notepad");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
