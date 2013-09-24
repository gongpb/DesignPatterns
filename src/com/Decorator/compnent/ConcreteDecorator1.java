package com.Decorator.compnent;
/**
 * 具体的装饰类1
 * @author gong_pibao
 */
public class ConcreteDecorator1 extends Decorator{

	public ConcreteDecorator1(Component comp) {
		super(comp);
	}
	public void method1(){
		System.out.println("method1 装饰1------");
	}
	@Override
	public void operate() {
		this.method1();
		super.operate();
	}
}
