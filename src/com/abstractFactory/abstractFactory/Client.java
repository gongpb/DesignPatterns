package com.abstractFactory.abstractFactory;

/**
 * 抽象工厂模式
 * @author gong_pibao
 */
public class Client {
	public static void main(String[] args) {
		//定义两个工厂       产品基本1
		AbstractCreator creator1 = new Creator1();
		//产品基本2
		AbstractCreator creator2 = new Creator1();
		//产生A1 的对象
		AbstractProductA a1 = creator1.createProductA();
		//产生A2 的对象
		AbstractProductA a2 = creator2.createProductA();
		//产生B1 的对象
		AbstractProductB B1 = creator1.createProductB();
		//产生B2 的对象
		AbstractProductB b2 = creator2.createProductB();
		//----------开始生产产品--------
		System.out.println("----产品A----");
		a1.shareMethod();
		a1.doSomething();
		System.out.println("\n----产品B----");
		a1.shareMethod();
		a1.doSomething();
	}
}
