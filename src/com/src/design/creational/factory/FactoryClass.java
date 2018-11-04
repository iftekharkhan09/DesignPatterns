package com.src.design.creational.factory;

public class FactoryClass {
	public Shape getInstance(Shape shape) {
		if (shape instanceof Circle)
			return new Circle();
		else if (shape instanceof Circle)
			return new Rectangle();
		return null;
	}
}
