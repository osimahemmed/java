package com.sape.thread;

public class PrintEvenOdd {
	static boolean printFlag = false;
	public static void main(String[] args) {
		Object mutex = new Object();
		Thread even = new Thread(new Even(mutex));
		Thread odd = new Thread(new Odd(mutex));
		even.start();
		odd.start();

	}

}
