package com.abserver.abserver;

public class ConcreteObserver2 implements Observer{

	@Override
	public void update(String context) {
		System.out.println("观察者2开始报告---"+context+"----并进行处理！");
	}

}
