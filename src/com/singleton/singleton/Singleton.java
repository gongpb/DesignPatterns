package com.singleton.singleton;

/**
 * 单例模式的通用代码
 * @author gong_pibao
 */
public class Singleton {
	private static final Singleton singleton = new Singleton();
	
	private Singleton(){
		
	}
	public static Singleton getInstance(){
		return singleton;
	}
	//类中的其他方法，尽量是static的
	public static void doSomething(){
		
	}
}
