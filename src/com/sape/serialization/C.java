package com.sape.serialization;

import java.io.Serializable;

public class C extends B implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int k;
	public C(int i, int j, int k) {
		super(i, j);
		this.k = k;
		k = 300;
	}

}
