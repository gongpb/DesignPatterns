package com.proxy.dynamicProxy.log;

public class Client {
	public static void main(String[] args) {
		IHello hello = new HelloImpl();
		IHello proxy = DynamicProxy.newProxyInstance(hello);
		proxy.sayHello();
		proxy.sayWelcome();
	}
}