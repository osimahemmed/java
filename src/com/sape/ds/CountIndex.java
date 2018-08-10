package com.sape.ds;

public class CountIndex {
	
	int count, index;
	
	public CountIndex(int index) {
		this.count = 1;
		this.index = index;
	}
	
	public void incrementCount() {
		this.count++;
	}

}
