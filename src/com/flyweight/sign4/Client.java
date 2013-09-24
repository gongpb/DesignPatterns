package com.flyweight.sign4;
/**
 * �����Լ���д������Ϊ�ⲿ״̬�����븲дequals������hashcode����������Ч�ʻ�Ƚϵ�
 * �����ⲿ״̬�����java�ļ���������Ϊ��־���磺string��int ��������Ч��
 * @author gong_pibao
 */
public class Client {
	public static void main(String[] args) {
		ExtrisicState state1 = new ExtrisicState();
		state1.setSubject("��Ŀ1");
		state1.setLocation("�Ϻ�");
		SignInfoFactory.getSignInfo(state1);
		ExtrisicState state2 = new ExtrisicState();
		state2.setSubject("��Ŀ2");
		state1.setLocation("�Ϻ�2");
		long currentTime = System.currentTimeMillis();
		for(int i=0 ; i<10000; i++)
		{
			SignInfoFactory.getSignInfo(state2);	
		}
		long tailTime = System.currentTimeMillis();
		System.out.println("ִ��ʱ�䣺"+(tailTime - currentTime)+" ms");
	}

}
