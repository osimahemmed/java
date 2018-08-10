package com.sape.immutable.map;

public class Immutable extends MyImmutableClass {

	private String s;
	
	public Immutable(String s) {
		this.s = s;
	}
	
	public String getS() {
		return s;
	}
	
	public static void main(String[] args) {
		Immutable imm = new Immutable("osim");
		System.out.println(imm.getS());
	}
}
