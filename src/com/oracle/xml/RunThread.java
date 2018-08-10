package com.oracle.xml;

class MyThread2 extends Thread{
	String na = null;
	MyThread2(String str){
		na = str;
		start();
	}
	public void run(){
		System.out.println(na);
	}
}

class RunThread {
public static void main(String args[]){
	MyThread2 th = new MyThread2("Running the thread..........");
	MyThread2 th1 = new MyThread2("Running the ..........");
	}
}
