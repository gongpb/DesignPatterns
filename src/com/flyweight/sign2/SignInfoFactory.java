package com.flyweight.sign2;

import java.util.HashMap;
/**
 * ������Ϣ����
 * @author gong_pibao
 */
public class SignInfoFactory {
	//������
	private static HashMap<String, SignInfo> pool = new HashMap<String, SignInfo>();
	//������Ϣ�Ķ��󹤳�
	@Deprecated
	public static SignInfo getSignInfo(){
		return new SignInfo();
	}
	//�ӳ��л�ȡ����
	public static SignInfo getSignInfo(String key){
		//���ض���
		SignInfo result = null;
		//����û�ж������������������
		if(!pool.containsKey(key))
		{
			System.out.println(key+"------�������󣬲�������� ");
			result = new SignInfo4Pool(key);
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
