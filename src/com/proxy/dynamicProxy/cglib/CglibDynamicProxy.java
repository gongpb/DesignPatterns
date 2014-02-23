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
	 * ����class���󴴽��ö���Ĵ������ 1�����ø��ࣻ2�����ûص� ���ʣ���̬������һ��class���������
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
		System.out.println("���õķ����ǣ�" + method.getName());
		// �û������ж�
		if (!"admin".equals(name)) {
			System.out.println("��û��Ȩ�ޣ�");
			return null;
		}
		Object result = methodProxy.invokeSuper(object, args);

		return result;
	}
}
