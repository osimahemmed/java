package com.sape.thread;

import java.util.concurrent.ThreadFactory;

public class ThreadFactoryExample implements ThreadFactory {

	@Override
	public Thread newThread(Runnable r) {
		Thread t = new Thread(r);
		t.setUncaughtExceptionHandler(new ThreadExceptionHandler());
		return t;
	}

}
