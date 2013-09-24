package com.proxy.dynamicProxy.game;

public class GamePlayer implements IGamePlayer{
	private String name = "";
	//ͨ�����췽����������
	public GamePlayer(String name){
		this.name = name;
	}
	//���
	@Override
	public void killBoss() {
		System.out.println(this.name+"�ڴ��");
	}
	//��¼
	@Override
	public void login(String user, String password) {
		System.out.println("��¼��Ϊ    "+user+" ���û�     "+this.name+"  ��¼�ɹ�");
	}
	//����
	@Override
	public void upgrade() {
		System.out.println(this.name+"  ������һ�� ! ");
	}

}
