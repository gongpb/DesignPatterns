package com.proxy.commonProxy;

public class GamePlayerProxy implements IGamePlayer{
	private IGamePlayer gamePlayer = null;
	//通过构造方法 传递要对谁进行代练
	public  GamePlayerProxy(String name){
		try {
			//指定了真实角色
			gamePlayer = new GamePlayer(this, name);
		} catch (Exception e) {
			e.printStackTrace();
		}
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

}
