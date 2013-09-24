package com.template.hummer2;

public class HummerH2Model extends HummerModel{

	@Override
	public void alarm() {
		System.out.println("����H2 ����");
	}
	@Override
	public void engineBoom() {
		System.out.println("����H2 ���������������ӵ�........");
	}
	@Override
	public void start() {
		System.out.println("����H2 ����");
	}
	@Override
	public void stop() {
		System.out.println("����H2 ֹͣ");
	}
	
	//Ĭ��û�����ȵ�
	@Override
	protected boolean isAlarm() {
		return false;
	}
}
