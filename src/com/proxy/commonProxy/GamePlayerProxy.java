package com.proxy.commonProxy;

public class GamePlayerProxy implements IGamePlayer{
	private IGamePlayer gamePlayer = null;
	//ͨ�����췽�� ����Ҫ��˭���д���
	public  GamePlayerProxy(String name){
		try {
			//ָ������ʵ��ɫ
			gamePlayer = new GamePlayer(this, name);
		} catch (Exception e) {
			e.printStackTrace();
		}
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

}
