package com.abserver.hanFeiZi;

public class Client {
	public static void main(String[] args) throws InterruptedException {
		LiSi liSi = new LiSi();
		HanFeiZi hanFeiZi = new HanFeiZi();
		//观察早餐
		Spy spyBreakfast = new Spy(hanFeiZi, liSi, "breakfast");
		//开动线程，监控
		spyBreakfast.start();
		//观察娱乐情况
		Spy spyFun = new Spy(hanFeiZi, liSi, "fun");
		//开动线程，监控
		spyFun.start();
		
		Thread.sleep(1000); //主线程待1秒之后再往下执行
		hanFeiZi.haveBreakfast();
		//韩非子开始娱乐
		Thread.sleep(1000); //主线程待1秒之后再往下执行
		hanFeiZi.haveFun();
	}

}
