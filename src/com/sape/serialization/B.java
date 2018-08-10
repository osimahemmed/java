package com.sape.serialization;


public class B extends A {

	int j;
	
	public B(int i, int j) {
		super(i);
		this.j=j;
	}
	public B() {
		i = 101;
		j = 202;
		System.out.println("B's constructor called");
	}

}
