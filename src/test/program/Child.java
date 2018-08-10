package com.test.program;

class Child extends Base {
	
	int c = 20;
	
	Child(){
		System.out.println("Child Class");
		System.out.println(super.b);
	}
	
}