package com.abserver.updateHanFeiZi2;

public class Client {
	public static void main(String[] args) throws InterruptedException {
		//定义观察者
		Observer liSi = new LiSi();
		Observer wangSi = new WangSi();
		
		//定义被观察者，韩非子
		HanFeiZi hanFeiZi = new HanFeiZi();
		
		//我们后人描述历史，根据场景，没有三个人在观察韩非子
		hanFeiZi.addObserver(liSi);
		hanFeiZi.addObserver(wangSi);
		
		//看看韩非子在干什么
		hanFeiZi.haveBreakfast();
		hanFeiZi.haveFun();
	}
}
