package com.src.design.behavioural.strategy;

public class AmexCreditCard extends CardStrategy {

	@Override
	boolean isValid(String cardNumber) {
		if (cardNumber.length() == 15)
			return true;
		if (cardNumber.startsWith("34") || cardNumber.startsWith("32"))
			return true;
		if (lunhAlgo(cardNumber))
			return true;
		return false;
	}

}
