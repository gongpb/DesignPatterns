package com.proxy.commonProxy;

public class Client {
	public static void main(String[] args) {
		//定义一个代练者
		IGamePlayer proxy = new GamePlayerProxy("张三");
		//开始打游戏，记下时间戳
		System.out.println("开始时间 ：2001-12-01 10:30:00");
		proxy.login("zhangsan", "123");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println("结束时间 ：2001-12-10 12:50:00");
	}
}
