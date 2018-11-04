package com.src.design.behavioural.strategy;

public class MainClass {
	public static void main(String[] args) {
		CreditCard creditCard = new CreditCard("12345678901234", "22/4", "223");
		creditCard.setCardStrategy(new AmexCreditCard());
		System.out.println(creditCard.isValid());
	}
}
