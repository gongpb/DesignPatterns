package com.proxy.gamePlayer;

public class Client {
	public static void main(String[] args) {
		//����һ�����Ե����
		IGamePlayer gamePlayer = new GamePlayer("����");
		//����һ��������
		IGamePlayer proxy = new GamePlayerProxy(gamePlayer);
		//��ʼ����Ϸ������ʱ���
		System.out.println("��ʼʱ�� ��2001-12-01 10:30:00");
		//��¼
		proxy.login("zhangsan", "123");
		//��ʼɱ��
		proxy.killBoss();
		//����
		proxy.upgrade();
		//����ʱ��
		System.out.println("����ʱ�� ��2001-12-10 12:50:00");
	}
}
