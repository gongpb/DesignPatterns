package com.Decorator.compnent;

public abstract class Decorator extends Component{
	private Component comp;
	//ͨ�����췽�����ݱ�װ����
	public Decorator(Component comp){
		this.comp = comp;
	}
	//ί�и���װ����ִ��
	@Override
	public void operate() {
		this.comp.operate();
	}
}
