package com.oracle.xml;

class Test {
	int a;
	int b;
	Test(int i, int j) {
		a =i;
		b=j;
	}
	
	boolean equals(Test o) {
		if(o.a == a && o.b == b){
			return true;
		}else{
			return false;
		}
	}
}
public class PassO {
	public static void main(String args[]){
		Test ob1 = new Test(11,12);
		Test ob2 = new Test(11,12);
		Test ob3 = new Test(-4,-2);
		
		System.out.println("ob1 == ob2: " +ob1.equals(ob2));
		System.out.println("ob1 == ob3: " +ob1.equals(ob3));
		
	}
}
