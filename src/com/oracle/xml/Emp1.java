package com.oracle.xml;

import java.util.Comparator;

public class Emp1 implements Comparable {
	
	private int empId;
	private String name;
	private int age;
	
	public Emp1(int empId,String name,int age){
		this.empId = empId;
		this.name = name;
		this.age = age;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 1;
	}
	

}

