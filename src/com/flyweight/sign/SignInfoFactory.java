package com.flyweight.sign;
/**
 * ������Ϣ����
 * @author gong_pibao
 */
public class SignInfoFactory {
	//������Ϣ�Ķ��󹤳�
	public static SignInfo getSignInfo(){
		return new SignInfo();
	}
}
