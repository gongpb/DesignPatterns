package com.abserver.updateHanFeiZi2;

public class WangSi  implements Observer{
	@Override
	public void update(String context) {
		System.out.println("��˹�����ֺ����ӻ����ʼ���ϰ�㱨��......");
		this.cry(context);
		System.out.println("��˹���㱨���...\n");
	}
	//һ�����������л������ʹ��
	public  void cry(String reportContext){
		System.out.println("��˹����Ϊ "+reportContext+"--�����ұ���ѽ��");
		
	}
}
