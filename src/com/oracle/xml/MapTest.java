package com.oracle.xml;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		
			map.put("1", "20");
			map.put("2", "30");
			map.put("3", "40");
			
			String str1 = (String)map.get("3");
			
			System.out.println(str1);

	}

}
