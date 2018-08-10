package com.design.singleton;


public class LazySingleton {
	
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 4720735313563383966L;
	
	private static volatile LazySingleton instance = null;
	private LazySingleton(){}
	
	public static LazySingleton getInstance() {
		if(instance == null) {
			synchronized (LazySingleton.class) {
				if(instance == null) {
					instance = new LazySingleton();
				}
			}
		}
		
		return instance;
	}
	
	private Object readResolve() {
		return instance;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return new CloneNotSupportedException();
	}
}
