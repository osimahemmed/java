package com.oracle.xml;

class Factorial{
	int fact(int a){
		int res;
		if(a==1){
			return 1;
		}
		else{
			res = fact(a-1)*a;
			System.out.println(" iam here "+res);
			return res;
		}
	}
}
public class Fact {
	public static void main(String args[]){
		Factorial fac = new Factorial();
		System.out.println("Factorial of 5 is : "+fac.fact(5));
	}
}
