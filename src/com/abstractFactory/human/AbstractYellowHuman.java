package com.abstractFactory.human;

public abstract class AbstractYellowHuman implements Human{
	@Override
	public void getColor() {
		System.out.println("������Ƥ��һ���ǻ�ɫ��");
		
	}
	@Override
	public void talk() {
		System.out.println("������˵��һ����˫�ֽڵ�");
	}
}
