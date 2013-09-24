package com.builder.builder;
/**
 * 导演类
 * 负责已有模块的顺序然后告诉Builder开始建造
 * 通常它是一个组合或继承(如模板方法模式)产生的类
 * @author gong_pibao
 *
 */
public class Director {
	private Builder builder = new ConcreteProduct();
	
	//构建不同的产品
	public  Product getAProduct(){
		this.builder.setPart();
		//设置不同的零件，生产不同的产品
		
		return this.builder.buildProduct();
	}
}
