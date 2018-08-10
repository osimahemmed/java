package com.sape.thread;

import java.lang.Thread.UncaughtExceptionHandler;

public class ThreadExceptionHandler implements UncaughtExceptionHandler {

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println(this + " Caught Exception in Thread - \"" + 
							t.getName() + "\" --> " + e);
		
	}

	

}
