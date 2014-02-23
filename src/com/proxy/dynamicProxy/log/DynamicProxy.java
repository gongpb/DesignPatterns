package com.proxy.dynamicProxy.log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxy {
	public static <T> T newProxyInstance(IHello subject){
		InvocationHandler handler = new LogInvocationHandler(subject);
		ClassLoader loader = subject.getClass().getClassLoader();
		Class<?>[] interfaces = subject.getClass().getInterfaces();
		return (T)Proxy.newProxyInstance(loader, interfaces, handler);
	}
}
