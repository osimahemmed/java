package com.test.program;

public class exp {
	
	public static void main(String[] args) {
		Child child = new Child();
		C c = new C(child);
		System.out.println(child.b);
		
	}
}