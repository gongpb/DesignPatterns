package com.state.state;

public abstract class State {
	//����һ��������ɫ���ṩ�������
	protected Context context;
	public void setContext(Context context) {
		this.context = context;
	}
	public abstract void handle1();
	public abstract void handle2();
}
