package com.singleton.emperor;

public class Emperor {
	private static final Emperor emperor = new Emperor(); //初始化一个皇帝
	private Emperor(){
		//目的是不产生第二个皇帝
	}
	public static Emperor getInstance(){
		return emperor;
	}
	//皇帝说话了
	public static void say(){
		System.out.println("我是皇帝某某...........");
	}
}
