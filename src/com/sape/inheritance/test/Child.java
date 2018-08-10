package com.sape.inheritance.test;

public class Child extends Parent {

	public static void main(String[] args) {
		
		Parent pa = new Child();
		System.out.println(pa.b);
		System.out.println(pa.c);
		System.out.println(pa.d);
		System.out.println(pa.e);

	}

}
