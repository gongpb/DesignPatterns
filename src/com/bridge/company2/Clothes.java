package com.bridge.company2;

public class Clothes extends Product{

	@Override
	public void beProducted() {
		System.out.println("生产衣服...");
	}

	@Override
	public void beSelled() {
		System.out.println("衣服卖出去...");
	}

}
