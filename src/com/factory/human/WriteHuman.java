package com.factory.human;

public class WriteHuman implements Human{

	@Override
	public void getColor() {
		System.out.println("�����˵���ɫ�ǰ�ɫ�ģ�");
	}

	@Override
	public void talk() {
		System.out.println("�����˽�����һ�㶼�ǵ��ֽڣ�");
	}

}
