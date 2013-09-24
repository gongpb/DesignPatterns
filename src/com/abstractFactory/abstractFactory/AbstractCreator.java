package com.abstractFactory.abstractFactory;
/**
 * 抽象工厂类
 * 职责是定义每个工厂要实现的职能
 * @author gong_pibao
 */
public abstract class AbstractCreator {
	//创建产品1家族
	public abstract AbstractProductA createProductA();
	//创建产品2家族
	public abstract AbstractProductB createProductB();
}
