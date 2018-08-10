package com.oracle.xml;

import java.util.ArrayList;
public class CompareList
	{

	public static void main(String[] args){
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
			list1.add(10);
			list1.add(20);
			list1.add(30);
			list1.add(40);
			
			list2.add(11);
			list2.add(10);
			list2.add(12);
			list2.add(13);
			list2.add(14);
			list2.add(15);
			list2.add(16);
			list2.add(17);
			list2.add(18);
			list2.add(19);
			list2.add(20);

		for (int i=0;i<list2.size();i++) {
			for (int j=0;j<list1.size(); j++) {
				if(list2.get(i).equals(list1.get(j)))
					System.out.println("equals..: " +list1.get(j));
				}
			}
	}
}
