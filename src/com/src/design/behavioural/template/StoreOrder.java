package com.src.design.behavioural.template;

public class StoreOrder extends TemplateOrder {

	@Override
	void doOrder() {
		System.out.println("Ordered From Store");

	}

	@Override
	void doWrap() {
		System.out.println("Wrapped From Store");

	}

	@Override
	void doDispatch() {
		System.out.println("Dispatched From Store");

	}

}
