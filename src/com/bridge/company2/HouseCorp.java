package com.bridge.company2;

public class HouseCorp extends Corp{
	//����һ��House��Ʒ����
	public HouseCorp(House house) {
		super(house);
	}
	@Override
	public void makeMoney() {
		super.makeMoney();
		System.out.println("���ز���˾׬��Ǯ��...");
	}

}
