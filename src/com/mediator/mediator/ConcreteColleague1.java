package com.mediator.mediator;

public class ConcreteColleague1 extends Colleague{
	//ͨ�����췽�������н���
	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
	}
	//���з���
	public void selfMethod1(){
		//�����Լ���ҵ���߼�
	}
	//��������
	public void depMethod1(){
		//�����Լ���ҵ���߼�
		//�Լ����ܴ����ҵ���߼���ί�и��н��ߴ���
		super.mediator.doSomething1();
	}
	
}
