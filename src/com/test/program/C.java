package com.test.program;

class C {
	
	C(Child base) {
		base.b = 15; //change value
		System.out.println(base.b);
	}
}