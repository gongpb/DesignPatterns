package com.builder.builder;

/**
 * 具体构造着，如果多个产品类，就会有几个具体的建造者，
 * 而这多个产品类具有相同的接口或抽象类
 * @author gong_pibao
 */
public class ConcreteProduct extends Builder{
	Product product = new Product();
	/**
	 * 组建一个产品
	 */
	@Override
	public Product buildProduct() {
		
		return product;
	}
	/**
	 * 设置产品零部件
	 */
	@Override
	public void setPart() {
		//产品类内的业务处理
		
	}

}
