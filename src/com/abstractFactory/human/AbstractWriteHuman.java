package com.abstractFactory.human;

public abstract class AbstractWriteHuman implements Human{
	@Override
	public void getColor() {
		System.out.println("��������ɫ�ǰ�ɫ��");
		
	}
	@Override
	public void talk() {
		System.out.println("������˵��һ���ǵ��ֽڵ�");
		
	}
}
