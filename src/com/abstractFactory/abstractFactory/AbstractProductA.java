package com.abstractFactory.abstractFactory;
/**
 * �����Ʒ��
 * @author gong_pibao
 */
public abstract class AbstractProductA {
	//ÿ����Ʒ���еķ���
	public void shareMethod(){
		System.out.println("ÿ����Ʒ--A--��ͬ�ķ���");
	}
	//ÿ����Ʒ��ͬ��������ͬʵ��
	public abstract void doSomething();
}
