package com.mediator.mediator;

public class ConcreteColleague2 extends Colleague{
	/**
	 * ͨ�����췽�������н���
	 * Ϊʲôͬ����Ҫʹ�ù��캯��ע���н��ߣ����н���ʹ��getter/setter��ʽע��ͬ�����أ�
	 * ������Ϊͬ����������н��ߣ����н��߿���ֻ�в���ͬ����
	 * @param mediator
	 */
	public ConcreteColleague2(Mediator mediator) {
		super(mediator);
	}
	//���з���
	public void selfMethod2(){
		//�����Լ���ҵ���߼�
	}
	//��������
	public void depMethod2(){
		//�����Լ���ҵ���߼�
		//�Լ����ܴ����ҵ���߼���ί�и��н��ߴ���
		super.mediator.doSomething2();
	}
}
