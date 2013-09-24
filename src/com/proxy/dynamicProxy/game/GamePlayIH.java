package com.proxy.dynamicProxy.game;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayIH implements InvocationHandler{
	//被代理者
	Class cls = null;
	//被代理的实例
	Object obj= null;
	//我要代理谁
	public GamePlayIH(Object obj){
		this.obj = obj;
	}
	
	//调用被代理的方法
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
//		System.out.println("----  "+method+"  ----");
		Object result = method.invoke(this.obj, args);
		if(method.getName().equals("login")){
			System.out.println("有人用我的账号登录！");
		}
		return result;
	}

}
