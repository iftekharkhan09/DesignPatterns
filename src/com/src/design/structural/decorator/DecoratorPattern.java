package com.src.design.structural.decorator;

public class DecoratorPattern {
	public static void main(String[] args) {
		Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
		System.out.println(sandwich.make());
	}
}