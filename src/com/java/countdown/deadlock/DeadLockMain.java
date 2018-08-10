package com.java.countdown.deadlock;

import java.util.concurrent.CountDownLatch;

public class DeadLockMain {

	public static void main(String[] args) {
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		CountDownLatch latch = new CountDownLatch(2);
		
		new Locker(obj1, obj2, latch).start();
		new Locker(obj2, obj1, latch).start();

	}

}
