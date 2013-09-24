package com.abstractFactory.abstractFactory;
/**
 * 产品等级1的实现类
 * @author gong_pibao
 */
public class Creator2 extends AbstractCreator{
	//只生产产品等级为2的A产品
	@Override
	public AbstractProductA createProductA() {
		return new ProductA2();
	}
	//只生产产品基本为2 的B产品
	@Override
	public AbstractProductB createProductB() {
		return new ProductB2();
	}

}
