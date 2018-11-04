package com.src.design.structural.decorator;

public abstract class SandwichDecorator implements Sandwich {
	public SandwichDecorator(Sandwich customSandwich) {
		super();
		this.customSandwich = customSandwich;
	}

	protected Sandwich customSandwich;

	 public String make() {
		return customSandwich.make();
	}
}
