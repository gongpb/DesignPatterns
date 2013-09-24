package com.strategy.strategy;

public class Context {
	private Strategy strategy;
	
	public Context(Strategy strategy){
		this.strategy = strategy;
	}
	//��װ��Ĳ��Է���
	public void doSomething(){
		this.strategy.doSomething();
	}
}
