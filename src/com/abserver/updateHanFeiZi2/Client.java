package com.abserver.updateHanFeiZi2;

public class Client {
	public static void main(String[] args) throws InterruptedException {
		//定义观察者
		Observer obama = new Obama();
		Observer pujing = new PuJing();
		
		//定义被观察者，韩非子
		XiJinPing xiaoXi = new XiJinPing();
		
		//我们后人描述历史，根据场景，没有三个人在观察韩非子
		xiaoXi.addObserver(obama);
		xiaoXi.addObserver(pujing);
		
		//看看韩非子在干什么
		xiaoXi.haveBreakfast();
		xiaoXi.haveFun();
	}
}
