package com.oracle.xml;

public class SplitEx {


	public static void main(String[] args) throws InterruptedException {
		String str = "one~two~three";
		String[] temp;
		String delimeter = "~";
		temp = str.split(delimeter);
	
		//String on = temp[0];
		//String tw = temp[1];
		//String th = temp[2];
		for(int i=0;i<temp.length;i++){
			Thread.sleep(1000);
			System.out.println(temp[i]);
			
		}
		//System.out.println(th);
		
		 /* str = "four.five.six";  
		  delimeter = "\\.";  
		  temp = str.split(delimeter,3);  
		  for(int i =0; i < temp.length ; i++)    
		  System.out.println(temp[i]);
		*/

	}

}
