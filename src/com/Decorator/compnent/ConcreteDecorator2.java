package com.Decorator.compnent;

/**
 * �����װ����2
 * @author gong_pibao
 */
public class ConcreteDecorator2 extends Decorator{

	public ConcreteDecorator2(Component comp) {
		super(comp);
	}
	public void method2(){
		System.out.println("method2 װ��2------------------");
	}
	@Override
	public void operate() {
		super.operate();
		this.method2();
	}

}
