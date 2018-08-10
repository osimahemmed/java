package com.oracle.xml;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main1 {
  public static void main(String[] argv) {
    getXMLFiles(new File("C:\\images"));
  }

  public static File[] getXMLFiles(File folder) {
	  
	System.out.println("folder is "+ folder);
    List<File> aList = new ArrayList<File>();

    File[] files = folder.listFiles();
    System.out.println("len " +files.length);
    for (File pf : files) {

      if (pf.isFile() && getFileExtensionName(pf).indexOf("xml") != -1) {
        aList.add(pf);
      }
    }
    System.out.println("aList to array " +aList.toArray(new File[aList.size()]));
    return aList.toArray(new File[aList.size()]);
  }

  public static String getFileExtensionName(File f) {
    if (f.getName().indexOf(".") == -1) {
      return "";
    } else {
    	System.out.println(f.getName().substring(f.getName().length() - 3, f.getName().length()));
      return f.getName().substring(f.getName().length() - 3, f.getName().length());
    }
  }
}