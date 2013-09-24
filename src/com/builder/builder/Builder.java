package com.builder.builder;

/**
 * 抽象构造者
 * @author gong_pibao
 */
public abstract class Builder {
	//设置产品不同部分，以获得不同的产品
	public abstract void setPart();
	//建造产品
	public abstract Product buildProduct();
}
