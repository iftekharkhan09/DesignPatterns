package com.src.design.behavioural.chainofresponsibility;

public class VPHandler extends Handler {

	@Override
	void handleRequest(Request request) {
		if (request.getAmount() < 2000)
			System.out.println("VP Handled!");
		else
			successor.handleRequest(request);
	}

}
