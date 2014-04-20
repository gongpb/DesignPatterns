package com.proxy.dynamicProxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;

public class Client {
	public static void main(String[] args) {
		//定义一个主题
		Subject subject = new RealSubject();
		//定义一个Handler 
		InvocationHandler handler = new MyInvocationHandler(subject);
		//定义一个主题的代理
		Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(), 
				//查找该类的所有接口
				subject.getClass().getInterfaces(),
				
				handler);
		proxy.dosomething("finish");
	}
	//场景类 针对具体的业务  添加了SubjectDynamicProxy类
//	public static void main(String[] args) {
//		//定义一个主题
//		Subject subject = new RealSubject();
//		//定义一个主题的代理
//		Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);
//		proxy.dosomething("finish");
//	}
}
