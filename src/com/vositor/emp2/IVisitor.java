package com.vositor.emp2;

/**
 * �ýӿڵ������ǣ����ǿ��Է�����������һ������ͨԱ����һ���Ǹ߼�Ա��
 * @author gong_pibao
 */
public interface IVisitor {
	//���ȣ������ҿ��Է�����ͨԱ��
	public void visit(CommonEmployee commonEmployee);
	//��Σ������һ����Է��ʲ��ž���
	public void visit(Manager manager);
}
