package com.interpreter.calculator;

import java.util.HashMap;
/**
 * 变量解析器
 * @author gong_pibao
 */
public class VarExpression extends Expression{
	private String key;
	public VarExpression(String key){
		this.key = key;
	}
	//从map中取值
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return var.get(this.key);
	}
	

}
