package com.proxy.dynamicProxy.game;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
	public static void main(String[] args) {
		//����һ�����Ե����
		IGamePlayer gamePlayer = new GamePlayer("����");
		//����һ��������
		InvocationHandler handler = new GamePlayIH(gamePlayer);
		//��ʼ����Ϸ������ʱ���
		System.out.println("��ʼʱ�� ��2001-12-01 10:30:00");
		//��ȡClass loader
		ClassLoader cl = gamePlayer.getClass().getClassLoader();
		//��̬����һ�������ߣ���������һ������
		IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, new Class []{IGamePlayer.class}, handler);
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
