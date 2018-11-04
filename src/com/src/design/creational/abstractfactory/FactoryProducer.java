package com.src.design.creational.abstractfactory;

public class FactoryProducer {

	public static AbstractFactory getFactory(String choice) {
		if (choice.equals("Shape"))
			return new ShapeFactory();
		else
			return new ColorFactory();
	}
}
