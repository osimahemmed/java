package com.oracle.xml;

class Test2{
	
	void meth(int i, int j) {
		i*=2;
		j/=2;
	}
}
public class CallByValue {
	public static void main(String args[]){
		Test2 ob1 = new Test2();
		int a = 15;
		int b = 20;
		
		System.out.println("a and b before call : " + a + " " + b + " ");
		ob1.meth(a, b);
		
		System.out.println("a and b after cal : " + a + " " + b + " ");
	}

}
