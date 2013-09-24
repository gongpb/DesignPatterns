package com.adapter.adapter;

public class ConcreteTarget implements Target{

	@Override
	public void request() {
		System.out.println("if you need any help, please call me !");
	}

}
