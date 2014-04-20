package com.proxy.dynamicProxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;

public class Client {
	public static void main(String[] args) {
		//����һ������
		Subject subject = new RealSubject();
		//����һ��Handler 
		InvocationHandler handler = new MyInvocationHandler(subject);
		//����һ������Ĵ���
		Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(), 
				//���Ҹ�������нӿ�
				subject.getClass().getInterfaces(),
				
				handler);
		proxy.dosomething("finish");
	}
	//������ ��Ծ����ҵ��  �����SubjectDynamicProxy��
//	public static void main(String[] args) {
//		//����һ������
//		Subject subject = new RealSubject();
//		//����һ������Ĵ���
//		Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);
//		proxy.dosomething("finish");
//	}
}
