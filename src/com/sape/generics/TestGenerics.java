package com.sape.generics;

import java.util.ArrayList;
import java.util.List;

public class TestGenerics {

	public static void main(String[] args) {
		
		List<? extends Number> listA = new ArrayList<>();
		
		/*listA.add(new Integer(4));
		listA.add(new A());
		A a = new A();
		B b = new B();
		listA.add(a);*/

	}

}
