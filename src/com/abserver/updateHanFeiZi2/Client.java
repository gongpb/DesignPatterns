package com.abserver.updateHanFeiZi2;

public class Client {
	public static void main(String[] args) throws InterruptedException {
		//����۲���
		Observer obama = new Obama();
		Observer pujing = new PuJing();
		
		//���屻�۲��ߣ�������
		XiJinPing xiaoXi = new XiJinPing();
		
		//���Ǻ���������ʷ�����ݳ�����û���������ڹ۲캫����
		xiaoXi.addObserver(obama);
		xiaoXi.addObserver(pujing);
		
		//�����������ڸ�ʲô
		xiaoXi.haveBreakfast();
		xiaoXi.haveFun();
	}
}
