package com.proxy.forceProxy;

/**
 * 强制代理的代理类
 * @author gong_pibao
 */
public class GamePlayerProxy implements IGamePlayer{
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
	//代理的代理者暂时没有，就是自己
	@Override
	public IGamePlayer getProxy(){
		return this;
	}
}
