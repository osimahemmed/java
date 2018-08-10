package com.oracle.xml;

class A{
	public void print(){
		System.out.println("In A");
	}
}
class B extends A{
	public void print(){
		System.out.println("In B");
	}
}

public class TestInr {

	public static void main(String[] args) {
		A a  = new A();
		B b = new B();
		a.print();
		b.print();


	}

}
