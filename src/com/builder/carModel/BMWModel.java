package com.builder.carModel;

public class BMWModel extends CarModel{

	@Override
	protected void alarm() {
		System.out.println("宝马喇叭声音...");
	}

	@Override
	protected void engineBoom() {
		 System.out.println("宝马引擎是这个声音的...");
	}

	@Override
	protected void start() {
		System.out.println("宝马跑起来...");
	}

	@Override
	protected void stop() {
		System.out.println("宝马停止...");
	}


}
