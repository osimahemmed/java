package com.oracle.xml;

import java.io.*;

public class ReadStream {
  public static void main(String args[]) {
        
        String filepath = "D:\\code\\ConnectionPool.zip";
    try {
      FileInputStream fis =
          new FileInputStream(filepath);
      byte buf[] = new byte[2048];
      int cnt = 0;
      int n;
      while ((n = fis.read(buf)) != -1) {
        for (int i = 0; i < n; i++) {
          if (buf[i] == '\n')
            cnt++;
        }
      }
      fis.close();
      System.out.println(cnt);
    }
    catch (IOException e) {
      System.err.println(e);
    }
  }
}

