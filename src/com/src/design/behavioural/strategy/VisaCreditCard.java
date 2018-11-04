package com.src.design.behavioural.strategy;

public class VisaCreditCard extends CardStrategy {
	@Override
	boolean isValid(String cardNumber) {
		if (cardNumber.length() == 14)
			return true;
		if (cardNumber.startsWith("12") || cardNumber.startsWith("32"))
			return true;
		return false;
	}
}
