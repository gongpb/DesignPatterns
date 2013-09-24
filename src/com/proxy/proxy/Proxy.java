package com.proxy.proxy;

public class Proxy implements Subject{
	//Ҫ�����Ǹ�ʵ����
	private Subject subject;
	//Ĭ�ϱ�������
	public Proxy(Subject subject){
		this.subject = subject;
	}
	@Override
	public void request() {
		this.subject.request();
	}
	//ͨ�����췽�����ݴ�����
	public Proxy(Object...objects){
		
	}
	//Ԥ����
	public void before(){
		//do something
	}
	//���ڴ���
	public void after(){
		//do something
	}
}
