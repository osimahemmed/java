package com.oracle.xml;

class ExThread extends Thread {
	char c;
		ExThread(char c){
		this.c = c;
		}
	public void run(){
		for(int i =0;i<100;i++){
			System.out.println(c);
			try{
				sleep((int)(Math.random()*10));
			}catch (InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
		}
	}
}
class Thread1{
	public static void main(String args[]){
		ExThread et1 = new ExThread('*');
		ExThread et2 = new ExThread('!');
		et1.start();
		et2.start();
	}
}
