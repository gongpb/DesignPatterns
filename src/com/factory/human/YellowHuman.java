package com.factory.human;

public class YellowHuman implements Human{

	@Override
	public void getColor() {
		System.out.println("黄种人的颜色是黄色的！");
	}

	@Override
	public void talk() {
		System.out.println("黄种人讲话，一般说的都是双字节！");
	}

}
