package com.design.chain.responsibility;

public interface DispenseChain {
	
	void setNextChain(DispenseChain chain);
	void dispense(Currency cur);

}
