package com.abserver.updateHanFeiZi2;

public class PuJing  implements Observer{
	@Override
	public void update(String context) {
		System.out.println("�վ�������ϰ��ϯ�����ʼ���ϰ�㱨��......");
		this.cry(context);
		System.out.println("�վ����㱨���...\n");
	}
	//һ�����������л������ʹ��
	public  void cry(String reportContext){
		System.out.println("�վ�����Ϊ "+reportContext+"--�����ұ���ѽ��");
	}
}
