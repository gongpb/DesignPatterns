package com.proxy.forceProxy;

public interface IGamePlayer {
	//��¼��Ϸ
	public void login(String user, String password);
	//ɱ�֣�������Ϸ�е���Ҫ��ɫ
	public void killBoss();
	//����
	public void upgrade();
	//ÿ���˶�������һ���Լ��Ĵ���
	public IGamePlayer getProxy();
}
