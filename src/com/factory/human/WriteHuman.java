package com.factory.human;

public class WriteHuman implements Human{

	@Override
	public void getColor() {
		System.out.println("白种人的颜色是白色的！");
	}

	@Override
	public void talk() {
		System.out.println("白种人讲话，一般都是单字节！");
	}

}
