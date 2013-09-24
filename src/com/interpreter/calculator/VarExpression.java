package com.interpreter.calculator;

import java.util.HashMap;
/**
 * ����������
 * @author gong_pibao
 */
public class VarExpression extends Expression{
	private String key;
	public VarExpression(String key){
		this.key = key;
	}
	//��map��ȡֵ
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return var.get(this.key);
	}
	

}
