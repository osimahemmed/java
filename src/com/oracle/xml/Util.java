package com.oracle.xml;

import java.util.*;

public class Util {

	public static ArrayList<Employee> getEmployees(){
		
		ArrayList<Employee> listEmp = new ArrayList<Employee>();
		
		listEmp.add(new Employee(5, "Frank Benzamin", 28));        
		listEmp.add(new Employee(1, "Jorge Abraham", 19)); 
		listEmp.add(new Employee(6, "Bill Watson", 34)); 
		listEmp.add(new Employee(3, "Michel Clark", 10));
		listEmp.add(new Employee(7, "John Simpson", 8));
		listEmp.add(new Employee(4, "Clerk James",16 ));
		listEmp.add(new Employee(8, "Lee Bret", 40)); 
		listEmp.add(new Employee(2, "Mark Waugh", 30));
		listEmp.add(new Employee(9, "Mark Waugh", 12));
		
		
		
		/*
		for(int i=0;i<listEmp.size();i++){
			Employee emp4 = (Employee)listEmp.get(i);
			System.out.println(emp4.getName()+ " " + emp4.getEmpId()+ " " +emp4.getAge());
		}
		*/
		System.out.println(listEmp);
		
		return listEmp;
	}
	
}
