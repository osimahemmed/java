package com.sape.custom.with.resources;

public class Foo implements AutoCloseable {
	
	public Foo() {
		System.out.println("Inside Foo class");
	}
	
	public void doSomething() throws Exception {
		throw new Exception("Exception from Foo doSomething() method");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("Closing Foo");
		throw new Exception("Unable to close FOO");
	}

}
