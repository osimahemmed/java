package com.sape.marker;

public class Bar implements MarkerFoo {

	private final int i;
	
	public Bar(int i) {
		this.i = i;
	}
	
	public static void main(String[] args) {
		MarkerFoo o = new Bar(10);
		
		if(o instanceof MarkerFoo) {
			System.out.println("It's a foo");
		}
	}
}
