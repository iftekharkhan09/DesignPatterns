package com.src.design.creational.factory;

public class MainClass {
	public static void main(String[] args) {
		Shape shape = new Circle();
		Shape s = new FactoryClass().getInstance(shape);
		s.draw();
	}
}