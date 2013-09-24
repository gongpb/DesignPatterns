package com.bridge.company2;

public class IPod extends Product{

	@Override
	public void beProducted() {
		System.out.println("生产IPod...");
	}

	@Override
	public void beSelled() {
		System.out.println("生产出的IPod卖出去...");
	}

}
