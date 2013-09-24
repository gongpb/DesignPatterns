package com.flyweight.sign4;

import java.util.HashMap;
/**
 * ������Ϣ����
 * @author gong_pibao
 */
public class SignInfoFactory {
	//������
	private static HashMap<ExtrisicState, SignInfo> pool = new HashMap<ExtrisicState, SignInfo>();
	
	//�ӳ��л�ȡ����
	public static SignInfo getSignInfo(ExtrisicState key){
		//���ض���
		SignInfo result = null;
		//����û�ж������������������
		if(!pool.containsKey(key))
		{
			result = new SignInfo();
			pool.put(key, result);
		}
		else
		{
			result = pool.get(key);
			System.out.println(key+"------ֱ�ӳ����ȡ��");
		}
		return result;
	}
}
