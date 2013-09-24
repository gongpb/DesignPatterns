package com.builder.carModel;

public class BMWModel extends CarModel{

	@Override
	protected void alarm() {
		System.out.println("������������...");
	}

	@Override
	protected void engineBoom() {
		 System.out.println("�������������������...");
	}

	@Override
	protected void start() {
		System.out.println("����������...");
	}

	@Override
	protected void stop() {
		System.out.println("����ֹͣ...");
	}


}
