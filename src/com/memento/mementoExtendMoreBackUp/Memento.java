package com.memento.mementoExtendMoreBackUp;
/**
 * 备忘录角色
 * @author gong_pibao
 */
public class Memento {
	//发起人的内部状态
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
