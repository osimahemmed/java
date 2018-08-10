package com.oracle.xml;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ChangeDate {
	public static void main(String args[]){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter file name with extn.");
			String str = br.readLine();
			System.out.println("str " +str);
			System.out.println("Enter last modified date in 'dd-mm-yyyy' format: ");
			String strDate = br.readLine();
			System.out.println("strDate " + strDate);
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			Date date = sdf.parse(strDate);
			
			File file = new File(str);
			if(file.exists()){
				file.setLastModified(date.getTime());
				System.out.println("Modification is successfully");
			}else{
				System.out.println("File does not exist");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
