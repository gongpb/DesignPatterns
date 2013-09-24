package com.state.state;

public class ConcreteState2 extends State{

	@Override
	public void handle1() {
		super.context.setCurrentState(Context.STATE1);
		super.context.handle1();
	}

	@Override
	public void handle2() {
		//本状态必须处理的业务逻辑
		System.out.println("状态2...");
	}

}
