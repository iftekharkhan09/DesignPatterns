package com.src.design.creational.abstractfactory;

public class ColorFactory extends AbstractFactory {

	@Override
	Shape getShape(Shape shape) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Color getColor(Color color) {
		if (color instanceof RedColor)
			return new RedColor();
		else if (color instanceof GreenColor)
			return new GreenColor();
		return null;
	}

}
