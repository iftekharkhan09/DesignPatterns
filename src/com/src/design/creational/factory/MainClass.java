package com.src.design.creational.factory;

public class MainClass {
	public static void main(String[] args) {
		Shape s = Shapefactory.getInstance(ShapeType.RECTANGLE);
		s.draw();
	}
}