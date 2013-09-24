package com.vositor.vositor;
/**
 * 抽象访问者
 * 声明访问者可以访问那些元素，具体到程序中就是visit方法的参数定义那些对象可以被访问
 * @author gong_pibao
 */
public interface IVisitor {
	//可以访问那些对象
	public void visit(ConcreteElement1 el1);
	public void visit(ConcreteElement2 el2);
}
