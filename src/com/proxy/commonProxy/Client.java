package com.proxy.commonProxy;

public class Client {
	public static void main(String[] args) {
		//����һ��������
		IGamePlayer proxy = new GamePlayerProxy("����");
		//��ʼ����Ϸ������ʱ���
		System.out.println("��ʼʱ�� ��2001-12-01 10:30:00");
		proxy.login("zhangsan", "123");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println("����ʱ�� ��2001-12-10 12:50:00");
	}
}
