package com.proxy.gamePlayer;

public class GamePlayerProxy implements IGamePlayer, IProxy{
	private IGamePlayer gamePlayer;
	public  GamePlayerProxy(IGamePlayer gamePlayer){
		this.gamePlayer = gamePlayer;
	}
	//����ɱ��
	@Override
	public void killBoss() {
		this.gamePlayer.killBoss();
	}
	//������¼
	@Override
	public void login(String user, String password) {
		this.gamePlayer.login(user, password);
	}
	//���� ����
	@Override
	public void upgrade() {
		this.gamePlayer.upgrade();
	}
	//�������
	@Override
	public void count() {
		System.out.println("�������");
		
	}

}
