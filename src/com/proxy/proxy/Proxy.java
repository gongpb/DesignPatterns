package com.proxy.proxy;

public class Proxy implements Subject{
	//要代理那个实现类
	private Subject subject;
	//默认被代理者
	public Proxy(Subject subject){
		this.subject = subject;
	}
	@Override
	public void request() {
		this.subject.request();
	}
	//通过构造方法传递代理者
	public Proxy(Object...objects){
		
	}
	//预处理
	public void before(){
		//do something
	}
	//后期处理
	public void after(){
		//do something
	}
}
