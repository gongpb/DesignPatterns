package com.abserver.updateHanFeiZi2;

public class Client {
	public static void main(String[] args) throws InterruptedException {
		//����۲���
		Observer liSi = new LiSi();
		Observer wangSi = new WangSi();
		
		//���屻�۲��ߣ�������
		HanFeiZi hanFeiZi = new HanFeiZi();
		
		//���Ǻ���������ʷ�����ݳ�����û���������ڹ۲캫����
		hanFeiZi.addObserver(liSi);
		hanFeiZi.addObserver(wangSi);
		
		//�����������ڸ�ʲô
		hanFeiZi.haveBreakfast();
		hanFeiZi.haveFun();
	}
}
