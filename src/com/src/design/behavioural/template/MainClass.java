package com.src.design.behavioural.template;

public class MainClass {
	public static void main(String[] args) {
		// Web Order
		TemplateOrder webOrder = new WebOrder();
		// webOrder.isGift = true;
		webOrder.doAction();

		// Store Order
		TemplateOrder storeOrder = new StoreOrder();
		// storeOrder.isGift = true;
		storeOrder.doAction();
	}
}
