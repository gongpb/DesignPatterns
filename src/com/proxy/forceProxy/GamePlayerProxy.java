package com.proxy.forceProxy;

/**
 * ǿ�ƴ���Ĵ�����
 * @author gong_pibao
 */
public class GamePlayerProxy implements IGamePlayer{
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
	//����Ĵ�������ʱû�У������Լ�
	@Override
	public IGamePlayer getProxy(){
		return this;
	}
}
