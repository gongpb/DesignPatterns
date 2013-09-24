package com.abstractFactory.abstractFactory;

/**
 * ���󹤳�ģʽ
 * @author gong_pibao
 */
public class Client {
	public static void main(String[] args) {
		//������������       ��Ʒ����1
		AbstractCreator creator1 = new Creator1();
		//��Ʒ����2
		AbstractCreator creator2 = new Creator1();
		//����A1 �Ķ���
		AbstractProductA a1 = creator1.createProductA();
		//����A2 �Ķ���
		AbstractProductA a2 = creator2.createProductA();
		//����B1 �Ķ���
		AbstractProductB B1 = creator1.createProductB();
		//����B2 �Ķ���
		AbstractProductB b2 = creator2.createProductB();
		//----------��ʼ������Ʒ--------
		System.out.println("----��ƷA----");
		a1.shareMethod();
		a1.doSomething();
		System.out.println("\n----��ƷB----");
		a1.shareMethod();
		a1.doSomething();
	}
}
