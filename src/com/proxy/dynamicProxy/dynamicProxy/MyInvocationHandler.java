package com.proxy.dynamicProxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 通过动态代理实现的方法全部通过invoke()调用
 * @author gong_pibao
 */
public class MyInvocationHandler implements InvocationHandler {
	private Object obj = null;
	public MyInvocationHandler(Object obj){
		this.obj = obj;
	}
	//代理方法,实现所有的方法
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
			//执行被代理的
		Object result = method.invoke(this.obj, args);
		return result;
	}
}
