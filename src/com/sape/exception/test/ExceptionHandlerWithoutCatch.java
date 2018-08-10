package com.sape.exception.test;

public class ExceptionHandlerWithoutCatch {

	public static void main(String[] args) throws NewException {
		
		try {
			throw new NewException("new exception");
		} finally {
			System.out.println("in finally block");
		}
	}

}
