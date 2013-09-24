package com.singleton.singleton;

/**
 * ����ģʽ��ͨ�ô���
 * @author gong_pibao
 */
public class Singleton {
	private static final Singleton singleton = new Singleton();
	
	private Singleton(){
		
	}
	public static Singleton getInstance(){
		return singleton;
	}
	//���е�����������������static��
	public static void doSomething(){
		
	}
}
