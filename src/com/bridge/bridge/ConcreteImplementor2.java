package com.bridge.bridge;

public class ConcreteImplementor2 implements Implementor{

	@Override
	public void doAnything() {
		//业务逻辑
		System.out.println("-----------1");
	}

	@Override
	public void doSomething() {
		//业务逻辑
		System.out.println("-------------2");
	}

}
