package com.mediator.mediator;

/**
 * �����н��߽�ɫ
 * ͨ��Э����ͬ�½�ɫʵ��Э����Ϊ����ˣ������������ڸ���ͬ�½�ɫ
 * @author gong_pibao
 */
public class ConcereMediator extends Mediator{
	/**
	 * �н������еķ���doSomething1��doSomething2 ���ǱȽϸ��ӵ�ҵ���߼���
	 * Ϊͬ���������ʵ����Ҫ��������ͬ��������ɵ�
	 */
	@Override
	public void doSomething1() {
		//����ͬ����ķ�����ֻҪ��public�ķ����������Ե���
		super.c1.depMethod1();
		super.c2.depMethod2();
	}

	@Override
	public void doSomething2() {
		super.c1.selfMethod1();
		super.c2.selfMethod2();
	}
}
