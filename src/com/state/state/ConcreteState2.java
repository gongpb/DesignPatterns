package com.state.state;

public class ConcreteState2 extends State{

	@Override
	public void handle1() {
		super.context.setCurrentState(Context.STATE1);
		super.context.handle1();
	}

	@Override
	public void handle2() {
		//��״̬���봦���ҵ���߼�
		System.out.println("״̬2...");
	}

}
