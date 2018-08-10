package com.sape.thread.pool;

public class WorkerThread implements Runnable {
	
	private String message;
	public WorkerThread(String str) {
		this.message  =str;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Start message =" +message);
		processMessage();
		System.out.println(Thread.currentThread().getName() + " completed");

	}
	
	private void processMessage() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
