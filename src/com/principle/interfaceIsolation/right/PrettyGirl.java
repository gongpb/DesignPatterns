package com.principle.interfaceIsolation.right;

public class PrettyGirl implements IGoodBodyGirl, IGreatTemperamentGirl {
	private String name;
	
	public PrettyGirl(String name) {
		this.name = name;
	}
	@Override
	public void goodLooking() {
		System.out.println("脸蛋漂亮");
	}

	@Override
	public void niceFigure() {
		System.out.println("身材好");
	}

	@Override
	public void greatTemperament() {
		 System.out.println("气质好");
	}

}
