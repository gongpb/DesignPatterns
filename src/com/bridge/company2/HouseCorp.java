package com.bridge.company2;

public class HouseCorp extends Corp{
	//定义一个House产品进来
	public HouseCorp(House house) {
		super(house);
	}
	@Override
	public void makeMoney() {
		super.makeMoney();
		System.out.println("房地产公司赚大钱了...");
	}

}
