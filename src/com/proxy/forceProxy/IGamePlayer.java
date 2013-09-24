package com.proxy.forceProxy;

public interface IGamePlayer {
	//登录游戏
	public void login(String user, String password);
	//杀怪，网络游戏中的主要特色
	public void killBoss();
	//升级
	public void upgrade();
	//每个人都可以找一下自己的代理
	public IGamePlayer getProxy();
}
