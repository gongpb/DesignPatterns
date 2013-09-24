package com.abstractFactory.abstractFactory;

/**
 * 产品等级1的实现类
 * @author gong_pibao
 */
public class Creator1 extends AbstractCreator{
	//只生产产品等级为1 的A产品
	@Override
	public AbstractProductA createProductA() {
		return new ProductA1();
	}
	//只生产产品等级为1 的B产品
	@Override
	public AbstractProductB createProductB() {
		return new ProductB1();
	}
	
}
