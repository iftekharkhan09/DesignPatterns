package com.src.design.creational.singleton;

public class MainClass {
	public static void main(String[] args) {
		SingletonClass instance1 = SingletonClass.getInstance();
		SingletonClass instance2 = SingletonClass.getInstance();

		System.out.println(instance1);
		System.out.println(instance2);
	}
}
