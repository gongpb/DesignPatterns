package com.vositor.vositor;
/**
 * ����Ԫ��1 ʵ��accept������ͨ����visitor.visit(this); �����϶��γ�һ��ģʽ��
 * @author gong_pibao
 */
public class ConcreteElement1 extends Element{
	//���ҵ���߼�
	@Override
	public void doSomething() {
		System.out.println("ҵ��1......");
	}
	//��������߷���
	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
}
