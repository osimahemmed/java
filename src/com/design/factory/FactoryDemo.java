package com.design.factory;

public class FactoryDemo {

	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		
		IShape shape = factory.getShape("Circle");
		shape.draw();
		
		IShape shape1 = factory.getShape("Triangle");
		shape1.draw();
	}

}
