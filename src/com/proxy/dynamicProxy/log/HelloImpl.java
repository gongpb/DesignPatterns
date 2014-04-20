package com.proxy.dynamicProxy.log;

public class HelloImpl implements IHello,ILog{

	@Override
	public void sayHello() {
		System.out.println("hello--------");
	}

	@Override
	public void sayWelcome() {
		System.out.println("welcome-------");
	}

}
