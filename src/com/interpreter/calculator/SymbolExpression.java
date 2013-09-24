package com.interpreter.calculator;

import java.util.HashMap;
/**
 * 抽象运算符号解析器
 * @author gong_pibao
 */
public abstract class SymbolExpression extends Expression{
	protected Expression left;
	protected Expression right;
	//所有的解析公式都应该只关心自己左右两个表达式的结果
	public  SymbolExpression(Expression left, Expression right) {
		this.left = left ;
		this.right = right;
	}
}
