package com.bridge.company;
/**
 * ���ز���˾
 * @author gong_pibao
 */
public class HouseCorp extends Corp {

	@Override
	protected void produce() {
		System.out.println("���ز���˾�Ƿ���......");
	}

	@Override
	protected void sell() {
		System.out.println("���ز���˾���۷���......");
	}
	
	@Override
	public void makeMoney() {
		
		super.makeMoney();
		System.out.println("���ز���˾׬Ǯ��......");
	}
	
}
