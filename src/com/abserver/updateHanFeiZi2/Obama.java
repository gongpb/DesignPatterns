package com.abserver.updateHanFeiZi2;

public class Obama  implements Observer{
	@Override
	public void update(String context) {
		System.out.println("Obama������ϰ��ϯ�����ʼ���ϰ�㱨��......");
		this.reportToQinShiHuang(context);
		System.out.println("Obama���㱨���...\n");
	}
	//�㱨����ʼ��
	public  void reportToQinShiHuang(String reportContext){
		
		System.out.println("Obama�����棬���ϰ壡ϰ��ϯ�л��......"+reportContext);
		
	}
}
