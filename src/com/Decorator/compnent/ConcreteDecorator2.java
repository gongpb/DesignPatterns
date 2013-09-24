package com.Decorator.compnent;

/**
 * 具体的装饰类2
 * @author gong_pibao
 */
public class ConcreteDecorator2 extends Decorator{

	public ConcreteDecorator2(Component comp) {
		super(comp);
	}
	public void method2(){
		System.out.println("method2 装饰2------------------");
	}
	@Override
	public void operate() {
		super.operate();
		this.method2();
	}

}
