package com.Decorator.compnent;
/**
 * װ����ģʽ
 * @author gong_pibao
 */
public class Client {
	public static void main(String [] args){
		Component comp;
		comp = new ConcreteComponent();
		comp = new ConcreteDecorator1(comp);
		comp = new ConcreteDecorator2(comp);
		comp.operate();
	}
}
