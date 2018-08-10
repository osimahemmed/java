/*package com.oracle.xml;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployeeSort {

	public static void main(String[] args) {
		
		ArrayList<Employee> coll = new ArrayList<Employee>();
		coll = Util.getEmployees();
		
		//Collections.sort(coll);
				
		//Collections.sort(coll, new EmpSortByName());
		
		sortList(coll);
		printEmployeeList(coll);
		
	}
	private static void printEmployeeList(List<Employee> emplist){
		
		System.out.println("EmpId\tEmployee Name\tAge");
		for(Employee e:emplist){
			
			System.out.println(e.getEmpId()+"\t"+e.getName()+"\t"+e.getAge());
			
		}
		
	}
	public static ArrayList<Employee> sortList(ArrayList<Employee> list){
		//System.out.println("iamm");
		Collections.sort(list, new EmpSortByName());
		
		return list;
		
	}

}
*/