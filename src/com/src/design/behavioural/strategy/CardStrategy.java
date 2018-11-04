package com.src.design.behavioural.strategy;

public abstract class CardStrategy {
	abstract boolean isValid(String cardNumber);

	public boolean lunhAlgo(String cardNo) {
		int nDigits = cardNo.length();

		int nSum = 0;
		boolean isSecond = false;
		for (int i = nDigits - 1; i >= 0; i--) {

			int d = cardNo.charAt(i) - 'a';

			if (isSecond == true)
				d = d * 2;
			nSum += d / 10;
			nSum += d % 10;

			isSecond = !isSecond;
		}
		return (nSum % 10 == 0);

	}
}
