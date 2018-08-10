package com.design.factory;

public class ShapeFactory {
	
	public IShape getShape(String shapeType) {
		if(null == shapeType) {
			return null;
		} if(shapeType.equalsIgnoreCase("Circle")) {
			return new Circle();
		} else if(shapeType.equalsIgnoreCase("Triangle")) {
			return new Triangle();
		}
		
		return null;
	}
	
}
