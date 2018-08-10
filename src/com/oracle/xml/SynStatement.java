package com.oracle.xml;

class Share1 extends Thread{
	  static String msg[]={"Welcome", "to", "Oracle", "Bangalore"};
	  Share1(String threadname){
	    super(threadname);
	  }
	  public void run(){
	    display(getName());
	  }
	  public void display(String threadN){
	         synchronized(this){ 
	    for(int i=0;i<=msg.length-1;i++)
	      System.out.println(threadN+msg[i]);
	      try{
	      this.sleep(3000);
	  }catch(Exception e){}
	    }
	}
}
	public class SynStatement {
	  public static void main(String[] args){
	    Share1 t1=new Share1("Thread One: ");
	    t1.start();
	    Share1 t2=new Share1("Thread Two: ");
	    t2.start();
	}
}