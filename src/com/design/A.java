package com.design;

public class A extends TestAbs{

	@Override
	void method1() {
		System.out.println("method1");
		
	}
	
	public static void main(String [] args) {
		A a = new A();
		a.sayHello();
	}

}
