package com.interpreter.calculator;

import java.util.HashMap;
/**
 * ������ʽ
 * @author gong_pibao
 */
public abstract class Expression {
	//������ʽ����ֵ������var �е�keyֵ�� ��ʽ�еĲ�����valueֵ�Ǿ��������
	public abstract int interpreter(HashMap<String, Integer> var);
}
