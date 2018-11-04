package com.src.design.creational.abstractfactory;

public class ShapeFactory extends AbstractFactory {

	Shape getShape(Shape shape) {
		if (shape instanceof Rectangle)
			return new Rectangle();
		else if (shape instanceof Circle)
			return new Circle();
		return null;
	}

	Color getColor(Color color) {
		return null;
	}

}
