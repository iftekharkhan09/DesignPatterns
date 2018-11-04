package com.src.design.behavioural.chainofresponsibility;

public class MainClass {
	public static void main(String[] args) {
		DirectorHandler director = new DirectorHandler();
		VPHandler vp = new VPHandler();
		CEOHandler ceo=new CEOHandler();
		Request request = new Request(8900.0, RequestType.CONFERENCE);

		director.setSuccessor(vp);
		vp.setSuccessor(ceo);
		director.handleRequest(request);
	}
}
