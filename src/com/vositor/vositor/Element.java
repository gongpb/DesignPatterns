package com.vositor.vositor;
/**
 * 抽象元素
 * 声明有哪一类访问者访问，程序中通过accept方法的参数来定义的
 * @author gong_pibao
 */
public abstract class Element {
	//定义业务逻辑
	public abstract void doSomething();
	//允许访问者访问
	public abstract void accept(IVisitor visitor);
}
