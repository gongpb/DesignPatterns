package com.state.state;

public class ConcreteState1 extends State{

	@Override
	public void handle1() {
		//��״̬�±��봦���ҵ���߼�
		System.out.println("״̬1...");
	}

	@Override
	public void handle2() {
		super.context.setCurrentState(Context.STATE2);
		super.context.handle2();
	}

}
