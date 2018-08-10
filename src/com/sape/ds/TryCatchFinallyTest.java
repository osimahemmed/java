package com.sape.ds;

public class TryCatchFinallyTest {

	public static void main(String[] args) throws Exception {
		//int a  = method1();
		//method1();
		//System.out.println(a);
		
		TryCatchFinallyTest b = null;
		//try {
			int c = b.method1();
			System.out.println(c);
		/*} catch (Exception e) {
			System.out.println(e.getMessage());
		}*/
		
		method2();
		
	}

	private static void method2() {
		System.out.println("in side method2");
		
	}

	private int method1() {
		try {
			return 1;
			//System.out.println("in try block");
		} finally {
			return 2;
			//System.out.println("in finally block");
		}
		
		//System.out.println("after finally");
		
	}

}
