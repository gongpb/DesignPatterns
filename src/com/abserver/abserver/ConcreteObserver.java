package com.abserver.abserver;

public class ConcreteObserver implements Observer{

	@Override
	public void update(String context) {
		System.out.println("�۲��߿�ʼ����---"+context+"----�����д���\n");
	}

}
