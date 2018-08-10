package com.oracle.xml;

import java.io.*;   
public class TestExec {   
    public static void main(String[] args) throws InterruptedException {   
    	/*
    	String destDir = "C:\\images";
    	String cmd[] = new String[2];
    	//cmd[0] = "cmd/c mkdir + destDir";
    	cmd[0] = "cmd /c mkdir " + destDir;

    	Runtime rt= Runtime.getRuntime();
    	try{
    		rt.exec(cmd[0]);
    		System.out.println("Execution done");
    	}catch (IOException e) {
			e.printStackTrace();
		}
    	*/
         try {   
        	
            Process p = Runtime.getRuntime().exec("cmd /C dir");  
            System.out.println("test");
            BufferedReader in = new BufferedReader(   
                                new InputStreamReader(p.getInputStream()));   
            String line = null;   
            while ((line = in.readLine()) != null) {   
                System.out.println("Printing.......... " + line);   
                
            }   
            System.out.println("Wait for.. ");
        } catch (IOException e) {   
            e.printStackTrace();   
        }
        
    	
    }   
}
