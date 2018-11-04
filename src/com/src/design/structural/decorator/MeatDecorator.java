package com.src.design.structural.decorator;

public class MeatDecorator extends SandwichDecorator {

	public MeatDecorator(Sandwich customSandwich) {
		super(customSandwich);
	}

	@Override
	public String make() {
		return customSandwich.make() + addvalue();
	}

	private String addvalue() {
		return " meat";
	}

}
