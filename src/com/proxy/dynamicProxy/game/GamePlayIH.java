package com.proxy.dynamicProxy.game;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayIH implements InvocationHandler{
	//��������
	Class cls = null;
	//�������ʵ��
	Object obj= null;
	//��Ҫ����˭
	public GamePlayIH(Object obj){
		this.obj = obj;
	}
	
	//���ñ�����ķ���
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
//		System.out.println("----  "+method+"  ----");
		Object result = method.invoke(this.obj, args);
		if(method.getName().equals("login")){
			System.out.println("�������ҵ��˺ŵ�¼��");
		}
		return result;
	}

}
