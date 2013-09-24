package com.template.template;
/**
 * 模板方法模式
 * @author gong_pibao
 */
public class Client {
	public static void main(String[] args) {
		AbstractClass class1 = new ConcreteClass1();
		AbstractClass class2 = new ConcreteClass2();
		class1.templateMethod();
		class2.templateMethod();
	}
}
