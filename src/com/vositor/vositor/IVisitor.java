package com.vositor.vositor;
/**
 * ���������
 * ���������߿��Է�����ЩԪ�أ����嵽�����о���visit�����Ĳ���������Щ������Ա�����
 * @author gong_pibao
 */
public interface IVisitor {
	//���Է�����Щ����
	public void visit(ConcreteElement1 el1);
	public void visit(ConcreteElement2 el2);
}
