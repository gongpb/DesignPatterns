package com.abstractFactory.human;

public abstract class AbstractWriteHuman implements Human{
	@Override
	public void getColor() {
		System.out.println("白种人颜色是白色的");
		
	}
	@Override
	public void talk() {
		System.out.println("白种人说话一般是单字节的");
		
	}
}
