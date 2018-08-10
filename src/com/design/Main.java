package com.design;

import java.math.BigInteger; 
import java.sql.Timestamp; 
 
 
public class Main 
{  
    public static void main(String[] args) throws InterruptedException  
    { 
        final Timestamp t1; 
        final Timestamp t2; 
 
        t1 = new Timestamp(System.currentTimeMillis()); 
        Thread.sleep(10000); 
        t2 = new Timestamp(System.currentTimeMillis()); 
 
        System.out.println(t1); 
        System.out.println(t2); 
        int diffTime   = t2.getSeconds()-t1.getSeconds(); 
        System.out.println(diffTime); 
    } 
} 

