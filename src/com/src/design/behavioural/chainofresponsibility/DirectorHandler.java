package com.src.design.behavioural.chainofresponsibility;

public class DirectorHandler extends Handler {

	@Override
	void handleRequest(Request request) {
		if (request.getAmount() < 1000)
			System.out.println("Director Passed!");
		else
			successor.handleRequest(request);
	}

}
