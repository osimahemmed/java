package com.oracle.xml;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class contain implements Serializable{
	int containVersion = 11;
}

public class SerialTest implements Serializable {
	int version = 66;
	contain con = new contain();
	public int getVersion(){
		return version;
	}

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("C:\\temp.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		SerialTest test = new SerialTest();
		oos.writeObject(test);
		oos.flush();
		oos.close();

	}

}
