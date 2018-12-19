package com.src.design.behavioural.chainofresponsibility;

public class CEOHandler extends Handler {

	@Override
	void handleRequest(Request request) {
		System.out.println("CEO can pass any amount!!!!!!");
	}

}
