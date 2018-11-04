package com.src.design.creational.abstractfactory;

public class MainClass {
	public static void main(String[] args) {
		AbstractFactory abstractFactory = FactoryProducer.getFactory("Shape");
		Shape shape = abstractFactory.getShape(new Circle());
		shape.draw();
	}
}
