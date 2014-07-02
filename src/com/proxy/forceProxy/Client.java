package com.proxy.forceProxy;

public class Client {
	/**
	 * ֱ�ӷ�����ʵ��ɫ
	 */
//	public static void main(String[] args) {
//		//����һ�����Ե����
//		IGamePlayer gamePlayer = new GamePlayer("����");
//		//��ʼ����Ϸ������ʱ���
//		System.out.println("��ʼʱ�� ��2001-12-01 10:30:00");
//		gamePlayer.login("zhangsan", "123");
//		gamePlayer.killBoss();
//		gamePlayer.upgrade();
//		System.out.println("����ʱ�� ��2001-12-10 12:50:00");
//	}
	/**
	 * ֱ�ӷ�����ʵ������
	 */
//	public static void main(String[] args) {
//		//����һ�����Ե����
//		IGamePlayer gamePlayer = new GamePlayer("����");
//		//����һ�������� ������������Լ�new�����ģ���ʵ������ʶ
//		IGamePlayer proxy = new GamePlayerProxy(gamePlayer);
//		//��ʼ����Ϸ������ʱ���
//		System.out.println("��ʼʱ�� ��2001-12-01 10:30:00");
//		proxy.login("zhangsan", "123");
//		proxy.killBoss();
//		proxy.upgrade();
//		System.out.println("����ʱ�� ��2001-12-10 12:50:00");
//	}
	/**
	 * ǿ�ƴ�����
	 */
	public static void main(String[] args) {
		//����һ����Ϸ�Ľ�ɫ
		IGamePlayer gamePlayer = new GamePlayer("����");
		//���ָ���Ĵ���
		IGamePlayer proxy = gamePlayer.getProxy();
		//��ʼ����Ϸ������ʱ���
		System.out.println("��ʼʱ�� ��2001-12-01 10:30:00");
		proxy.login("zhangsan", "123");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println("����ʱ�� ��2001-12-10 12:50:00");
	}
}
