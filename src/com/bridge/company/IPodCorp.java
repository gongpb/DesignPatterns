package com.bridge.company;

public class IPodCorp extends Corp {

	@Override
	protected void produce() {
		System.out.println("������IPod......");
	}

	@Override
	protected void sell() {
		System.out.println("IPod����......");
	}
	@Override
	public void makeMoney() {
		
		super.makeMoney();
		System.out.println("��׬Ǯ��......");
	}
	

}
