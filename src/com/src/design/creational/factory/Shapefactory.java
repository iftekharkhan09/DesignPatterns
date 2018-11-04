package com.src.design.creational.factory;

public class Shapefactory {
	public Shape getInstance(Shape shape) {
		if (shape instanceof Circle)
			return new Circle();
		else if (shape instanceof Rectangle)
			return new Rectangle();
		return null;
	}
}
