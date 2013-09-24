package com.abserver.abserver;

public class ConcreteSubject extends Subject {
	public void doSomething(){
		String msg = "被观察者开始活动";
		System.out.println(msg);
		this.notifyObservers(msg);
	}
}
