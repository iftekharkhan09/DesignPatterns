package com.src.design.creational.factory;

public class Shapefactory {
	public static Shape getInstance(ShapeType shapeType) {
		switch (shapeType) {
		case RECTANGLE:
			return new Rectangle();
		case CIRCLE:
			return new Circle();
		default:
			break;
		}
		return null;
	}
}
