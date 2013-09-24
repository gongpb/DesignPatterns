package com.abstractFactory.human;

public abstract class AbstractYellowHuman implements Human{
	@Override
	public void getColor() {
		System.out.println("黄种人皮肤一般是黄色的");
		
	}
	@Override
	public void talk() {
		System.out.println("黄种人说话一般是双字节的");
	}
}
