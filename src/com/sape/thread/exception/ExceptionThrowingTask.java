package com.sape.thread.exception;

public class ExceptionThrowingTask implements Runnable {

	@Override
	public void run() {
		throw new RuntimeException();
		
	}

}
