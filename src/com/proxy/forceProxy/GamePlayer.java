package com.proxy.forceProxy;

/**
 * 强制代理的真实角色
 * @author gong_pibao
 */
public class GamePlayer implements IGamePlayer{
	private String name = "";
	private IGamePlayer proxy = null;
	
	//通过构造方法传递名称
	public GamePlayer(String name){
		this.name = name;
	}
	
	//找到自己的代理
	@Override
	public IGamePlayer getProxy(){
		this.proxy = new GamePlayerProxy(this);
		return this.proxy;
	}
	
	//打怪
	@Override
	public void killBoss() {
		if(this.isProxy()){
			System.out.println(this.name+"  在打怪！");
		} else {
			System.out.println("请使用指定的代理访问！");
		}
	}
	
	//登录
	@Override
	public void login(String user, String password) {
		if(this.isProxy()){
			System.out.println("登录名为    "+user+" 的用户     "+this.name+"  登录成功");
		} else {
			System.out.println("请使用指定的代理访问 ！");
		}
	}
	
	//升级
	@Override
	public void upgrade() {
		if(this.isProxy()){
			System.out.println(this.name+"  又升了一级 ! ");
		} else {
			System.out.println("请使用指定的代理访问！");
		}
	}
	//验证是否是代理访问
	public boolean isProxy(){
		if(this.proxy==null){
			return false;
		} else {
			return true;
		}
	}
}
