package com.abserver.abserver;

public class ConcreteSubject extends Subject {
	public void doSomething(){
		String msg = "���۲��߿�ʼ�";
		System.out.println(msg);
		this.notifyObservers(msg);
	}
}
