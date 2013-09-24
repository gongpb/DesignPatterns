package com.memento.memento;
/**
 * �����˽�ɫ
 * @author gong_pibao
 */
public class Originator {
	//�ڲ�״̬
	private String state = "";

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	//����һ������¼
	public Memento createMemento(){
		return new Memento(this.state);
	}
	//�ָ�һ������¼
	public void restoreMemento(Memento memento){
		this.setState(memento.getState());
	}
	
}
