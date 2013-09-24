package com.abserver.hanFeiZi;

public class Client {
	public static void main(String[] args) throws InterruptedException {
		LiSi liSi = new LiSi();
		HanFeiZi hanFeiZi = new HanFeiZi();
		//�۲����
		Spy spyBreakfast = new Spy(hanFeiZi, liSi, "breakfast");
		//�����̣߳����
		spyBreakfast.start();
		//�۲��������
		Spy spyFun = new Spy(hanFeiZi, liSi, "fun");
		//�����̣߳����
		spyFun.start();
		
		Thread.sleep(1000); //���̴߳�1��֮��������ִ��
		hanFeiZi.haveBreakfast();
		//�����ӿ�ʼ����
		Thread.sleep(1000); //���̴߳�1��֮��������ִ��
		hanFeiZi.haveFun();
	}

}
