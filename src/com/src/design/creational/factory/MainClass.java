package com.src.design.creational.factory;

public class MainClass {
	public static void main(String[] args) {
		Shape shape = new Rectangle();
		Shape s = new Shapefactory().getInstance(shape);
		s.draw();
	}
}