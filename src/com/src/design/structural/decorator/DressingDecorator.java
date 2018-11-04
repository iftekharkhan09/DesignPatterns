package com.src.design.structural.decorator;

public class DressingDecorator extends SandwichDecorator {

	public DressingDecorator(Sandwich customSandwich) {
		super(customSandwich);
	}

	@Override
	public String make() {
		return customSandwich.make() + addValue();
	}

	private String addValue() {
		return " dress";
	}

}
