package com.abstractFactory.human;

public abstract class AbstractBlackHuman implements Human{
	@Override
	public void getColor() {
		System.out.println("黑种人皮肤是黑色的");
		
	}
	@Override
	public void talk() {
		System.out.println("黑种人讲话，一般人听不懂");
		
	}
}
