package com.abserver.hanFeiZi;

public class LiSi  implements ILiSi{
	@Override
	public void update(String context) {
		System.out.println("��˹�����ֺ����ӻ����ʼ���ϰ�㱨��......");
		this.reportToQinShiHuang(context);
		System.out.println("��˹���㱨���...\n");
	}
	//�㱨����ʼ��
	public  void reportToQinShiHuang(String reportContext){
		
		System.out.println("��˹�����棬���ϰ壡�������л��......"+reportContext);
		
	}
}
