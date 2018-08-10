package com.java.countdown.deadlock;

import java.util.concurrent.CountDownLatch;

public class Locker extends Thread {
	
	CountDownLatch latch;
	Object obj1;
	Object obj2;
	
	public Locker(Object obj1, Object obj2, CountDownLatch latch) {
		this.obj1 = obj1;
		this.obj2 = obj2;
		this.latch = latch;
	}
	
	@Override
	public void run() {
		synchronized (obj1) {
			latch.countDown();
			try {
				latch.await();
			} catch (Exception e) {
				// TODO: handle exception
			}
			synchronized (obj2) {
				System.out.println();
			}
		}
		
		
	}

}
