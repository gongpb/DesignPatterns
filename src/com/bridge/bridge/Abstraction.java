package com.bridge.bridge;

public abstract class Abstraction {
	//�����ʵ�ֻ���ɫ������
	private Implementor imp;
	//Լ���������ʵ�� �ù��췽��
	public Abstraction(Implementor imp){
		this.imp = imp ;
	}
	//�������Ϊ������
	public void request(){
		this.imp.doSomething();
	}
	//���ʵ�ֻ���ɫ
	public Implementor getImp() {
		return imp;
	}
	
}
