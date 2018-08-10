package com.design.strategy;

import java.util.HashSet;
import java.util.Set;

public class StrategyDemoPattern {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		set.add("23");
		
		Context context = new Context(new Add());
		
		System.out.println("10+5 = " + context.executeStrategy(10, 5));

	}

}
