package com.oracle.xml;

import java.util.Comparator;

public class EmpSortByName implements Comparator<Employee> {
	
	public int compare(Employee emp1,Employee emp2){
		
		//return -(emp1.getName().compareTo(emp2.getName()));//for descending order sorting
		return -(emp1.getAge() - emp2.getAge());
		
	}
	
	
	
}
