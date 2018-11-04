package com.src.design.behavioural.strategy;

public class CreditCard {
	public CreditCard(CardStrategy cardStrategy, String cardNumber, String date, String cvv) {
		super();
		this.setCardStrategy(cardStrategy);
		this.cardNumber = cardNumber;
		Date = date;
		this.cvv = cvv;
	}

	private CardStrategy cardStrategy;

	boolean isValid() {
		return cardStrategy.isValid(this.cardNumber);
	}

	public CreditCard(String cardNumber, String date, String cvv) {
		super();
		this.cardNumber = cardNumber;
		Date = date;
		this.cvv = cvv;
	}

	private String cardNumber;
	private String Date;
	private String cvv;

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public CardStrategy getCardStrategy() {
		return cardStrategy;
	}

	public void setCardStrategy(CardStrategy cardStrategy) {
		this.cardStrategy = cardStrategy;
	}
}
