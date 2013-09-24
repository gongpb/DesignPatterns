package com.factory.human;

public class BlackHuman implements Human{

	@Override
	public void getColor() {
		System.out.println("黑种人的颜色是黑色的！");
	}

	@Override
	public void talk() {
		System.out.println("黑种人讲话，一般人听不懂！");
	}

}
