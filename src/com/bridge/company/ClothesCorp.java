package com.bridge.company;

public class ClothesCorp extends Corp {

	@Override
	protected void produce() {
		System.out.println("��װ��˾��ʼ�����·�");
	}

	@Override
	protected void sell() {
		System.out.println("��װ��˾��ʼ�����·�");
	}

	@Override
	public void makeMoney() {
		super.makeMoney();
		System.out.println("��װ��˾׬СǮ��......");
	}
}
