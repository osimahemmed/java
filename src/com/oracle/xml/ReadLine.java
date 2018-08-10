package com.oracle.xml;

import java.io.*;

public class ReadLine {
  public static void main(String args[]) {
      
      String filepath = "D:\\code\\BigFile.txt";
      try {
      FileReader fr = new FileReader(filepath);
      BufferedReader br = new BufferedReader(fr);
      int cnt = 0;
      while ( br.readLine() != null){
      cnt++;
      }
      br.close();
      System.out.println(cnt);
    }
    catch (IOException e) {
      System.err.println(e);
    }
  }
}

