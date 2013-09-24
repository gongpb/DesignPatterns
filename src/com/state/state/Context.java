package com.state.state;

public class Context {
	public final static ConcreteState1 STATE1 = new ConcreteState1();
	public final static ConcreteState2 STATE2 = new ConcreteState2();
	// 当前状态
	private State currentState;

	public State getCurrentState() {
		return currentState;
	}
	public void setCurrentState(State currentState) {
		this.currentState = currentState;
		this.currentState.setContext(this);
	}
	//行为委托
	public void handle1(){
		this.currentState.handle1();
	}
	public void handle2(){
		this.currentState.handle2();
	}
}
