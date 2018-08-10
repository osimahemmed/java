package com.sape.static1.test;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class PriorityQueueExample {

	public static void main(String[] args) {
		
		//natural ordering example of priority queue
		Queue<Integer> integerPriorityQueue = new PriorityQueue<>(7);
		Random rand = new Random();
		for(int i = 0 ; i < 7; i++){
			integerPriorityQueue.add(new Integer(rand.nextInt(100)));
		}
		for(int i = 0; i < 7; i++){
			Integer in = integerPriorityQueue.poll();
			System.out.println("Processing Integer:"+in);
		}
		
		//PriorityQueue example with Comparator
		Queue<Integer> customerPriorityQueue = new PriorityQueue<>(10,idComparator);
		addDataToQueue(customerPriorityQueue);
		
		pollDataFromQueue(customerPriorityQueue);
		
	}
	
	//Comparator anonymous class implementation
	public static Comparator<Integer> idComparator = new Comparator<Integer>(){
		
		@Override
		public int compare(Integer c1, Integer c2) {
            return c1 - c2;
        }
	};

	//utility method to add random data to Queue
	private static void addDataToQueue(Queue<Integer> customerPriorityQueue) {
		Random rand = new Random();
		for(int i = 0; i < 7; i++){
			Integer id = rand.nextInt(100);
			customerPriorityQueue.add(id);
		}
	}
	
	//utility method to poll data from queue
	private static void pollDataFromQueue(Queue<Integer> customerPriorityQueue) {
		while(true){
			Integer cust = customerPriorityQueue.poll();
			if(cust == null) break;
			System.out.println("Processing Customer with ID= "+cust);
		}
	}

}
