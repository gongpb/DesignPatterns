package com.principle.interfaceIsolation.right;

public class PrettyGirl implements IGoodBodyGirl, IGreatTemperamentGirl {
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
		 System.out.println("���ʺ�");
	}

}
