package com.principle.interfaceIsolation.error;

public class PrettyGirl implements IPrettyGirl {
	private String name;
	
	public PrettyGirl(String name) {
		this.name = name;
	}
	@Override
	public void goodLooking() {
		System.out.println("����Ư��");
	}

	@Override
	public void niceFigure() {
		System.out.println("��ĺ�");
	}

	@Override
	public void greatTemperament() {
		System.out.println("���ʼ�");
	}

}
