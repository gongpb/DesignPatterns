package com.bridge.bridge;

public class ConcreteImplementor1 implements Implementor{

	@Override
	public void doAnything() {
		//业务逻辑
		System.out.println("业务逻辑1...");
	}

	@Override
	public void doSomething() {
		//业务逻辑
		System.out.println("业务逻辑2...");
	}

}
