package com.proxy.dynamicProxy.game;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
	public static void main(String[] args) {
		//定义一个痴迷的玩家
		IGamePlayer gamePlayer = new GamePlayer("张三");
		//定义一个代练者
		InvocationHandler handler = new GamePlayIH(gamePlayer);
		//开始打游戏，记下时间戳
		System.out.println("开始时间 ：2001-12-01 10:30:00");
		//获取Class loader
		ClassLoader cl = gamePlayer.getClass().getClassLoader();
		//动态产生一个代理者，重新生成一个对象
		IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, new Class []{IGamePlayer.class}, handler);
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
