package com.proxy.gamePlayer;

public class Client {
	public static void main(String[] args) {
		//定义一个痴迷的玩家
		IGamePlayer gamePlayer = new GamePlayer("张三");
		//定义一个代练者
		IGamePlayer proxy = new GamePlayerProxy(gamePlayer);
		//开始打游戏，记下时间戳
		System.out.println("开始时间 ：2001-12-01 10:30:00");
		//登录
		proxy.login("zhangsan", "123");
		//开始杀怪
		proxy.killBoss();
		//升级
		proxy.upgrade();
		//结束时间
		System.out.println("结束时间 ：2001-12-10 12:50:00");
	}
}
