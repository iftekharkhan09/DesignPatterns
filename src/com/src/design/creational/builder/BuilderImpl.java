package com.src.design.creational.builder;

public class BuilderImpl {
	public static void main(String[] args) {
		LunchOrder.Builder builder = new LunchOrder.Builder();
		builder.addbread("Wheat").condiments("condi").meat("red");
		System.out.println(builder);
		System.out.println(builder.build().getMeat());
	}
}
