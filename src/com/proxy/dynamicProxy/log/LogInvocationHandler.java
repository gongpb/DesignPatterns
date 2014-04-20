package com.proxy.dynamicProxy.log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogInvocationHandler implements InvocationHandler{
	private Object obj;
	
	public LogInvocationHandler(Object obj){
		this.obj = obj;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		doBefore();
		method.invoke(this.obj, args);
		doAfter();
		
		return null;
	}

	private void doBefore(){
		System.out.println("before--------");
	}
	private void doAfter(){
		System.out.println("after--------");
		
	}
}
