package com.sape.immutable.map;

public class MyImmutableClass {
	
	public MyImmutableClass() {
		if(getClass() != MyImmutableClass.class) throw new IllegalStateException();
	}

}
