package com.proxy.dynamicProxy.dynamicProxy;

public class RealSubject implements Subject{

	//实现方法
	@Override
	public void dosomething(String str) {
		System.out.println("do something ------");
	}
}
