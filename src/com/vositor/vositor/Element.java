package com.vositor.vositor;
/**
 * ����Ԫ��
 * ��������һ������߷��ʣ�������ͨ��accept�����Ĳ����������
 * @author gong_pibao
 */
public abstract class Element {
	//����ҵ���߼�
	public abstract void doSomething();
	//��������߷���
	public abstract void accept(IVisitor visitor);
}
