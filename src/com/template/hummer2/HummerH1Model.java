package com.template.hummer2;

public class HummerH1Model extends HummerModel{
	private boolean alarmFlag = true ; //Ҫ������
	@Override
	public void alarm() {
		System.out.println("����H1 ����");
	}
	@Override
	public void engineBoom() {
		System.out.println("����H1 ���������������ӵ�........");
	}
	@Override
	public void start() {
		System.out.println("����H1 ����");
	}
	@Override
	public void stop() {
		System.out.println("����H1 ֹͣ");
	}
	@Override
	protected boolean isAlarm() {
		return this.alarmFlag;
	}
	
	//Ҫ��Ҫ�����ȣ����ɿͻ�������
	public void setAlarm(boolean isAlarm){
		 this.alarmFlag = isAlarm;
	}
	
}
