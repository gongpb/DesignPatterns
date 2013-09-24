package com.state.state;

public class ConcreteState1 extends State{

	@Override
	public void handle1() {
		//本状态下必须处理的业务逻辑
		System.out.println("状态1...");
	}

	@Override
	public void handle2() {
		super.context.setCurrentState(Context.STATE2);
		super.context.handle2();
	}

}
