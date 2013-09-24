package com.memento.boy3;

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
	//保留一个备份
	public Memento createMemento(){
		return new Memento(this.state);
	}
	//恢复一个备份
	public void restoreMemento(Memento memento){
		this.setState(memento.getState());
	}
}
