package com.abserver.abserver;

public class ConcreteObserver implements Observer{

	@Override
	public void update(String context) {
		System.out.println("观察者开始报告---"+context+"----并进行处理！\n");
	}

}
