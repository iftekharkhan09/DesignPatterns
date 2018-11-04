package com.src.design.creational.singleton;

public class SimpleSingleton {
	private static final SimpleSingleton instance = createInstance();

	public SimpleSingleton getInstance() {
		return instance;
	}

	public static SimpleSingleton createInstance() {
		return new SimpleSingleton();
	}

}
