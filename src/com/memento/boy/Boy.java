package com.memento.boy;

public class Boy {
	private String state = "";
	//认识女孩之后状态改变
	public void changeState() {
		this.state = "心情可能很不好";
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
