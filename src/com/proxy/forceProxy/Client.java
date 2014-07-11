package com.proxy.forceProxy;

public class Client {
	/**
	 * 直接访问真实角色
	 */
//	public static void main(String[] args) {
//		//定义一个痴迷的玩家
//		IGamePlayer gamePlayer = new GamePlayer("张三");
//		//开始打游戏，记下时间戳
//		System.out.println("开始时间 ：2001-12-01 10:30:00");
//		gamePlayer.login("zhangsan", "123");
//		gamePlayer.killBoss();
//		gamePlayer.upgrade();
//		System.out.println("结束时间 ：2001-12-10 12:50:00");
//	}
	/**
	 * 直接访问真实代理类
	 */
//	public static void main(String[] args) {
//		//定义一个痴迷的玩家
//		IGamePlayer gamePlayer = new GamePlayer("张三");
//		//定义一个代练者 ，代理对象是自己new出来的，真实对象不认识
//		IGamePlayer proxy = new GamePlayerProxy(gamePlayer);
//		//开始打游戏，记下时间戳
//		System.out.println("开始时间 ：2001-12-01 10:30:00");
//		proxy.login("zhangsan", "123");
//		proxy.killBoss();
//		proxy.upgrade();
//		System.out.println("结束时间 ：2001-12-10 12:50:00");
//	}
	/**
	 * 强制代理场景
	 */
	public static void main(String[] args) {
		//定义一个游戏的角色
		IGamePlayer gamePlayer = new GamePlayer("张三");
		//获得指定的代理
		IGamePlayer proxy = gamePlayer.getProxy();
		//开始打游戏，记下时间戳
		System.out.println("开始时间 ：2001-12-01 10:30:00");
		proxy.login("zhangsan", "123");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println("结束时间 ：2001-12-10 12:50:00");
	}
}
