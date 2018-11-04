package com.src.design.creational.factory;

public interface Shape {
	public void draw();

	default public void drawing() {
		this.draw();
	}

}
