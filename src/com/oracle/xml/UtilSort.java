package com.oracle.xml;


import java.util.Iterator;
import java.util.TreeSet;

public class UtilSort {


	public static void main(String args[]){
		
		TreeSet<Emp1> listEmp = new TreeSet<Emp1>();
		
		listEmp.add(new Emp1(5, "Frank Benzamin", 28));        
		listEmp.add(new Emp1(1, "Jorge Abraham", 19)); 
		listEmp.add(new Emp1(6, "Bill Watson", 34)); 
		listEmp.add(new Emp1(3, "Michel Clark", 10));
		listEmp.add(new Emp1(7, "John Simpson", 8));
		listEmp.add(new Emp1(4, "Clerk James",16 ));
		listEmp.add(new Emp1(8, "Lee Bret", 40)); 
		listEmp.add(new Emp1(2, "Mark Waugh", 30));
		
		Iterator<Emp1> itr = listEmp.iterator();
		while(itr.hasNext()){
			Object name = itr.next();
			System.out.println(name+ " ");
		}
		/*
		for(int i=0;i<listEmp.size();i++){
			Emp1 emp4 = (Emp1)listEmp.last();
			System.out.println(emp4.getName()+ " " + emp4.getEmpId()+ " " +emp4.getAge());
		}
		*/
	
	}

}
