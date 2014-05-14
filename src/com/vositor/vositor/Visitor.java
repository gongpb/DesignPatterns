package com.vositor.vositor;
/**
 * ���������
 * @author gong_pibao
 */
public class Visitor implements IVisitor{
	//����el1 Ԫ��
	@Override
	public void visit(ConcreteElement1 el1) {
		el1.doSomething();
	}
	//����el2 Ԫ��
	@Override
	public void visit(ConcreteElement2 el2) {
		el2.doSomething();
	}

}
