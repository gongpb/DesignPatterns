package com.bridge.company;

public abstract class Corp {
	//����
	protected abstract void produce();
	//����
	protected abstract void sell();
	//׬Ǯ
	public void makeMoney(){
		this.produce();
		this.sell();
	}
}
