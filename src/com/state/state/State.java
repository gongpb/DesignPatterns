package com.state.state;

public abstract class State {
	//定义一个环境角色，提供子类访问
	protected Context context;
	public void setContext(Context context) {
		this.context = context;
	}
	public abstract void handle1();
	public abstract void handle2();
}
