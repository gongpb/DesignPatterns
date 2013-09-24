package com.bridge.company;

public abstract class Corp {
	//生产
	protected abstract void produce();
	//销售
	protected abstract void sell();
	//赚钱
	public void makeMoney(){
		this.produce();
		this.sell();
	}
}
