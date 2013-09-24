package com.abserver.updateHanFeiZi;

/**
 * 通过聚集方式的被观察者
 * @author gong_pibao
 */
public class HanFeiZi implements IHanFeiZi{
	private ILiSi liSi = new LiSi();
	//韩非子要吃饭了
	@Override
	public void haveBreakfast() {
		System.out.println("韩非子：开始吃饭了----");
		this.liSi.update("韩非子在吃饭了");
	}
	//韩非子开始娱乐了
	@Override
	public void haveFun() {
		System.out.println("韩非子：开始娱乐了----");
		this.liSi.update("韩非子开始娱乐了");
	}
}
