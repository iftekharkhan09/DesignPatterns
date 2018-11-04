package com.src.design.behavioural.chainofresponsibility;

public class Request {
	public Request(Double amount, RequestType requestType) {
		super();
		this.amount = amount;
		this.requestType = requestType;
	}

	private Double amount;
	private RequestType requestType;

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public RequestType getRequestType() {
		return requestType;
	}

	public void setRequestType(RequestType requestType) {
		this.requestType = requestType;
	}
}
