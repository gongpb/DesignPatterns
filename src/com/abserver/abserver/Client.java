package com.abserver.abserver;

/**
 * 观察者模式
 * @author gong_pibao
 */
public class Client {
	public static void main(String[] args) {
		//定义一个观察者
		Observer obs = new ConcreteObserver();
		Observer obs2 = new ConcreteObserver2();
		//定义一个被观察者
		Subject subject = new  ConcreteSubject();
		//观察者 观察被观察者
		subject.addObserver(obs);
		subject.addObserver(obs2);
		//观察者开始活动了
		subject.doSomething();
	}
}