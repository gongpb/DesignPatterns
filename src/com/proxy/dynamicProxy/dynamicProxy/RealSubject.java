package com.proxy.dynamicProxy.dynamicProxy;

public class RealSubject implements Subject{

	//ʵ�ַ���
	@Override
	public void dosomething(String str) {
		System.out.println("do something ------");
	}
}
