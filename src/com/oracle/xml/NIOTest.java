package com.oracle.xml;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIOTest {
	public static void main(String args[]) throws Exception	{
		FileInputStream fis = new FileInputStream("C:\\file1.txt");
		FileChannel fc = fis.getChannel();
		
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		fc.read(buffer);
		long size = fc.size();
		System.out.println(size);
		if(fc.read(buffer)==-1){
			System.out.println("heyyyyyyy");
		}
		
	}
}
