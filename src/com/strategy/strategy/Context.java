package com.strategy.strategy;

public class Context {
	private Strategy strategy;
	
	public Context(Strategy strategy){
		this.strategy = strategy;
	}
	//封装后的策略方法
	public void doSomething(){
		this.strategy.doSomething();
	}
}
