package com.proxy.dynamicProxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibDynamicProxy implements MethodInterceptor {
	public Enhancer enhancer = new Enhancer();
	private String name;

	public CglibDynamicProxy(String name) {
		this.name = name;
	}

	/**
	 * 根据class对象创建该对象的代理对象 1、设置父类；2、设置回调 本质：动态创建了一个class对象的子类
	 * @param cls
	 * @return
	 */
	public Object getDaoBean(Class cls) {
		enhancer.setSuperclass(cls);
		enhancer.setCallback(this);
		return enhancer.create();
	}
	
	@Override
	public Object intercept(Object object, Method method, Object[] args,
			MethodProxy methodProxy) throws Throwable {
		System.out.println("调用的方法是：" + method.getName());
		// 用户进行判断
		if (!"admin".equals(name)) {
			System.out.println("你没有权限！");
			return null;
		}
		Object result = methodProxy.invokeSuper(object, args);

		return result;
	}
}
