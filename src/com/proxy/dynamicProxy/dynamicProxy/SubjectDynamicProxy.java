package com.proxy.dynamicProxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class SubjectDynamicProxy extends DynamicProxy{
	public static <T> T newProxyInstance(Subject subject){
		ClassLoader loader = subject.getClass().getClassLoader();
		Class<?>[] interfaces = subject.getClass().getInterfaces();
		InvocationHandler handler = new MyInvocationHandler(subject);
		//Proxy.newProxyInstance(loader, interfaces, h):重新生成一个对象
		return (T)Proxy.newProxyInstance(loader, interfaces, handler);
	}
}
