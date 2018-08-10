package com.sape.immutable.map;

import java.util.HashMap;
import java.util.Map.Entry;

public final class ImmutableMap {

	public static void main(String[] args) {
		int i = 6;
	    String s = "!am@John";
	    HashMap<String, String> h = new HashMap<String, String>();

	    h.put("Info1", "!am@John");
	    h.put("Inf02", "!amCrazy6");

	    ImmutableMap imm = new ImmutableMap(i, s, h);
	    
	    System.out.println("Original values : " + imm.getI() + " :: " + imm.getS() + " :: " + imm.getH());

	    h.put("Inf02", "!amCraxy7");

	    System.out.println("After local changes : " + imm.getI() + " :: " + imm.getS() + " :: " + imm.getH());
	    
	    HashMap<String, String> hmTest = imm.getH();
        hmTest.put("Inf02", "!amCraxy7");
        System.out.println("After ancestral changes : " + imm.getI() + " :: " + imm.getS() + " :: " + imm.getH());
	    
	    /*System.out.println(imm.getS() + imm.getI());
	    for (Entry<String, String> entry: imm.getH().entrySet())
	      System.out.println(entry.getKey() + " --- " + entry.getValue());*/

	}
	
	private final int i;
	private final String s;
	private final HashMap<String, String> h1;
	
	public ImmutableMap(int i, String s, HashMap<String, String> h) {
		this.i = i;
		this.s = s;
		this.h1 = new HashMap<String, String>(h);
		
		/*for(Entry<String, String> entry : h.entrySet()) {
			this.h1.put(entry.getKey(), entry.getValue());
		}*/
	}

	public int getI() {
		return i;
	}
	public String getS() {
		return s;
	}
	public HashMap<String, String> getH() {
		return new HashMap<String, String>(h1);
	}
}
