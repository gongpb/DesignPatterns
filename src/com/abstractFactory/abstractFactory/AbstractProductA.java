package com.abstractFactory.abstractFactory;
/**
 * 抽象产品类
 * @author gong_pibao
 */
public abstract class AbstractProductA {
	//每个产品共有的方法
	public void shareMethod(){
		System.out.println("每个产品--A--共同的方法");
	}
	//每个产品相同方法，不同实现
	public abstract void doSomething();
}
