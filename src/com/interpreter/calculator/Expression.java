package com.interpreter.calculator;

import java.util.HashMap;
/**
 * 抽象表达式
 * @author gong_pibao
 */
public abstract class Expression {
	//解析公式和数值，其中var 中的key值是 公式中的参数，value值是具体的数字
	public abstract int interpreter(HashMap<String, Integer> var);
}
