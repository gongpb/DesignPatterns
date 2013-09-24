package com.vositor.vositor;
/**
 * 具体元素2 实现accept方法，通常是visitor.visit(this); 基本上都形成一种模式了
 * @author gong_pibao
 */
public class ConcreteElement2 extends Element{
	//完成业务逻辑
	@Override
	public void doSomething() {
		System.out.println("业务2......");
	}
	//允许访问者访问
	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

}
