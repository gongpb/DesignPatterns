package com.memento.mementoExtendMoreBackUp;
/**
 * ����¼��ɫ
 * @author gong_pibao
 */
public class Memento {
	//�����˵��ڲ�״̬
	private String state = "";
	//ͨ�����췽������״̬
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
