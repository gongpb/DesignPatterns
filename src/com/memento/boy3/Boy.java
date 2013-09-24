package com.memento.boy3;

public class Boy {
	private String state = "";
	//��ʶŮ��֮��״̬�ı�
	public void changeState() {
		this.state = "������ܺܲ���";
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	//����һ������
	public Memento createMemento(){
		return new Memento(this.state);
	}
	//�ָ�һ������
	public void restoreMemento(Memento memento){
		this.setState(memento.getState());
	}
}
