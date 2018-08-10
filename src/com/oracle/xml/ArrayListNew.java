package com.oracle.xml;



//This is a simplified version of "java.util.ArrayList" 
import java.io.*;
public class ArrayListNew<T> {
//ArrayListNews are like Vectors but unsynchronized (so for use in one thread only)
 protected int count ;           // Number of elements in ArrayListNew
             
 protected T contents[];     // array of stored values
 protected static int DEFAULT_CAPACITY=10;

 public ArrayListNew() {               // no-arg constructor sets an
    //count = 0;                 // initial capacity of 10
    contents =(T[]) new Object[DEFAULT_CAPACITY];
 }
 public ArrayListNew(int initCapacity) {
    //count = 0;                 // initial capacity specified
    contents =(T[]) new Object[initCapacity];
 }

//Before adding a new element to the end of the array, "add" 
//checks to see if the array is already full and expands it if 
//necessary

 public void add (T newElem) {
    if (count == contents.length) {
    	System.out.println("count"+count);
       T temp[] = contents;
       contents = (T[]) new Object[ 2*count ] ;
       System.out.println("count"+count);
	//System.arrayCopy could be used in place of for-loop
       for ( int i = 0; i < count; i++ ) 
	    contents[i] = temp[i] ;// leave temp for garbage collector
    }
    contents[count++] = newElem ;
 }

 public T get(int index) {//unchecked exception does not need throws!
    if (index < 0 || index >= count )
       throw new IndexOutOfBoundsException("ArrayListNew:"+index) ;
    return /* (T) */ contents[index] ;
 }

 public int size() { return count; }

 public T remove (int index) {//unchecked exception does not need throws!
    if (index < 0 || index >= count )
       throw new IndexOutOfBoundsException("ArrayListNew:"+index) ;
    T temp =/* (T) */contents[index];
    for (int j = index; j < count-1; j++) 
       contents[j] = contents[j+1] ;
    count-- ;
    return temp;
 }

 public int indexOf( T key ) {
    for (int j = 0 ; j < count ; j++ ) 
       if ( contents[j].equals(key) ) return j ;
    return -1 ;
 }
 public String toString() {
  StringBuffer res = new StringBuffer("[");
  for (int i = 0; i < this.size()-1; i++)
    res.append( this.get(i).toString() ).append( ", " );
  return res.append(get(size()-1).toString()).append("]").toString();
 }
 
 public static void main (String args[]) {
	      
	      ArrayListNew<String> v = new ArrayListNew<String>();
	      v.add("PRATAP");
	      v.add("OSIM");
	      v.add("SWAPAN");
	      for(int i = v.size()-1; i >= 0; i--)
	        System.out.println("iam here "+v.get(i));
	        System.out.println("Here"+v);
	   }

}
