package com.sape.thread.exception;

public class ExceptionThrowingTask1 implements Runnable{

	@Override
	public void run() {
		
		System.out.println("I am in task1 ");
		throw new RuntimeException("getting exception");
		
	}

}
