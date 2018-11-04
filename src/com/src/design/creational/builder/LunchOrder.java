package com.src.design.creational.builder;

public class LunchOrder {

	public static class Builder {
		private String wheat;
		private String condiment;
		private String meat;

		public Builder() {

		}

		public Builder addbread(String bread) {
			this.wheat = bread;
			return this;
		}

		public Builder condiments(String condiment) {
			this.condiment = condiment;
			return this;
		}

		public Builder meat(String meat) {
			this.meat = meat;
			return this;
		}

		public LunchOrder build() {
			return new LunchOrder(this);
		}

		@Override
		public String toString() {
			return wheat + " " + condiment + " " + meat;
		}

	}

	private LunchOrder(Builder builder) {
		this.wheat = builder.wheat;
		this.condiments = builder.condiment;
		this.meat = builder.meat;
	}

	private final String wheat;
	private final String condiments;
	private final String meat;

	public String getWheat() {
		return wheat;
	}

	public String getCondiments() {
		return condiments;
	}

	public String getMeat() {
		return meat;
	}
}
