package com.proxy.dynamicProxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxy<T> {
	public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces,InvocationHandler h){
		//Ѱ��JoinPoint���ӵ㣬AOP���ʹ��Ԫ���ݶ���
		if(true){
			//ִ��һ��ǰ��֪ͨ
			( new BeforeAdvice() ).exec();
		}
		//Proxy.newProxyInstance(loader, interfaces, h):��������һ������
		return (T)Proxy.newProxyInstance(loader, interfaces, h);
	}
	
//	public static <T> T newProxyInstance(Subject subject){
//		ClassLoader loader = subject.getClass().getClassLoader();
//		Class<?>[] classes = subject.getClass().getInterfaces();
//		InvocationHandler handler = new MyInvocationHandler(subject);
//		return (T)Proxy.newProxyInstance(loader, classes, handler);
//	}
}
