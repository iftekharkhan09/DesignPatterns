package com.src.design.behavioural.template;

public class WebOrder extends TemplateOrder {

	@Override
	void doOrder() {
		System.out.println("Ordered From Web");

	}

	@Override
	void doWrap() {
		System.out.println("Wrapped From Web");

	}

	@Override
	void doDispatch() {
		System.out.println("Dispatched From Web");

	}

}
