package com.bridge.company;

public class IPodCorp extends Corp {

	@Override
	protected void produce() {
		System.out.println("我生产IPod......");
	}

	@Override
	protected void sell() {
		System.out.println("IPod畅销......");
	}
	@Override
	public void makeMoney() {
		
		super.makeMoney();
		System.out.println("我赚钱了......");
	}
	

}
