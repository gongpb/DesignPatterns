package com.abstractFactory.human;

public abstract class AbstractBlackHuman implements Human{
	@Override
	public void getColor() {
		System.out.println("������Ƥ���Ǻ�ɫ��");
		
	}
	@Override
	public void talk() {
		System.out.println("�����˽�����һ����������");
		
	}
}
