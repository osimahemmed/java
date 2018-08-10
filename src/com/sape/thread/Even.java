package com.sape.thread;

public class Even implements Runnable {
	
	Object mutex;
	public Even(Object mutex) {
		this.mutex = mutex;
	}

	@Override
	public void run() {
		for(int i = 2; i <= 10; i = i+2) {
			synchronized (mutex) {
				while(!PrintEvenOdd.printFlag) {
					try {
						mutex.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				PrintEvenOdd.printFlag = !PrintEvenOdd.printFlag;
				mutex.notify();
			}
		}
		
	}

}
