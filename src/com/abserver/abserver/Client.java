package com.abserver.abserver;

/**
 * �۲���ģʽ
 * @author gong_pibao
 */
public class Client {
	public static void main(String[] args) {
		//����һ���۲���
		Observer obs = new ConcreteObserver();
		Observer obs2 = new ConcreteObserver2();
		//����һ�����۲���
		Subject subject = new  ConcreteSubject();
		//�۲��� �۲챻�۲���
		subject.addObserver(obs);
		subject.addObserver(obs2);
		//�۲��߿�ʼ���
		subject.doSomething();
	}
}