package com.src.design.behavioural.template;

public abstract class TemplateOrder {
	public boolean isGift;

	abstract void doOrder();

	abstract void doWrap();

	abstract void doDispatch();

	public void doAction() {
		doOrder();
		if (isGift)
			doWrap();
		doDispatch();
	}

}
