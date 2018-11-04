package com.src.design.creational.singleton;

public class SingletonClass {
	private static SingletonClass instance = null;

	private SingletonClass() {
		if (null != instance)
			throw new RuntimeException();
	}

	public static SingletonClass getInstance() {
		if (null == instance) {
			synchronized (SingletonClass.class) {
				if (null == instance)
					instance = new SingletonClass();
			}
		}
		return instance;
	}
}
