package com.proxy.dynamicProxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ͨ����̬����ʵ�ֵķ���ȫ��ͨ��invoke()����
 * @author gong_pibao
 */
public class MyInvocationHandler implements InvocationHandler {
	private Object obj = null;
	public MyInvocationHandler(Object obj){
		this.obj = obj;
	}
	//������,ʵ�����еķ���
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
			//ִ�б������
		Object result = method.invoke(this.obj, args);
		return result;
	}
}
