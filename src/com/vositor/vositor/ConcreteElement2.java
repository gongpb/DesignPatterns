package com.vositor.vositor;
/**
 * ����Ԫ��2 ʵ��accept������ͨ����visitor.visit(this); �����϶��γ�һ��ģʽ��
 * @author gong_pibao
 */
public class ConcreteElement2 extends Element{
	//���ҵ���߼�
	@Override
	public void doSomething() {
		System.out.println("ҵ��2......");
	}
	//��������߷���
	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

}
