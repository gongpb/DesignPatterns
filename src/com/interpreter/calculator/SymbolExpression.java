package com.interpreter.calculator;

import java.util.HashMap;
/**
 * ����������Ž�����
 * @author gong_pibao
 */
public abstract class SymbolExpression extends Expression{
	protected Expression left;
	protected Expression right;
	//���еĽ�����ʽ��Ӧ��ֻ�����Լ������������ʽ�Ľ��
	public  SymbolExpression(Expression left, Expression right) {
		this.left = left ;
		this.right = right;
	}
}
