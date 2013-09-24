package com.proxy.gamePlayer;

public class GamePlayerProxy implements IGamePlayer, IProxy{
	private IGamePlayer gamePlayer;
	public  GamePlayerProxy(IGamePlayer gamePlayer){
		this.gamePlayer = gamePlayer;
	}
	//代练杀怪
	@Override
	public void killBoss() {
		this.gamePlayer.killBoss();
	}
	//代练登录
	@Override
	public void login(String user, String password) {
		this.gamePlayer.login(user, password);
	}
	//代练 升级
	@Override
	public void upgrade() {
		this.gamePlayer.upgrade();
	}
	//计算费用
	@Override
	public void count() {
		System.out.println("计算费用");
		
	}

}
