package com.sape.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {

	public static void main(String[] args) throws Exception {
		
		C c1 = new C(10, 20, 30);
		System.out.println("i = " + c1.i);
        System.out.println("j = " + c1.j);
        System.out.println("k = " + c1.k);

      //Saving of object in a file
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
             
        // Method for serialization of B's class object
        oos.writeObject(c1);
             
        // closing streams
        oos.close();
        fos.close();
             
        System.out.println("Object has been serialized");
        
     // De-Serializing B's(subclass) object 
        
        // Reading the object from a file
        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
             
        // Method for de-serialization of B's class object
        C c2 = (C)ois.readObject();
             
        // closing streams
        ois.close();
        fis.close();
             
        System.out.println("Object has been deserialized");
         
        System.out.println("i = " + c2.i);
        System.out.println("j = " + c2.j);
        System.out.println("j = " + c2.k);


	}

}
