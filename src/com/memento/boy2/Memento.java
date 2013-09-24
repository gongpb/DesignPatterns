package com.memento.boy2;

public class Memento {
	//男孩的状态
	private String state = "";
	//通过构造方法传递状态
	public Memento(String state){
		this.state = state ;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}
