package com.bridge.company2;

public class House extends Product{
	
	@Override
	public void beProducted() {
		System.out.println("生产房子");
	}

	@Override
	public void beSelled() {
		System.out.println("生产出的房子要卖掉");
	}

}
