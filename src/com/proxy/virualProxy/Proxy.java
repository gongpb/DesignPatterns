package com.proxy.virualProxy;

/**
 * 虚拟代理
 * 在需要的时候才初始化主题对象，可以避免被代理对象校对引起的初始化缓慢的问题
 * 缺点是：需要在每个方法中判断主题对象是否被创建
 * @author gong_pibao
 */
public class Proxy implements Subject{
	//要代理那个实现类
	private Subject subject;
	//默认被代理者
	public Proxy(Subject subject){
		this.subject = subject;
	}
	//实现接口中定义的方法
	@Override
	public void request() {
		//判断一下真实主题是否初始化
		if(subject ==null){
			this.subject = new RealSubject();
		}
		this.subject.request();
	}
}
