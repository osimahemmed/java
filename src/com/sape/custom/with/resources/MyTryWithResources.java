package com.sape.custom.with.resources;

public class MyTryWithResources {

	public static void main(String[] args) {
		try (CustomTryWithResouces b = new CustomTryWithResouces(); Foo f = new Foo() ){
			b.doSomeThing();
			f.doSomething();
		} catch (Exception e) {
			System.out.println("In catch " + e);
			//System.out.println(e.getSuppressed().length);
			//System.out.println("In catch supress  "+e);
		} finally {
			System.out.println("in finally block");
		}

	}

}
