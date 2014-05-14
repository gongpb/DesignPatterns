package com.vositor.vositor;
/**
 * 具体访问者
 * @author gong_pibao
 */
public class Visitor implements IVisitor{
	//访问el1 元素
	@Override
	public void visit(ConcreteElement1 el1) {
		el1.doSomething();
	}
	//访问el2 元素
	@Override
	public void visit(ConcreteElement2 el2) {
		el2.doSomething();
	}

}
