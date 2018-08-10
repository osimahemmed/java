package com.sape.custom.with.resources;

public class CustomTryWithResouces implements AutoCloseable {

	
	public CustomTryWithResouces() {
		System.out.println("Insdie CustomTryWithResouces");
	}
	
	public void doSomeThing() {
		System.out.println("Doing something in trywithresources");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("Closed resources");
		
	}

}
