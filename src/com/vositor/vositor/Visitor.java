package com.vositor.vositor;
/**
 * ���������
 * @author gong_pibao
 */
public class Visitor implements IVisitor{
	//����el1 Ԫ��
	@Override
	public void visit(ConcreteElement1 el1) {
		System.out.println("11111111111");
	}
	//����el2 Ԫ��
	@Override
	public void visit(ConcreteElement2 el2) {
		System.out.println("22222222");
	}

}
