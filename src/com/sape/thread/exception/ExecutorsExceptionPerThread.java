package com.sape.thread.exception;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsExceptionPerThread {

	public static void main(String[] args) {
		
		String currentThreadName = Thread.currentThread().getName();
		System.out.println("[" + currentThreadName + " ] main thread starts here...");
		ExecutorService execService = Executors.newCachedThreadPool(new ThreadFactoryWithExceptionHandler());
		
		execService.execute(new ExceptionThrowingTask());
		execService.execute(new ExceptionThrowingTask1());
		execService.execute(new ExceptionThrowingTask());
		execService.execute(new ExceptionThrowingTask());
		execService.shutdown();
		
		System.out.println("[" + currentThreadName + " ] main thread ends here....");

	}

}
